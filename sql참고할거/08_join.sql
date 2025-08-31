---join

--- Lex가 근무하는 부서의 이름은?
select first_name, department_name, d.department_id, e.department_id
from employees e, departments d
where 
    e.department_id = d.department_id -- 연결 조건
    and 
    first_name = 'Lex'
    
    
    
--- Lex가 근무하는 도시의 이름?

select e.first_name, city
from employees e, departments d, locations l
where 
    e.department_id = d.department_id
    and
    d.location_id = l.location_id
    and e.first_name = 'Lex'
    

select e.first_name, country_name
from employees e, departments d, locations l, countries c
where 
    e.department_id = d.department_id
    and
    d.location_id = l.location_id
    and
    l.country_id = c.country_id
    and e.first_name = 'Lex'