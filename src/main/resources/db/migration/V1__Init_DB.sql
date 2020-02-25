-- DROP DATABASE IF EXISTS  migration;
--
-- create DATABASE migration;

create table accounts
(
    id         integer not null
        constraint accounts_pkey
            primary key,
    first_name varchar(255),
    last_name  varchar(255),
    city       varchar(255),
    gender     varchar(255),
    username   varchar(255)
);

create table profiles_table
(
    id         integer not null
        constraint profiles_pk
            primary key,
    username   varchar(255) not null,
    job_title  varchar(255) not null,
    department varchar(255) not null,
    company    varchar(255) not null,
    skill      varchar(255) not null
);