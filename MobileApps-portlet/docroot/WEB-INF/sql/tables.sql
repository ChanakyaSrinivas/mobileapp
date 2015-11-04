create table Mobile_userdetails (
	userId LONG not null primary key,
	companyId LONG,
	email VARCHAR(75) null,
	username VARCHAR(75) null,
	password_ LONG,
	street VARCHAR(75) null,
	city VARCHAR(75) null,
	state_ VARCHAR(75) null,
	zipcode VARCHAR(75) null,
	phoneNumber VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);