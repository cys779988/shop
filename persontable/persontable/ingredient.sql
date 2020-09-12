create table ingredient (
    ingNum       number          not null,
    ingName      varchar2(50)    not null,
    ingCateCode     varchar2(30)    not null,
    ingPrice     number          not null,
    ingStock     number          null,
    ingDes       clob    		 null,
    ingImg       varchar(200)    null,
    regDate      date            default sysdate,
    ingThumbImg varchar(200),
    ingWeight varchar2(50) not null,
    primary key(ingNum)  
);

CREATE SEQUENCE ing_seq;
alter table ingredient modify ingStock number not null
create table ing_reply (
    ingNum      number          not null,
    userId      varchar2(50)    not null,
    repNum      number          not null,
    repCon      varchar2(2000)  not null,
    repDate     date            default sysdate,
    primary key(ingNum, repNum) 
);

CREATE SEQUENCE ing_reply_seq;

alter table ing_reply
    add constraint ing_reply_ingNum foreign key(ingNum)
    references ingredient(ingNum) on delete cascade;
    
alter table ing_reply
    add constraint ing_reply_userId foreign key(userId)
    references member(userId) on delete cascade;
    
commit


create table cart (
    cartNum     number          not null,
    userId      varchar2(50)    not null,
    ingNum      number          not null,
    cartStock   number          not null,
    addDate     date            default sysdate,
    primary key(cartNum, userId) 
);

drop table cart;
create sequence cart_seq;

alter table cart
    add constraint cart_userId foreign key(userId)
    references member(userId) on delete cascade;
    
alter table cart
    drop constraint cart_ingNum;
  

alter table cart
    add constraint cart_ingNum foreign key(ingNum)
    references ingredient(ingNum) on delete cascade;
    

commit