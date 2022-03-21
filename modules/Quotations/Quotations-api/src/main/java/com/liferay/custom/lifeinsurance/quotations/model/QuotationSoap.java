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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.custom.lifeinsurance.quotations.service.http.QuotationServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class QuotationSoap implements Serializable {

	public static QuotationSoap toSoapModel(Quotation model) {
		QuotationSoap soapModel = new QuotationSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setQuotationId(model.getQuotationId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCustomerId(model.getCustomerId());
		soapModel.setQuotationAmount(model.getQuotationAmount());
		soapModel.setQuotationData(model.getQuotationData());
		soapModel.setQuotationType(model.getQuotationType());

		return soapModel;
	}

	public static QuotationSoap[] toSoapModels(Quotation[] models) {
		QuotationSoap[] soapModels = new QuotationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QuotationSoap[][] toSoapModels(Quotation[][] models) {
		QuotationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QuotationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QuotationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QuotationSoap[] toSoapModels(List<Quotation> models) {
		List<QuotationSoap> soapModels = new ArrayList<QuotationSoap>(
			models.size());

		for (Quotation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QuotationSoap[soapModels.size()]);
	}

	public QuotationSoap() {
	}

	public long getPrimaryKey() {
		return _quotationId;
	}

	public void setPrimaryKey(long pk) {
		setQuotationId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getQuotationId() {
		return _quotationId;
	}

	public void setQuotationId(long quotationId) {
		_quotationId = quotationId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getCustomerId() {
		return _customerId;
	}

	public void setCustomerId(long customerId) {
		_customerId = customerId;
	}

	public long getQuotationAmount() {
		return _quotationAmount;
	}

	public void setQuotationAmount(long quotationAmount) {
		_quotationAmount = quotationAmount;
	}

	public String getQuotationData() {
		return _quotationData;
	}

	public void setQuotationData(String quotationData) {
		_quotationData = quotationData;
	}

	public String getQuotationType() {
		return _quotationType;
	}

	public void setQuotationType(String quotationType) {
		_quotationType = quotationType;
	}

	private String _uuid;
	private long _quotationId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _customerId;
	private long _quotationAmount;
	private String _quotationData;
	private String _quotationType;

}