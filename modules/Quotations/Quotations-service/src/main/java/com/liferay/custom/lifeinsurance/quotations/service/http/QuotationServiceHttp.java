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

package com.liferay.custom.lifeinsurance.quotations.service.http;

import com.liferay.custom.lifeinsurance.quotations.service.QuotationServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>QuotationServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuotationServiceSoap
 * @generated
 */
public class QuotationServiceHttp {

	public static com.liferay.custom.lifeinsurance.quotations.model.Quotation
			addQuotation(
				HttpPrincipal httpPrincipal, String createdBy, String groupId,
				String quotationType, String quotationData,
				String quotationAmount, String customerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				QuotationServiceUtil.class, "addQuotation",
				_addQuotationParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, createdBy, groupId, quotationType, quotationData,
				quotationAmount, customerId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.custom.lifeinsurance.quotations.model.Quotation)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<com.liferay.custom.lifeinsurance.quotations.model.Quotation>
			getAllQuotations(HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				QuotationServiceUtil.class, "getAllQuotations",
				_getAllQuotationsParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<com.liferay.custom.lifeinsurance.quotations.model.Quotation>)
					returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<com.liferay.custom.lifeinsurance.quotations.model.Quotation>
			getCustomerQuotations(
				HttpPrincipal httpPrincipal, long customerId) {

		try {
			MethodKey methodKey = new MethodKey(
				QuotationServiceUtil.class, "getCustomerQuotations",
				_getCustomerQuotationsParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, customerId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<com.liferay.custom.lifeinsurance.quotations.model.Quotation>)
					returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static void deleteAllQuotations(HttpPrincipal httpPrincipal) {
		try {
			MethodKey methodKey = new MethodKey(
				QuotationServiceUtil.class, "deleteAllQuotations",
				_deleteAllQuotationsParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(QuotationServiceHttp.class);

	private static final Class<?>[] _addQuotationParameterTypes0 = new Class[] {
		String.class, String.class, String.class, String.class, String.class,
		String.class
	};
	private static final Class<?>[] _getAllQuotationsParameterTypes1 =
		new Class[] {};
	private static final Class<?>[] _getCustomerQuotationsParameterTypes2 =
		new Class[] {long.class};
	private static final Class<?>[] _deleteAllQuotationsParameterTypes3 =
		new Class[] {};

}