create table member (
    mid varchar(20) primary key, 
    mname varchar(20) not null,
    mpassword varchar(20) not null,
    memail varchar(50) null,
    mtel varchar(20) null, 
    mssn char(6) not null
);

insert into member 
VALUES ('user1', '사용자1', '12345', 'user1@mycom.com', '010-123-1234', '012345');
commit;

insert into member (mid, mname, mpassword, memail, mtel, mssn)
VALUES ('user2', '사용자2', '12345', 'user1@mycom.com', '010-123-1234', '012345');
commit;

insert into member (mid, mname, mpassword, mssn)
VALUES ('user3', '사용자3', '12345', '012385');
commit;

--insert into member
--VALUES ('user4', '사용자4', '12345', null, null, '012345');
--commit;
-- 이렇게는 쓰지 말것 항상 칼럼명을 넣어줄것

insert into member (mid, mname, mpassword, mssn)
VALUES ('user4', '사용자4', '12345', '012345');
commit;

-- board 테이블
insert into board (bno, btitle, bcontent, bwriter, bhitcount, bdate)
values (1, '제품1', '내용1', 'user1', 0, SYSDATE);


-- 시퀀스 객체 만들기
drop sequence seq_board_bno;
create sequence seq_board_bno;

insert into board (bno, btitle, bcontent, bwriter, bhitcount, bdate)
values (seq_board_bno.nextval, '제품2', '내용2', 'user2', 1, SYSDATE);