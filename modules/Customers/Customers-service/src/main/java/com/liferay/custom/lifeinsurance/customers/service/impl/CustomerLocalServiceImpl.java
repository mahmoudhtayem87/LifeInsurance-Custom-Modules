/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.custom.lifeinsurance.customers.service.impl;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.custom.lifeinsurance.customers.model.Customer;
import com.liferay.custom.lifeinsurance.customers.service.base.CustomerLocalServiceBaseImpl;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Contact;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Phone;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.*;

import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.custom.lifeinsurance.customers.model.Customer",
	service = AopService.class
)
public class CustomerLocalServiceImpl extends CustomerLocalServiceBaseImpl {
	public Customer addCustomer(String firstName, String middleName , String lastName,
								 String email, String phoneNumber,String DOB,String roleId, String createdBy,String GroupId,
								 ServiceContext serviceContext) throws PortalException, ParseException, InterruptedException {
		try
		{
			System.out.println("service context");
			System.out.println(serviceContext);
			User user = UserLocalServiceUtil.getUser(Long.valueOf(createdBy));
			Group group = groupLocalService.getGroup(user.getGroupId());
			System.out.println("company Id"+ serviceContext.getCompanyId());
			System.out.println("group Id"+ serviceContext.getScopeGroupId());
			ServiceContext _serviceContext = new ServiceContext();
			_serviceContext.setCompanyId(serviceContext.getCompanyId());
			_serviceContext.setScopeGroupId(serviceContext.getScopeGroupId());
			// Generate primary key for the assignment.
			long customerId = CounterLocalServiceUtil.increment(Customer.class.getName());
			Customer customer = createCustomer(customerId);
			long[] roles = new long[1];
			long[] groups = new long[1];
			groups[0] = Long.valueOf(GroupId);
			roles[0] = Long.valueOf(roleId);

			long companyId = group.getCompanyId();
			long userID =_counterLocalService.increment();

			long adminUserId =  _companyLocalService
					.getCompany(companyId)
					.getDefaultUser()
					.getUserId();
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			Date dateOfBirth = df.parse(DOB);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(dateOfBirth);
			Integer dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
			Integer monthOfYear = calendar.get(Calendar.MONTH);
			Integer year = calendar.get(Calendar.YEAR);
			System.out.println("adding user");
			System.out.println(LocaleUtil.getDefault());
			System.out.println("adding user");

			User newUser = UserLocalServiceUtil.addUser(
					adminUserId /* long creatorUserId */,
					companyId /* long companyId */,
					false /* boolean autoPassword */,
					"liferay" /* String password1 */,
					"liferay" /* String password2 */,
					false /* boolean autoScreenName */,
					"User_" + userID /* String screenName */,
					email /* String emailAddress */,
					LocaleUtil.getDefault() /* Locale Locale */,
					firstName /* String firstName */,
					middleName/* String middleName */,
					lastName /* String lastName */,
					0L /* int prefixId */,
					0L /* int suffixId */,
					true /* boolean male */,
					monthOfYear /* int birthdayMonth */,
					dayOfMonth /* int birthdayDay */,
					year /* int birthdayYear */,
					StringPool.BLANK /*String jobTitle */,
					groups /* long[] groupIds */,
					new long[0] /* long[] organizationIds */,
					roles /* long[] roleIds */,
					new long[0]/* long[] userGroupIds */,
					false /* boolean sendEmail */,
					_serviceContext /* ServiceContext ServiceContext */);
			System.out.println("User has been created, New user ID is: "+ user.getUserId());
			Thread.sleep(100);
			/*newUser.setStatus(WorkflowConstants.STATUS_APPROVED);
			newUser.setAgreedToTermsOfUse(true);
			newUser.setNew(true);
			_userLocalService.updateUser(newUser);*/
			customer.setFirstName(firstName);
			customer.setMiddleName(middleName);
			customer.setLastName(lastName);
			customer.setEmail(email);
			customer.setPhoneNumber(phoneNumber);
			customer.setCustomerUserId(user.getUserId());

			return super.addCustomer(customer);

		}catch (Exception e)
		{
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			pw.flush();
			System.out.println(sw.toString());
		}
		return null;
	}
	@Reference
	private CompanyLocalService _companyLocalService;

	@Reference
	private UserLocalService _userLocalService;

	@Reference
	private CounterLocalService _counterLocalService;

}