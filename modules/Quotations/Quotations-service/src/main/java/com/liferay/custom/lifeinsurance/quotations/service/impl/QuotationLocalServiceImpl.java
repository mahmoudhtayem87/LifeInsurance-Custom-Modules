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

package com.liferay.custom.lifeinsurance.quotations.service.impl;

import com.liferay.custom.lifeinsurance.quotations.model.Quotation;
import com.liferay.custom.lifeinsurance.quotations.service.base.QuotationLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import org.osgi.service.component.annotations.Component;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

/**
 * @author Mahmoud Hussein Tayem
 */
@Component(
	property = "model.class.name=com.liferay.custom.lifeinsurance.quotations.model.Quotation",
	service = AopService.class
)
public class QuotationLocalServiceImpl extends QuotationLocalServiceBaseImpl {
	public Quotation addQuotation(String createdBy,String groupId,String quotationType, String quotationData,String quotationAmount,String customerId) throws PortalException {
		User user = userLocalService.getUser(Long.valueOf(createdBy));
		Group group = groupLocalService.getGroup(user.getGroupId());
		// Generate primary key for the assignment.
		long quotationId = counterLocalService.increment(Quotation.class.getName());
		Quotation quotation = createQuotation(quotationId);
		quotation.setUserName(user.getScreenName());
		quotation.setUserId(Long.valueOf(createdBy));
		quotation.setCreateDate(Timestamp.from(Instant.now()));
		quotation.setModifiedDate(Timestamp.from(Instant.now()));
		quotation.setQuotationData(quotationData);
		quotation.setQuotationAmount(Double.valueOf(quotationAmount).longValue());
		quotation.setQuotationType(quotationType);
		quotation.setCustomerId(Long.valueOf(customerId));
		return super.addQuotation(quotation);
	}
	public List<Quotation> getAllQuotations()
	{
		return quotationPersistence.findAll();
	}
	public List<Quotation> getCustomerQuotations(long customerId)
	{
		return quotationPersistence.findByCustomerId(customerId);
	}
	public void deleteAllQuotations()
	{
		quotationPersistence.removeAll();
	}
}