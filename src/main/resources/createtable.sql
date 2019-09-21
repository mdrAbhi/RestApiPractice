Create database Amazon_music_db;

Create table artists(
id bigint(20) not null auto_increment,
name varchar(50) not null,
genre varchar (50),
country varchar (50),
primary key (id));