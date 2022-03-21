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

package com.liferay.custom.lifeinsurance.quotations.service.persistence;

import com.liferay.custom.lifeinsurance.quotations.model.Quotation;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the quotation service. This utility wraps <code>com.liferay.custom.lifeinsurance.quotations.service.persistence.impl.QuotationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuotationPersistence
 * @generated
 */
public class QuotationUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Quotation quotation) {
		getPersistence().clearCache(quotation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Quotation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Quotation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Quotation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Quotation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Quotation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Quotation update(Quotation quotation) {
		return getPersistence().update(quotation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Quotation update(
		Quotation quotation, ServiceContext serviceContext) {

		return getPersistence().update(quotation, serviceContext);
	}

	/**
	 * Returns all the quotations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching quotations
	 */
	public static List<Quotation> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the quotations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuotationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quotations
	 * @param end the upper bound of the range of quotations (not inclusive)
	 * @return the range of matching quotations
	 */
	public static List<Quotation> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the quotations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuotationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quotations
	 * @param end the upper bound of the range of quotations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quotations
	 */
	public static List<Quotation> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Quotation> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quotations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuotationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quotations
	 * @param end the upper bound of the range of quotations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quotations
	 */
	public static List<Quotation> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Quotation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first quotation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quotation
	 * @throws NoSuchQuotationException if a matching quotation could not be found
	 */
	public static Quotation findByUuid_First(
			String uuid, OrderByComparator<Quotation> orderByComparator)
		throws com.liferay.custom.lifeinsurance.quotations.exception.
			NoSuchQuotationException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first quotation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quotation, or <code>null</code> if a matching quotation could not be found
	 */
	public static Quotation fetchByUuid_First(
		String uuid, OrderByComparator<Quotation> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last quotation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quotation
	 * @throws NoSuchQuotationException if a matching quotation could not be found
	 */
	public static Quotation findByUuid_Last(
			String uuid, OrderByComparator<Quotation> orderByComparator)
		throws com.liferay.custom.lifeinsurance.quotations.exception.
			NoSuchQuotationException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last quotation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quotation, or <code>null</code> if a matching quotation could not be found
	 */
	public static Quotation fetchByUuid_Last(
		String uuid, OrderByComparator<Quotation> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the quotations before and after the current quotation in the ordered set where uuid = &#63;.
	 *
	 * @param quotationId the primary key of the current quotation
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quotation
	 * @throws NoSuchQuotationException if a quotation with the primary key could not be found
	 */
	public static Quotation[] findByUuid_PrevAndNext(
			long quotationId, String uuid,
			OrderByComparator<Quotation> orderByComparator)
		throws com.liferay.custom.lifeinsurance.quotations.exception.
			NoSuchQuotationException {

		return getPersistence().findByUuid_PrevAndNext(
			quotationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the quotations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of quotations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching quotations
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the quotation where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchQuotationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching quotation
	 * @throws NoSuchQuotationException if a matching quotation could not be found
	 */
	public static Quotation findByUUID_G(String uuid, long groupId)
		throws com.liferay.custom.lifeinsurance.quotations.exception.
			NoSuchQuotationException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the quotation where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching quotation, or <code>null</code> if a matching quotation could not be found
	 */
	public static Quotation fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the quotation where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quotation, or <code>null</code> if a matching quotation could not be found
	 */
	public static Quotation fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the quotation where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the quotation that was removed
	 */
	public static Quotation removeByUUID_G(String uuid, long groupId)
		throws com.liferay.custom.lifeinsurance.quotations.exception.
			NoSuchQuotationException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of quotations where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching quotations
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the quotations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching quotations
	 */
	public static List<Quotation> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the quotations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuotationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quotations
	 * @param end the upper bound of the range of quotations (not inclusive)
	 * @return the range of matching quotations
	 */
	public static List<Quotation> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the quotations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuotationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quotations
	 * @param end the upper bound of the range of quotations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quotations
	 */
	public static List<Quotation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Quotation> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quotations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuotationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quotations
	 * @param end the upper bound of the range of quotations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quotations
	 */
	public static List<Quotation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Quotation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first quotation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quotation
	 * @throws NoSuchQuotationException if a matching quotation could not be found
	 */
	public static Quotation findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Quotation> orderByComparator)
		throws com.liferay.custom.lifeinsurance.quotations.exception.
			NoSuchQuotationException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first quotation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quotation, or <code>null</code> if a matching quotation could not be found
	 */
	public static Quotation fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Quotation> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last quotation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quotation
	 * @throws NoSuchQuotationException if a matching quotation could not be found
	 */
	public static Quotation findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Quotation> orderByComparator)
		throws com.liferay.custom.lifeinsurance.quotations.exception.
			NoSuchQuotationException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last quotation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quotation, or <code>null</code> if a matching quotation could not be found
	 */
	public static Quotation fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Quotation> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the quotations before and after the current quotation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param quotationId the primary key of the current quotation
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quotation
	 * @throws NoSuchQuotationException if a quotation with the primary key could not be found
	 */
	public static Quotation[] findByUuid_C_PrevAndNext(
			long quotationId, String uuid, long companyId,
			OrderByComparator<Quotation> orderByComparator)
		throws com.liferay.custom.lifeinsurance.quotations.exception.
			NoSuchQuotationException {

		return getPersistence().findByUuid_C_PrevAndNext(
			quotationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the quotations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of quotations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching quotations
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the quotations where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @return the matching quotations
	 */
	public static List<Quotation> findByCustomerId(long customerId) {
		return getPersistence().findByCustomerId(customerId);
	}

	/**
	 * Returns a range of all the quotations where customerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuotationModelImpl</code>.
	 * </p>
	 *
	 * @param customerId the customer ID
	 * @param start the lower bound of the range of quotations
	 * @param end the upper bound of the range of quotations (not inclusive)
	 * @return the range of matching quotations
	 */
	public static List<Quotation> findByCustomerId(
		long customerId, int start, int end) {

		return getPersistence().findByCustomerId(customerId, start, end);
	}

	/**
	 * Returns an ordered range of all the quotations where customerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuotationModelImpl</code>.
	 * </p>
	 *
	 * @param customerId the customer ID
	 * @param start the lower bound of the range of quotations
	 * @param end the upper bound of the range of quotations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quotations
	 */
	public static List<Quotation> findByCustomerId(
		long customerId, int start, int end,
		OrderByComparator<Quotation> orderByComparator) {

		return getPersistence().findByCustomerId(
			customerId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quotations where customerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuotationModelImpl</code>.
	 * </p>
	 *
	 * @param customerId the customer ID
	 * @param start the lower bound of the range of quotations
	 * @param end the upper bound of the range of quotations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quotations
	 */
	public static List<Quotation> findByCustomerId(
		long customerId, int start, int end,
		OrderByComparator<Quotation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCustomerId(
			customerId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first quotation in the ordered set where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quotation
	 * @throws NoSuchQuotationException if a matching quotation could not be found
	 */
	public static Quotation findByCustomerId_First(
			long customerId, OrderByComparator<Quotation> orderByComparator)
		throws com.liferay.custom.lifeinsurance.quotations.exception.
			NoSuchQuotationException {

		return getPersistence().findByCustomerId_First(
			customerId, orderByComparator);
	}

	/**
	 * Returns the first quotation in the ordered set where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quotation, or <code>null</code> if a matching quotation could not be found
	 */
	public static Quotation fetchByCustomerId_First(
		long customerId, OrderByComparator<Quotation> orderByComparator) {

		return getPersistence().fetchByCustomerId_First(
			customerId, orderByComparator);
	}

	/**
	 * Returns the last quotation in the ordered set where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quotation
	 * @throws NoSuchQuotationException if a matching quotation could not be found
	 */
	public static Quotation findByCustomerId_Last(
			long customerId, OrderByComparator<Quotation> orderByComparator)
		throws com.liferay.custom.lifeinsurance.quotations.exception.
			NoSuchQuotationException {

		return getPersistence().findByCustomerId_Last(
			customerId, orderByComparator);
	}

	/**
	 * Returns the last quotation in the ordered set where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quotation, or <code>null</code> if a matching quotation could not be found
	 */
	public static Quotation fetchByCustomerId_Last(
		long customerId, OrderByComparator<Quotation> orderByComparator) {

		return getPersistence().fetchByCustomerId_Last(
			customerId, orderByComparator);
	}

	/**
	 * Returns the quotations before and after the current quotation in the ordered set where customerId = &#63;.
	 *
	 * @param quotationId the primary key of the current quotation
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quotation
	 * @throws NoSuchQuotationException if a quotation with the primary key could not be found
	 */
	public static Quotation[] findByCustomerId_PrevAndNext(
			long quotationId, long customerId,
			OrderByComparator<Quotation> orderByComparator)
		throws com.liferay.custom.lifeinsurance.quotations.exception.
			NoSuchQuotationException {

		return getPersistence().findByCustomerId_PrevAndNext(
			quotationId, customerId, orderByComparator);
	}

	/**
	 * Removes all the quotations where customerId = &#63; from the database.
	 *
	 * @param customerId the customer ID
	 */
	public static void removeByCustomerId(long customerId) {
		getPersistence().removeByCustomerId(customerId);
	}

	/**
	 * Returns the number of quotations where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @return the number of matching quotations
	 */
	public static int countByCustomerId(long customerId) {
		return getPersistence().countByCustomerId(customerId);
	}

	/**
	 * Caches the quotation in the entity cache if it is enabled.
	 *
	 * @param quotation the quotation
	 */
	public static void cacheResult(Quotation quotation) {
		getPersistence().cacheResult(quotation);
	}

	/**
	 * Caches the quotations in the entity cache if it is enabled.
	 *
	 * @param quotations the quotations
	 */
	public static void cacheResult(List<Quotation> quotations) {
		getPersistence().cacheResult(quotations);
	}

	/**
	 * Creates a new quotation with the primary key. Does not add the quotation to the database.
	 *
	 * @param quotationId the primary key for the new quotation
	 * @return the new quotation
	 */
	public static Quotation create(long quotationId) {
		return getPersistence().create(quotationId);
	}

	/**
	 * Removes the quotation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quotationId the primary key of the quotation
	 * @return the quotation that was removed
	 * @throws NoSuchQuotationException if a quotation with the primary key could not be found
	 */
	public static Quotation remove(long quotationId)
		throws com.liferay.custom.lifeinsurance.quotations.exception.
			NoSuchQuotationException {

		return getPersistence().remove(quotationId);
	}

	public static Quotation updateImpl(Quotation quotation) {
		return getPersistence().updateImpl(quotation);
	}

	/**
	 * Returns the quotation with the primary key or throws a <code>NoSuchQuotationException</code> if it could not be found.
	 *
	 * @param quotationId the primary key of the quotation
	 * @return the quotation
	 * @throws NoSuchQuotationException if a quotation with the primary key could not be found
	 */
	public static Quotation findByPrimaryKey(long quotationId)
		throws com.liferay.custom.lifeinsurance.quotations.exception.
			NoSuchQuotationException {

		return getPersistence().findByPrimaryKey(quotationId);
	}

	/**
	 * Returns the quotation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quotationId the primary key of the quotation
	 * @return the quotation, or <code>null</code> if a quotation with the primary key could not be found
	 */
	public static Quotation fetchByPrimaryKey(long quotationId) {
		return getPersistence().fetchByPrimaryKey(quotationId);
	}

	/**
	 * Returns all the quotations.
	 *
	 * @return the quotations
	 */
	public static List<Quotation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the quotations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuotationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quotations
	 * @param end the upper bound of the range of quotations (not inclusive)
	 * @return the range of quotations
	 */
	public static List<Quotation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the quotations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuotationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quotations
	 * @param end the upper bound of the range of quotations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quotations
	 */
	public static List<Quotation> findAll(
		int start, int end, OrderByComparator<Quotation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quotations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuotationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quotations
	 * @param end the upper bound of the range of quotations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quotations
	 */
	public static List<Quotation> findAll(
		int start, int end, OrderByComparator<Quotation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the quotations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of quotations.
	 *
	 * @return the number of quotations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static QuotationPersistence getPersistence() {
		return _persistence;
	}

	private static volatile QuotationPersistence _persistence;

}