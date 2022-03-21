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

package com.liferay.custom.lifeinsurance.quotations.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QuotationService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuotationService
 * @generated
 */
public class QuotationServiceWrapper
	implements QuotationService, ServiceWrapper<QuotationService> {

	public QuotationServiceWrapper(QuotationService quotationService) {
		_quotationService = quotationService;
	}

	@Override
	public com.liferay.custom.lifeinsurance.quotations.model.Quotation
			addQuotation(
				String createdBy, String groupId, String quotationType,
				String quotationData, String quotationAmount, String customerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quotationService.addQuotation(
			createdBy, groupId, quotationType, quotationData, quotationAmount,
			customerId);
	}

	@Override
	public void deleteAllQuotations() {
		_quotationService.deleteAllQuotations();
	}

	@Override
	public java.util.List
		<com.liferay.custom.lifeinsurance.quotations.model.Quotation>
			getAllQuotations() {

		return _quotationService.getAllQuotations();
	}

	@Override
	public java.util.List
		<com.liferay.custom.lifeinsurance.quotations.model.Quotation>
			getCustomerQuotations(long customerId) {

		return _quotationService.getCustomerQuotations(customerId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quotationService.getOSGiServiceIdentifier();
	}

	@Override
	public QuotationService getWrappedService() {
		return _quotationService;
	}

	@Override
	public void setWrappedService(QuotationService quotationService) {
		_quotationService = quotationService;
	}

	private QuotationService _quotationService;

}