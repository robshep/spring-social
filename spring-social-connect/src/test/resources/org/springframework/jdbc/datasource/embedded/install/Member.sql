create table Member (id identity,
					firstName varchar not null, 
					lastName varchar not null,
					email varchar(320) not null unique,
					password varchar not null,
					username varchar unique,
					gender varchar(1) not null check (gender in ('M', 'F')),
					birthdate date not null,
					reputation int default 0,
					pictureSet boolean default false,
					primary key (id));