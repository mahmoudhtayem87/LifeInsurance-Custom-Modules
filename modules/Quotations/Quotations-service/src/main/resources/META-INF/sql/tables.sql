create table Quotation_Quotation (
	uuid_ VARCHAR(75) null,
	quotationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	customerId LONG,
	quotationAmount LONG,
	quotationData VARCHAR(75) null,
	quotationType VARCHAR(75) null
);