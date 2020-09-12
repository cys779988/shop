create table recipe (
    recipeNum       number          not null,
    recipeName      varchar2(50)    not null,
    recipeCateCode     varchar2(30)    not null,
    recipePrice     number          not null,
    recipeStock     number          null,
    recipeDes       clob    		 null,
    recipeImg       varchar(200)    null,
    regDate      date            default sysdate,
    recipeThumbImg varchar(200),
    ingName1 varchar2(50) null,
    ingName2 varchar2(50) null,
    ingName3 varchar2(50) null,
    ingName4 varchar2(50) null,
    ingName5 varchar2(50) null,
    ingName6 varchar2(50) null,
    ingName7 varchar2(50) null,
    ingName8 varchar2(50) null,
    ingName9 varchar2(50) null,
    ingWeight1 varchar2(20) null,
    ingWeight2 varchar2(20) null,
    ingWeight3 varchar2(20) null,
    ingWeight4 varchar2(20) null,
    ingWeight5 varchar2(20) null,
    ingWeight6 varchar2(20) null,
    ingWeight7 varchar2(20) null,
    ingWeight8 varchar2(20) null,
    ingWeight9 varchar2(20) null,
    primary key(recipeNum)  
);
CREATE SEQUENCE recipe_seq;

drop table recipe;
drop sequence recipe_seq;
drop table recipe_reply;
drop sequence recipe_reply_seq;


create table recipe_reply (
    recipeNum      number          not null,
    userId      varchar2(50)    not null,
    repNum      number          not null,
    repCon      varchar2(2000)  not null,
    repDate     date            default sysdate,
    primary key(recipeNum, repNum) 
);
CREATE SEQUENCE recipe_reply_seq;

alter table recipe_reply
    add constraint recipe_reply_recipeNum foreign key(recipeNum)
    references recipe(recipeNum) on delete cascade;
alter table recipe_reply
    add constraint recipe_reply_userId foreign key(userId)
    references member(userId) on delete cascade;
    
commit