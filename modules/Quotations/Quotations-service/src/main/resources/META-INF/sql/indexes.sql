create index IX_6B74432C on Quotation_Quotation (customerId);
create index IX_2E674813 on Quotation_Quotation (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_5338B755 on Quotation_Quotation (uuid_[$COLUMN_LENGTH:75$], groupId);