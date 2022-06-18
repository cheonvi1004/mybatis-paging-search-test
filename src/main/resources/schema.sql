drop table if exists paging_test;
drop table if exists board;
create table board (
    id bigint primary key auto_increment,
    title varchar(255) not null,
    contents varchar(255) not null
);