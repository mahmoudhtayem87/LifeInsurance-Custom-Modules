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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;Quotation_Quotation&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Quotation
 * @generated
 */
public class QuotationTable extends BaseTable<QuotationTable> {

	public static final QuotationTable INSTANCE = new QuotationTable();

	public final Column<QuotationTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuotationTable, Long> quotationId = createColumn(
		"quotationId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<QuotationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuotationTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuotationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuotationTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuotationTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuotationTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuotationTable, Long> customerId = createColumn(
		"customerId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuotationTable, Long> quotationAmount = createColumn(
		"quotationAmount", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuotationTable, String> quotationData = createColumn(
		"quotationData", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuotationTable, String> quotationType = createColumn(
		"quotationType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private QuotationTable() {
		super("Quotation_Quotation", QuotationTable::new);
	}

}