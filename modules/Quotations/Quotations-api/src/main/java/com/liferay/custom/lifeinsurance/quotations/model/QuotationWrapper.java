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

package com.liferay.custom.lifeinsurance.quotations.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Quotation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Quotation
 * @generated
 */
public class QuotationWrapper
	extends BaseModelWrapper<Quotation>
	implements ModelWrapper<Quotation>, Quotation {

	public QuotationWrapper(Quotation quotation) {
		super(quotation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("quotationId", getQuotationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("customerId", getCustomerId());
		attributes.put("quotationAmount", getQuotationAmount());
		attributes.put("quotationData", getQuotationData());
		attributes.put("quotationType", getQuotationType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long quotationId = (Long)attributes.get("quotationId");

		if (quotationId != null) {
			setQuotationId(quotationId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long customerId = (Long)attributes.get("customerId");

		if (customerId != null) {
			setCustomerId(customerId);
		}

		Long quotationAmount = (Long)attributes.get("quotationAmount");

		if (quotationAmount != null) {
			setQuotationAmount(quotationAmount);
		}

		String quotationData = (String)attributes.get("quotationData");

		if (quotationData != null) {
			setQuotationData(quotationData);
		}

		String quotationType = (String)attributes.get("quotationType");

		if (quotationType != null) {
			setQuotationType(quotationType);
		}
	}

	@Override
	public Quotation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this quotation.
	 *
	 * @return the company ID of this quotation
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this quotation.
	 *
	 * @return the create date of this quotation
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the customer ID of this quotation.
	 *
	 * @return the customer ID of this quotation
	 */
	@Override
	public long getCustomerId() {
		return model.getCustomerId();
	}

	/**
	 * Returns the group ID of this quotation.
	 *
	 * @return the group ID of this quotation
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this quotation.
	 *
	 * @return the modified date of this quotation
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this quotation.
	 *
	 * @return the primary key of this quotation
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the quotation amount of this quotation.
	 *
	 * @return the quotation amount of this quotation
	 */
	@Override
	public long getQuotationAmount() {
		return model.getQuotationAmount();
	}

	/**
	 * Returns the quotation data of this quotation.
	 *
	 * @return the quotation data of this quotation
	 */
	@Override
	public String getQuotationData() {
		return model.getQuotationData();
	}

	/**
	 * Returns the quotation ID of this quotation.
	 *
	 * @return the quotation ID of this quotation
	 */
	@Override
	public long getQuotationId() {
		return model.getQuotationId();
	}

	/**
	 * Returns the quotation type of this quotation.
	 *
	 * @return the quotation type of this quotation
	 */
	@Override
	public String getQuotationType() {
		return model.getQuotationType();
	}

	/**
	 * Returns the user ID of this quotation.
	 *
	 * @return the user ID of this quotation
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this quotation.
	 *
	 * @return the user name of this quotation
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this quotation.
	 *
	 * @return the user uuid of this quotation
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this quotation.
	 *
	 * @return the uuid of this quotation
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this quotation.
	 *
	 * @param companyId the company ID of this quotation
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this quotation.
	 *
	 * @param createDate the create date of this quotation
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the customer ID of this quotation.
	 *
	 * @param customerId the customer ID of this quotation
	 */
	@Override
	public void setCustomerId(long customerId) {
		model.setCustomerId(customerId);
	}

	/**
	 * Sets the group ID of this quotation.
	 *
	 * @param groupId the group ID of this quotation
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this quotation.
	 *
	 * @param modifiedDate the modified date of this quotation
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this quotation.
	 *
	 * @param primaryKey the primary key of this quotation
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the quotation amount of this quotation.
	 *
	 * @param quotationAmount the quotation amount of this quotation
	 */
	@Override
	public void setQuotationAmount(long quotationAmount) {
		model.setQuotationAmount(quotationAmount);
	}

	/**
	 * Sets the quotation data of this quotation.
	 *
	 * @param quotationData the quotation data of this quotation
	 */
	@Override
	public void setQuotationData(String quotationData) {
		model.setQuotationData(quotationData);
	}

	/**
	 * Sets the quotation ID of this quotation.
	 *
	 * @param quotationId the quotation ID of this quotation
	 */
	@Override
	public void setQuotationId(long quotationId) {
		model.setQuotationId(quotationId);
	}

	/**
	 * Sets the quotation type of this quotation.
	 *
	 * @param quotationType the quotation type of this quotation
	 */
	@Override
	public void setQuotationType(String quotationType) {
		model.setQuotationType(quotationType);
	}

	/**
	 * Sets the user ID of this quotation.
	 *
	 * @param userId the user ID of this quotation
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this quotation.
	 *
	 * @param userName the user name of this quotation
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this quotation.
	 *
	 * @param userUuid the user uuid of this quotation
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this quotation.
	 *
	 * @param uuid the uuid of this quotation
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected QuotationWrapper wrap(Quotation quotation) {
		return new QuotationWrapper(quotation);
	}

}