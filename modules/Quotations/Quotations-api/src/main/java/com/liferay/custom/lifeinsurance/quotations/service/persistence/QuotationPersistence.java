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

import com.liferay.custom.lifeinsurance.quotations.exception.NoSuchQuotationException;
import com.liferay.custom.lifeinsurance.quotations.model.Quotation;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the quotation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuotationUtil
 * @generated
 */
@ProviderType
public interface QuotationPersistence extends BasePersistence<Quotation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QuotationUtil} to access the quotation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the quotations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching quotations
	 */
	public java.util.List<Quotation> findByUuid(String uuid);

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
	public java.util.List<Quotation> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<Quotation> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Quotation>
			orderByComparator);

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
	public java.util.List<Quotation> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Quotation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first quotation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quotation
	 * @throws NoSuchQuotationException if a matching quotation could not be found
	 */
	public Quotation findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Quotation>
				orderByComparator)
		throws NoSuchQuotationException;

	/**
	 * Returns the first quotation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quotation, or <code>null</code> if a matching quotation could not be found
	 */
	public Quotation fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Quotation>
			orderByComparator);

	/**
	 * Returns the last quotation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quotation
	 * @throws NoSuchQuotationException if a matching quotation could not be found
	 */
	public Quotation findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Quotation>
				orderByComparator)
		throws NoSuchQuotationException;

	/**
	 * Returns the last quotation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quotation, or <code>null</code> if a matching quotation could not be found
	 */
	public Quotation fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Quotation>
			orderByComparator);

	/**
	 * Returns the quotations before and after the current quotation in the ordered set where uuid = &#63;.
	 *
	 * @param quotationId the primary key of the current quotation
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quotation
	 * @throws NoSuchQuotationException if a quotation with the primary key could not be found
	 */
	public Quotation[] findByUuid_PrevAndNext(
			long quotationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Quotation>
				orderByComparator)
		throws NoSuchQuotationException;

	/**
	 * Removes all the quotations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of quotations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching quotations
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the quotation where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchQuotationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching quotation
	 * @throws NoSuchQuotationException if a matching quotation could not be found
	 */
	public Quotation findByUUID_G(String uuid, long groupId)
		throws NoSuchQuotationException;

	/**
	 * Returns the quotation where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching quotation, or <code>null</code> if a matching quotation could not be found
	 */
	public Quotation fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the quotation where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quotation, or <code>null</code> if a matching quotation could not be found
	 */
	public Quotation fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the quotation where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the quotation that was removed
	 */
	public Quotation removeByUUID_G(String uuid, long groupId)
		throws NoSuchQuotationException;

	/**
	 * Returns the number of quotations where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching quotations
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the quotations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching quotations
	 */
	public java.util.List<Quotation> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Quotation> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Quotation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Quotation>
			orderByComparator);

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
	public java.util.List<Quotation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Quotation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first quotation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quotation
	 * @throws NoSuchQuotationException if a matching quotation could not be found
	 */
	public Quotation findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Quotation>
				orderByComparator)
		throws NoSuchQuotationException;

	/**
	 * Returns the first quotation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quotation, or <code>null</code> if a matching quotation could not be found
	 */
	public Quotation fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Quotation>
			orderByComparator);

	/**
	 * Returns the last quotation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quotation
	 * @throws NoSuchQuotationException if a matching quotation could not be found
	 */
	public Quotation findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Quotation>
				orderByComparator)
		throws NoSuchQuotationException;

	/**
	 * Returns the last quotation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quotation, or <code>null</code> if a matching quotation could not be found
	 */
	public Quotation fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Quotation>
			orderByComparator);

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
	public Quotation[] findByUuid_C_PrevAndNext(
			long quotationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Quotation>
				orderByComparator)
		throws NoSuchQuotationException;

	/**
	 * Removes all the quotations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of quotations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching quotations
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the quotations where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @return the matching quotations
	 */
	public java.util.List<Quotation> findByCustomerId(long customerId);

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
	public java.util.List<Quotation> findByCustomerId(
		long customerId, int start, int end);

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
	public java.util.List<Quotation> findByCustomerId(
		long customerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Quotation>
			orderByComparator);

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
	public java.util.List<Quotation> findByCustomerId(
		long customerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Quotation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first quotation in the ordered set where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quotation
	 * @throws NoSuchQuotationException if a matching quotation could not be found
	 */
	public Quotation findByCustomerId_First(
			long customerId,
			com.liferay.portal.kernel.util.OrderByComparator<Quotation>
				orderByComparator)
		throws NoSuchQuotationException;

	/**
	 * Returns the first quotation in the ordered set where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quotation, or <code>null</code> if a matching quotation could not be found
	 */
	public Quotation fetchByCustomerId_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator<Quotation>
			orderByComparator);

	/**
	 * Returns the last quotation in the ordered set where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quotation
	 * @throws NoSuchQuotationException if a matching quotation could not be found
	 */
	public Quotation findByCustomerId_Last(
			long customerId,
			com.liferay.portal.kernel.util.OrderByComparator<Quotation>
				orderByComparator)
		throws NoSuchQuotationException;

	/**
	 * Returns the last quotation in the ordered set where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quotation, or <code>null</code> if a matching quotation could not be found
	 */
	public Quotation fetchByCustomerId_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator<Quotation>
			orderByComparator);

	/**
	 * Returns the quotations before and after the current quotation in the ordered set where customerId = &#63;.
	 *
	 * @param quotationId the primary key of the current quotation
	 * @param customerId the customer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quotation
	 * @throws NoSuchQuotationException if a quotation with the primary key could not be found
	 */
	public Quotation[] findByCustomerId_PrevAndNext(
			long quotationId, long customerId,
			com.liferay.portal.kernel.util.OrderByComparator<Quotation>
				orderByComparator)
		throws NoSuchQuotationException;

	/**
	 * Removes all the quotations where customerId = &#63; from the database.
	 *
	 * @param customerId the customer ID
	 */
	public void removeByCustomerId(long customerId);

	/**
	 * Returns the number of quotations where customerId = &#63;.
	 *
	 * @param customerId the customer ID
	 * @return the number of matching quotations
	 */
	public int countByCustomerId(long customerId);

	/**
	 * Caches the quotation in the entity cache if it is enabled.
	 *
	 * @param quotation the quotation
	 */
	public void cacheResult(Quotation quotation);

	/**
	 * Caches the quotations in the entity cache if it is enabled.
	 *
	 * @param quotations the quotations
	 */
	public void cacheResult(java.util.List<Quotation> quotations);

	/**
	 * Creates a new quotation with the primary key. Does not add the quotation to the database.
	 *
	 * @param quotationId the primary key for the new quotation
	 * @return the new quotation
	 */
	public Quotation create(long quotationId);

	/**
	 * Removes the quotation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quotationId the primary key of the quotation
	 * @return the quotation that was removed
	 * @throws NoSuchQuotationException if a quotation with the primary key could not be found
	 */
	public Quotation remove(long quotationId) throws NoSuchQuotationException;

	public Quotation updateImpl(Quotation quotation);

	/**
	 * Returns the quotation with the primary key or throws a <code>NoSuchQuotationException</code> if it could not be found.
	 *
	 * @param quotationId the primary key of the quotation
	 * @return the quotation
	 * @throws NoSuchQuotationException if a quotation with the primary key could not be found
	 */
	public Quotation findByPrimaryKey(long quotationId)
		throws NoSuchQuotationException;

	/**
	 * Returns the quotation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quotationId the primary key of the quotation
	 * @return the quotation, or <code>null</code> if a quotation with the primary key could not be found
	 */
	public Quotation fetchByPrimaryKey(long quotationId);

	/**
	 * Returns all the quotations.
	 *
	 * @return the quotations
	 */
	public java.util.List<Quotation> findAll();

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
	public java.util.List<Quotation> findAll(int start, int end);

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
	public java.util.List<Quotation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Quotation>
			orderByComparator);

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
	public java.util.List<Quotation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Quotation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the quotations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of quotations.
	 *
	 * @return the number of quotations
	 */
	public int countAll();

}