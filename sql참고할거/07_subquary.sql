select avg(salary) 
from employees;

select avg(salary)
from employees
where department_id = 100;

-- 부서 번호가 100번인 사원중 전체평균보다 더 많이 받는 녀석

select employee_id, first_name, salary
from employees
where department_id = 100 and salary >= (
    select avg(salary)
    from employees
)


---------------------------------------------------------------

select employee_id, first_name, salary
from employees
where department_id in (
    select department_id from departments where location_id = 1700
    );
    
    
-----------------------------------------------------------

select rownum, employee_id, first_name, salary
from (
    select employee_id, first_name, salary
    from employees
    order by salary desc
)
where rownum > 3;
------------------------------------------------------ ????? -------------

select rnum, employee_id, first_name, salary
from (
    select rownum as rnum, employee_id, first_name, salary
    from (
        select employee_id, first_name, salary
        from employees
        order by salary desc
    )
    where rownum <= 25;
)
where rnum >= 21






select rownum, employee_id, first_name, salary
from employees
order by salary desc;
