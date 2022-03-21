create table CUSTOMERS_Customer (
	uuid_ VARCHAR(75) null,
	customerId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	CustomerUserId LONG,
	firstName VARCHAR(75) null,
	middleName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	email VARCHAR(75) null,
	phoneNumber VARCHAR(75) null
);