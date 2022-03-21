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

package com.liferay.custom.lifeinsurance.quotations.model.impl;

import com.liferay.custom.lifeinsurance.quotations.model.Quotation;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Quotation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QuotationCacheModel
	implements CacheModel<Quotation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof QuotationCacheModel)) {
			return false;
		}

		QuotationCacheModel quotationCacheModel = (QuotationCacheModel)object;

		if (quotationId == quotationCacheModel.quotationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, quotationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", quotationId=");
		sb.append(quotationId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", customerId=");
		sb.append(customerId);
		sb.append(", quotationAmount=");
		sb.append(quotationAmount);
		sb.append(", quotationData=");
		sb.append(quotationData);
		sb.append(", quotationType=");
		sb.append(quotationType);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Quotation toEntityModel() {
		QuotationImpl quotationImpl = new QuotationImpl();

		if (uuid == null) {
			quotationImpl.setUuid("");
		}
		else {
			quotationImpl.setUuid(uuid);
		}

		quotationImpl.setQuotationId(quotationId);
		quotationImpl.setGroupId(groupId);
		quotationImpl.setCompanyId(companyId);
		quotationImpl.setUserId(userId);

		if (userName == null) {
			quotationImpl.setUserName("");
		}
		else {
			quotationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			quotationImpl.setCreateDate(null);
		}
		else {
			quotationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			quotationImpl.setModifiedDate(null);
		}
		else {
			quotationImpl.setModifiedDate(new Date(modifiedDate));
		}

		quotationImpl.setCustomerId(customerId);
		quotationImpl.setQuotationAmount(quotationAmount);

		if (quotationData == null) {
			quotationImpl.setQuotationData("");
		}
		else {
			quotationImpl.setQuotationData(quotationData);
		}

		if (quotationType == null) {
			quotationImpl.setQuotationType("");
		}
		else {
			quotationImpl.setQuotationType(quotationType);
		}

		quotationImpl.resetOriginalValues();

		return quotationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		quotationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		customerId = objectInput.readLong();

		quotationAmount = objectInput.readLong();
		quotationData = objectInput.readUTF();
		quotationType = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(quotationId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(customerId);

		objectOutput.writeLong(quotationAmount);

		if (quotationData == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(quotationData);
		}

		if (quotationType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(quotationType);
		}
	}

	public String uuid;
	public long quotationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long customerId;
	public long quotationAmount;
	public String quotationData;
	public String quotationType;

}