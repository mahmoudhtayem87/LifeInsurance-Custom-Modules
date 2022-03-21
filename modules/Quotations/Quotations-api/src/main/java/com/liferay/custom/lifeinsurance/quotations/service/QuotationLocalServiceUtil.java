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
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Quotation. This utility wraps
 * <code>com.liferay.custom.lifeinsurance.quotations.service.impl.QuotationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see QuotationLocalService
 * @generated
 */
public class QuotationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.custom.lifeinsurance.quotations.service.impl.QuotationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the quotation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuotationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quotation the quotation
	 * @return the quotation that was added
	 */
	public static Quotation addQuotation(Quotation quotation) {
		return getService().addQuotation(quotation);
	}

	public static Quotation addQuotation(
			String createdBy, String groupId, String quotationType,
			String quotationData, String quotationAmount, String customerId)
		throws PortalException {

		return getService().addQuotation(
			createdBy, groupId, quotationType, quotationData, quotationAmount,
			customerId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new quotation with the primary key. Does not add the quotation to the database.
	 *
	 * @param quotationId the primary key for the new quotation
	 * @return the new quotation
	 */
	public static Quotation createQuotation(long quotationId) {
		return getService().createQuotation(quotationId);
	}

	public static void deleteAllQuotations() {
		getService().deleteAllQuotations();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the quotation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuotationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quotationId the primary key of the quotation
	 * @return the quotation that was removed
	 * @throws PortalException if a quotation with the primary key could not be found
	 */
	public static Quotation deleteQuotation(long quotationId)
		throws PortalException {

		return getService().deleteQuotation(quotationId);
	}

	/**
	 * Deletes the quotation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuotationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quotation the quotation
	 * @return the quotation that was removed
	 */
	public static Quotation deleteQuotation(Quotation quotation) {
		return getService().deleteQuotation(quotation);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.custom.lifeinsurance.quotations.model.impl.QuotationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.custom.lifeinsurance.quotations.model.impl.QuotationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Quotation fetchQuotation(long quotationId) {
		return getService().fetchQuotation(quotationId);
	}

	/**
	 * Returns the quotation matching the UUID and group.
	 *
	 * @param uuid the quotation's UUID
	 * @param groupId the primary key of the group
	 * @return the matching quotation, or <code>null</code> if a matching quotation could not be found
	 */
	public static Quotation fetchQuotationByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchQuotationByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<Quotation> getAllQuotations() {
		return getService().getAllQuotations();
	}

	public static List<Quotation> getCustomerQuotations(long customerId) {
		return getService().getCustomerQuotations(customerId);
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the quotation with the primary key.
	 *
	 * @param quotationId the primary key of the quotation
	 * @return the quotation
	 * @throws PortalException if a quotation with the primary key could not be found
	 */
	public static Quotation getQuotation(long quotationId)
		throws PortalException {

		return getService().getQuotation(quotationId);
	}

	/**
	 * Returns the quotation matching the UUID and group.
	 *
	 * @param uuid the quotation's UUID
	 * @param groupId the primary key of the group
	 * @return the matching quotation
	 * @throws PortalException if a matching quotation could not be found
	 */
	public static Quotation getQuotationByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getQuotationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the quotations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.custom.lifeinsurance.quotations.model.impl.QuotationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quotations
	 * @param end the upper bound of the range of quotations (not inclusive)
	 * @return the range of quotations
	 */
	public static List<Quotation> getQuotations(int start, int end) {
		return getService().getQuotations(start, end);
	}

	/**
	 * Returns all the quotations matching the UUID and company.
	 *
	 * @param uuid the UUID of the quotations
	 * @param companyId the primary key of the company
	 * @return the matching quotations, or an empty list if no matches were found
	 */
	public static List<Quotation> getQuotationsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getQuotationsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of quotations matching the UUID and company.
	 *
	 * @param uuid the UUID of the quotations
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of quotations
	 * @param end the upper bound of the range of quotations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching quotations, or an empty list if no matches were found
	 */
	public static List<Quotation> getQuotationsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Quotation> orderByComparator) {

		return getService().getQuotationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of quotations.
	 *
	 * @return the number of quotations
	 */
	public static int getQuotationsCount() {
		return getService().getQuotationsCount();
	}

	/**
	 * Updates the quotation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuotationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quotation the quotation
	 * @return the quotation that was updated
	 */
	public static Quotation updateQuotation(Quotation quotation) {
		return getService().updateQuotation(quotation);
	}

	public static QuotationLocalService getService() {
		return _service;
	}

	private static volatile QuotationLocalService _service;

}