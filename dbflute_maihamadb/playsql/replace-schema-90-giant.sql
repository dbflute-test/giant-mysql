
-- for the test of giant table
-- creating index is executed at take-finally
-- because of giant data registered at load-data 

-- =======================================================================================
--                                                                             Many to One
--                                                                             ===========
create table GIANT_STATUS (
	GIANT_STATUS_CODE char(3) not null primary key,
	GIANT_STATUS_NAME varchar(64) not null,
	DISPLAY_ORDER integer not null,
	DESCRIPTION varchar(128) not null
) comment = 'Status of Giant: simple classification';


-- =======================================================================================
--                                                                              Base Point
--                                                                              ==========
create table GIANT (
	GIANT_ID bigint not null primary key,
	GIANT_STATUS_CODE char(3) not null,
	INDEX_STRING varchar(64) not null,
	INDEX_INTEGER integer not null,
	INDEX_DATE date not null,
	INDEX_DATETIME datetime not null,
	INDEX_BOOLEAN boolean not null,
	NON_INDEX_STRING varchar(64) not null,
	NON_INDEX_INTEGER integer not null,
	NON_INDEX_DATE date not null,
	NON_INDEX_DATETIME datetime not null,
	NON_INDEX_BOOLEAN boolean not null,
	NULLABLE_INDEX_STRING varchar(64),
	NULLABLE_INDEX_INTEGER integer,
	NULLABLE_INDEX_DATE date,
	NULLABLE_INDEX_DATETIME datetime,
	NULLABLE_INDEX_BOOLEAN boolean,
	SELF_PARENT_ID bigint comment 'Self Reference ID: 20% null, (10% root, 10% independent)',
	UNIQUE_1ST_INTEGER integer not null comment 'Compound Unique First: root of compound unique index',
	UNIQUE_2ND_INTEGER integer not null comment 'Compound Unique Second: has single index for itself',
	UNIQUE_3RD_INTEGER integer not null comment 'Compound Unique Third: no single index',
	UNIQUE_4TH_INTEGER integer not null comment 'Compound Unique Fourth: has single index for itself',
	UNIQUE_STRING varchar(64) not null,
	UNIQUE_INTEGER integer not null,
	ZONE_MEMBER_ID integer not null,
	ZONE_PURCHASE_ID bigint not null,
	ZONE_PRODUCT_ID integer not null,
	unique (UNIQUE_1ST_INTEGER, UNIQUE_2ND_INTEGER, UNIQUE_3RD_INTEGER, UNIQUE_4TH_INTEGER),
	unique (UNIQUE_STRING),
	unique (UNIQUE_INTEGER)
) comment = 'Giant as base point: many records';


-- =======================================================================================
--                                                                             One to Many
--                                                                             ===========
create table GIANT_REF (
	GIANT_REF_ID bigint not null primary key,
	GIANT_ID bigint not null comment 'Giant ID (FK): has compound index with INDEX_INTEGER',
	GIANT_STATUS_CODE char(3) not null,
	INDEX_STRING varchar(64) not null,
	INDEX_INTEGER integer not null,
	INDEX_DATE date not null,
	INDEX_DATETIME datetime not null,
	INDEX_BOOLEAN boolean not null,
	NON_INDEX_STRING varchar(64) not null,
	NON_INDEX_INTEGER integer not null,
	NON_INDEX_DATE date not null,
	NON_INDEX_DATETIME datetime not null,
	NON_INDEX_BOOLEAN boolean not null,
	NULLABLE_INDEX_STRING varchar(64),
	NULLABLE_INDEX_INTEGER integer,
	NULLABLE_INDEX_DATE date,
	NULLABLE_INDEX_DATETIME datetime,
	NULLABLE_INDEX_BOOLEAN boolean,
	SELF_PARENT_ID bigint comment 'Self Reference ID: 20% null, (10% root, 10% independent)',
	UNIQUE_1ST_INTEGER integer not null comment 'Compound Unique First: root of compound unique index',
	UNIQUE_2ND_INTEGER integer not null comment 'Compound Unique Second: has single index for itself',
	UNIQUE_3RD_INTEGER integer not null comment 'Compound Unique Third: no single index',
	UNIQUE_4TH_INTEGER integer not null comment 'Compound Unique Fourth: has single index for itself',
	UNIQUE_STRING varchar(64) not null,
	UNIQUE_INTEGER integer not null,
	ZONE_MEMBER_ID integer not null,
	ZONE_PURCHASE_ID bigint not null,
	ZONE_PRODUCT_ID integer not null,
	unique (UNIQUE_1ST_INTEGER, UNIQUE_2ND_INTEGER, UNIQUE_3RD_INTEGER, UNIQUE_4TH_INTEGER),
	unique (UNIQUE_STRING),
	unique (UNIQUE_INTEGER)
) comment = 'Referrer of Giant: one-to-many unrequired, many many records';


-- =======================================================================================
--                                                                              One to One
--                                                                              ==========
create table GIANT_SIDE (
	GIANT_SIDE_ID bigint not null primary key,
	GIANT_ID bigint not null comment 'Giant ID (FK): has compound index with INDEX_INTEGER',
	GIANT_STATUS_CODE char(3) not null,
	INDEX_STRING varchar(64) not null,
	INDEX_INTEGER integer not null,
	INDEX_DATE date not null,
	INDEX_DATETIME datetime not null,
	INDEX_BOOLEAN boolean not null,
	NON_INDEX_STRING varchar(64) not null,
	NON_INDEX_INTEGER integer not null,
	NON_INDEX_DATE date not null,
	NON_INDEX_DATETIME datetime not null,
	NON_INDEX_BOOLEAN boolean not null,
	NULLABLE_INDEX_STRING varchar(64),
	NULLABLE_INDEX_INTEGER integer,
	NULLABLE_INDEX_DATE date,
	NULLABLE_INDEX_DATETIME datetime,
	NULLABLE_INDEX_BOOLEAN boolean,
	SELF_PARENT_ID bigint comment 'Self Reference ID: 20% null, (10% root, 10% independent)',
	UNIQUE_1ST_INTEGER integer not null comment 'Compound Unique First: root of compound unique index',
	UNIQUE_2ND_INTEGER integer not null comment 'Compound Unique Second: has single index for itself',
	UNIQUE_3RD_INTEGER integer not null comment 'Compound Unique Third: no single index',
	UNIQUE_4TH_INTEGER integer not null comment 'Compound Unique Fourth: has single index for itself',
	UNIQUE_STRING varchar(64) not null,
	UNIQUE_INTEGER integer not null,
	ZONE_MEMBER_ID integer not null,
	ZONE_PURCHASE_ID bigint not null,
	ZONE_PRODUCT_ID integer not null,
	unique (GIANT_ID),
	unique (UNIQUE_1ST_INTEGER, UNIQUE_2ND_INTEGER, UNIQUE_3RD_INTEGER, UNIQUE_4TH_INTEGER),
	unique (UNIQUE_STRING),
	unique (UNIQUE_INTEGER)
) comment = 'simple Side of Giant: one-to-one required, same record count as Giant';


