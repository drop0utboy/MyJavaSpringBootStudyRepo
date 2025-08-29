--외래키 설정
drop table member;
create table member (
    mid varchar(20) primary key, 
    mname varchar(20) not null,
    mpassword varchar(20) not null,
    memail varchar(50) null,
    mtel varchar(20) null, 
    mssn char(6) not null
);

drop table board;
create table board (
    bno number primary key,
    btitle varchar(1000) not null,
    bcontent clob null,
    bwriter varchar(15) REFERENCES member(mid) not null,
    bhitcount number(5) not null,
    bdate date not null
);

-- 시퀀스 객체 만들기
drop sequence seq_board_bno;
create sequence seq_board_bno;

insert into member 
VALUES ('user1', '사용자1', '12345', 'user1@mycom.com', '010-123-1234', '012345');
commit;

insert into board (bno, btitle, bcontent, bwriter, bhitcount, bdate)
values (seq_board_bno.nextval, '제품1', '내용1', 'user1', 1, SYSDATE);
commit;


-- schema 에서 점선 : null 가능
