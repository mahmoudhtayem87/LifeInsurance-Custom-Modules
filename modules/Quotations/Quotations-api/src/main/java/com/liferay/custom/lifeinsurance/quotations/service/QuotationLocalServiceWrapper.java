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
 * Provides a wrapper for {@link QuotationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuotationLocalService
 * @generated
 */
public class QuotationLocalServiceWrapper
	implements QuotationLocalService, ServiceWrapper<QuotationLocalService> {

	public QuotationLocalServiceWrapper(
		QuotationLocalService quotationLocalService) {

		_quotationLocalService = quotationLocalService;
	}

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
	@Override
	public com.liferay.custom.lifeinsurance.quotations.model.Quotation
		addQuotation(
			com.liferay.custom.lifeinsurance.quotations.model.Quotation
				quotation) {

		return _quotationLocalService.addQuotation(quotation);
	}

	@Override
	public com.liferay.custom.lifeinsurance.quotations.model.Quotation
			addQuotation(
				String createdBy, String groupId, String quotationType,
				String quotationData, String quotationAmount, String customerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quotationLocalService.addQuotation(
			createdBy, groupId, quotationType, quotationData, quotationAmount,
			customerId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quotationLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new quotation with the primary key. Does not add the quotation to the database.
	 *
	 * @param quotationId the primary key for the new quotation
	 * @return the new quotation
	 */
	@Override
	public com.liferay.custom.lifeinsurance.quotations.model.Quotation
		createQuotation(long quotationId) {

		return _quotationLocalService.createQuotation(quotationId);
	}

	@Override
	public void deleteAllQuotations() {
		_quotationLocalService.deleteAllQuotations();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quotationLocalService.deletePersistedModel(persistedModel);
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
	@Override
	public com.liferay.custom.lifeinsurance.quotations.model.Quotation
			deleteQuotation(long quotationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quotationLocalService.deleteQuotation(quotationId);
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
	@Override
	public com.liferay.custom.lifeinsurance.quotations.model.Quotation
		deleteQuotation(
			com.liferay.custom.lifeinsurance.quotations.model.Quotation
				quotation) {

		return _quotationLocalService.deleteQuotation(quotation);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _quotationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _quotationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _quotationLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _quotationLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _quotationLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _quotationLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _quotationLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _quotationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.custom.lifeinsurance.quotations.model.Quotation
		fetchQuotation(long quotationId) {

		return _quotationLocalService.fetchQuotation(quotationId);
	}

	/**
	 * Returns the quotation matching the UUID and group.
	 *
	 * @param uuid the quotation's UUID
	 * @param groupId the primary key of the group
	 * @return the matching quotation, or <code>null</code> if a matching quotation could not be found
	 */
	@Override
	public com.liferay.custom.lifeinsurance.quotations.model.Quotation
		fetchQuotationByUuidAndGroupId(String uuid, long groupId) {

		return _quotationLocalService.fetchQuotationByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _quotationLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.liferay.custom.lifeinsurance.quotations.model.Quotation>
			getAllQuotations() {

		return _quotationLocalService.getAllQuotations();
	}

	@Override
	public java.util.List
		<com.liferay.custom.lifeinsurance.quotations.model.Quotation>
			getCustomerQuotations(long customerId) {

		return _quotationLocalService.getCustomerQuotations(customerId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _quotationLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _quotationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quotationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quotationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the quotation with the primary key.
	 *
	 * @param quotationId the primary key of the quotation
	 * @return the quotation
	 * @throws PortalException if a quotation with the primary key could not be found
	 */
	@Override
	public com.liferay.custom.lifeinsurance.quotations.model.Quotation
			getQuotation(long quotationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quotationLocalService.getQuotation(quotationId);
	}

	/**
	 * Returns the quotation matching the UUID and group.
	 *
	 * @param uuid the quotation's UUID
	 * @param groupId the primary key of the group
	 * @return the matching quotation
	 * @throws PortalException if a matching quotation could not be found
	 */
	@Override
	public com.liferay.custom.lifeinsurance.quotations.model.Quotation
			getQuotationByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quotationLocalService.getQuotationByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List
		<com.liferay.custom.lifeinsurance.quotations.model.Quotation>
			getQuotations(int start, int end) {

		return _quotationLocalService.getQuotations(start, end);
	}

	/**
	 * Returns all the quotations matching the UUID and company.
	 *
	 * @param uuid the UUID of the quotations
	 * @param companyId the primary key of the company
	 * @return the matching quotations, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.liferay.custom.lifeinsurance.quotations.model.Quotation>
			getQuotationsByUuidAndCompanyId(String uuid, long companyId) {

		return _quotationLocalService.getQuotationsByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List
		<com.liferay.custom.lifeinsurance.quotations.model.Quotation>
			getQuotationsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.custom.lifeinsurance.quotations.model.
						Quotation> orderByComparator) {

		return _quotationLocalService.getQuotationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of quotations.
	 *
	 * @return the number of quotations
	 */
	@Override
	public int getQuotationsCount() {
		return _quotationLocalService.getQuotationsCount();
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
	@Override
	public com.liferay.custom.lifeinsurance.quotations.model.Quotation
		updateQuotation(
			com.liferay.custom.lifeinsurance.quotations.model.Quotation
				quotation) {

		return _quotationLocalService.updateQuotation(quotation);
	}

	@Override
	public QuotationLocalService getWrappedService() {
		return _quotationLocalService;
	}

	@Override
	public void setWrappedService(QuotationLocalService quotationLocalService) {
		_quotationLocalService = quotationLocalService;
	}

	private QuotationLocalService _quotationLocalService;

}