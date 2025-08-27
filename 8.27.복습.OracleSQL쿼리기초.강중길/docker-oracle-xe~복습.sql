-- 테이블 초기화 (drop 후 다시 create)
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
    bwriter varchar(15) not null,
    bhitcount number(5) not null,
    bdate date not null
);

-- 시퀀스 객체 만들기
-- mysql 같은 RDBMS는 auto_increment 기능으로 제공되지만 oracle은 객체를 만들어서 써줘야 한다.
drop sequence seq_board_bno;
create sequence seq_board_bno;
-- 다른 설정 없이 이렇게 생성하면 1부터 1씩 올라가는 시퀀스 객체가 생성된다.


-- 값 넣어주기
insert into member 
VALUES ('user1', '사용자1', '12345', 'user1@mycom.com', '010-123-1234', '012345');
commit;

insert into board (bno, btitle, bcontent, bwriter, bhitcount, bdate)
values (seq_board_bno.nextval, '제품1', '내용1', 'user1', 1, SYSDATE);
commit;


-- BOARD 테이블에 외래키 넣기
drop table board;
create table board (
    bno number primary key,
    btitle varchar(1000) not null,
    bcontent clob null,
    bwriter varchar(15) REFERENCES member(mid) not null,
    bhitcount number(5) not null,
    bdate date not null
);




--- 서브 쿼리


-- select -> 출력할 결과를 보여주는 부분, 연산을 잘해도 여기 안보여주면 의미가 없다.
-- from -> 어느 테이블에서 가져올 것인지를 정하는 부분.
-- where -> 조건을 거는 부분

select avg(salary)
from employees
where department_id = 100;
--> employees 중에 부서 번호가 100번인 사원의 salary 평균을 보여줘.


-- 부서 번호가 100번인 사원중 전체평균보다 더 많이 받는 녀석의 id, 이름, 연봉을 보여줘
select employee_id, first_name, salary
from employees
where department_id = 100 and salary >= (
    select avg(salary)
    from employees
)

-- 괄호 안에 다른 쿼리가 들어간다. select된 것들의 값을 리턴하는 함수와 비슷하게 동작한다.

select employee_id, first_name, salary
from employees
where department_id in (
    select department_id from departments where location_id = 1700
    );
    
-- 지역번호가 1700인 녀석들의 id, 이름, 연봉을 보여줘
-- 이 경우, 테이블간 연결을 위해서 서브 쿼리가 사용되었다.


select rownum, employee_id, first_name, salary
from (
    select employee_id, first_name, salary
    from employees
    order by salary desc
)
where rownum > 3;

-- 이 쿼리는 작동하지 않는다 rownum이 순차적으로 붙는 가상 컬럼이기 때문이다 시작부터 3보다 큰 컬럼은 없기 때문이다.
-- 그래서 서브 쿼리를 두 번 적용시켜서 해결한다


select rnum, employee_id, first_name, salary
from (
    select rownum as rnum, employee_id, first_name, salary
    from (
        select employee_id, first_name, salary
        from employees
        order by salary desc
    )
    where rownum <= 10
)
where rnum >= 3

-- 이렇게 rownum을 정상적으로 한 번 서브쿼리 속에서 받아준 이후, 그걸 다시 조건을 걸어서 일부만 출력되도록 하면 된다


-- join
-- 테이블간에 관계가 있을때, 그 관계를 타고들어가서 읽어오는 방식이다
-- alias, 즉 별칭 기능을 지원한다

--- Lex가 근무하는 부서의 이름은?
select first_name, department_name, d.department_id, e.department_id 
from employees e, departments d
where 
    e.department_id = d.department_id -- 연결 조건 관계된 테이블간 거리만큼 and로 여러번 걸쳐 연결해준다
    and 
    first_name = 'Lex'
    
--- Lex가 근무하는 도시의 이름?
select e.first_name, city    --city는 locations테이블에만 있는 값이기 때문에, alias를 붙이지 않아도 된다. 
-- 둘 이상이 존재하는 경우, 반드시 어떤 곳의 데이터를 출력해줄 것인지 alias로 명시 해줘야 한다
from employees e, departments d, locations l
where 
    e.department_id = d.department_id
    and
    d.location_id = l.location_id
    and e.first_name = 'Lex'
    
    
--- Lex가 근무하는 국가의 이름은?
select e.first_name, country_name
from employees e, departments d, locations l, countries c
where 
    e.department_id = d.department_id
    and
    d.location_id = l.location_id
    and
    l.country_id = c.country_id
    and e.first_name = 'Lex'
    