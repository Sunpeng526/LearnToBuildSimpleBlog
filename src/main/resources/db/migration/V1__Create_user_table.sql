drop table if exists blog_users;
create table blog_users
(
    id int primary key auto_increment,
    username varchar(100),
    avator varchar(100),
    updateAt timestamp,
    createAt timestamp
);

insert into blog_users(username,avator,updateAt,createAt) values('sunpeng123','https://xx.yy', now(),now());