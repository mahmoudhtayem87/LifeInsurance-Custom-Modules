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

import com.liferay.custom.lifeinsurance.quotations.model.Quotation;
import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

/**
 * Provides the remote service utility for Quotation. This utility wraps
 * <code>com.liferay.custom.lifeinsurance.quotations.service.impl.QuotationServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see QuotationService
 * @generated
 */
public class QuotationServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.custom.lifeinsurance.quotations.service.impl.QuotationServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Quotation addQuotation(
			String createdBy, String groupId, String quotationType,
			String quotationData, String quotationAmount, String customerId)
		throws PortalException {

		return getService().addQuotation(
			createdBy, groupId, quotationType, quotationData, quotationAmount,
			customerId);
	}

	public static void deleteAllQuotations() {
		getService().deleteAllQuotations();
	}

	public static List<Quotation> getAllQuotations() {
		return getService().getAllQuotations();
	}

	public static List<Quotation> getCustomerQuotations(long customerId) {
		return getService().getCustomerQuotations(customerId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static QuotationService getService() {
		return _service;
	}

	private static volatile QuotationService _service;

}