 mysql -u root -p
 Enter password: 
show databases;  

use dh1;
use sirji_table;

select * from emp;

--control flow functions -- 

select pwd form emp;
select pwd,ifnull(pwd,'N/A') from emp;
select pwd,isnull(pwd) from emp;  
select sal,if(sal>1500,'Good','Bad') status from emp;
select pwd,if(length(pwd)>=10,'Strong','week') Status from emp;



--Date time functions --

select  now();
select now(),curdate(),curtime();
select now(),now() + interval 10 day;
select now(),now() + interval '10 10' day_hour;
select now(),now() + interval '10' month;
select now(),now() + interval '10 0:50' day_minute;

select now(),adddate(now(),  interval '10 0:50' day_minute);
select now(),subdate(now(), interval '10 0:50' day_minute);

select now(),extract(day from now())r1;
select now(),extract(month from now())r1;
select now(),extract(year from now())r1;
select ename,hiredate,extract(day from hiredate) from emp;
select ename,hiredate,extract(year from hiredate) from emp;


mysql> select ename,hiredate,day( hiredate) from emp;
mysql> select ename,hiredate,month( hiredate) from emp;
mysql> select ename,hiredate,year( hiredate) from emp;

select now(),second(now());
select now(),minute(now()); 
select now(),hour(now());

select now(),dayname(now());
select hiredate,monthname(hiredate) from emp;
select hiredate,dayname(hiredate) from emp;

select now(),last_day(now());
select str_To_DATE('23/04/2000','%d/%m/%Y');

select date_format(now(),'%d')r1;
select date_format(now(),'%D')r1;

select date_format(now(),'%b')r1;
select date_format(hiredate,'%d')r1 from emp;

--String() functions --

select ascii('s');
select char(67)r1,cast(char(67) as char);
select ename,concat('user naeme',':',pwd)R1 from emp;
select ename,left(ename,4)R1 from emp;
select ename,right(ename,4)R1 from emp;
select '         Hello',ltrim('        Hello')r1;
select 'Hello         ',rtrim('Hello                 ')r1;
select ' Hello     ',trim('        Hello        ')r1;    
select ename,binary(ename)r1 from emp;
select ename,job,ucase(ename),lcase(job)from emp;
select ename, length(ename) from emp;
select ename,job,lpad(ename,10,'*') from emp; 
select ename,job,rpad(ename,10,'*') from emp; 
select ename,repeat(ename,10) from emp; 
select instr('shubham','bh') ; 
select replace('Shubham','bh','pq') as r1;
select reverse('Shubham') as r1;
select ename,reverse(ename) as r1 from emp;
select substring('Shubham',2,2) as r1;
select ename,substring(ename,2,2) as r1 from emp;
select strcmp(ename,ename) from emp; 
select ename,job,strcmp(ename,job) from emp; 
select phone,right(phone,4),lpad(right(phone,4),13,'*')As 'Lpad Phone ' from emp;
select binary(pwd)pwd,cast(pwd as char) from emp;


-- maths functions --

select abs(-2323.23);
select ceil(2323.2343);
select ceiling(2323.2343);
select floor(2323.2343);
select power(23,3);
select rand();
select round(1212.12);
select truncate(12.1222332,2);



-- cluases --
/* 
   where,group by,having,order by,limit

*/

select ename,sal from emp where sal>2125;
select ename,sal,job from emp where job='manager';
select ename,sal,job from emp where job in('manager','clerk');
select ename,sal,job from emp where sal between 1900 and 5700;
select ename,sal,job from emp where ename like 'A%';
select ename,sal,job from emp where ename like '%A';

select ename,sal from emp where sal>2125 limit 2;
select ename,sal from emp where sal>2125 limit 2,3;
select ename,sal from emp where sal>2125 limit 2 offset 3;

select ename,sal from emp order by sal;  
select ename,sal from emp order by 1;
select ename,sal from emp order by 1 desc;
select ename,sal,comm from emp order by isnull(comm);

select job from emp group by job;   
select job,count(*) from emp group by job;
select job,count(*),sum(sal) from emp group by job ;

select job,count(*),sum(sal) from emp group by job having sum(sal)>10000;
select job,count(*),sum(sal)r1 from emp group by job having r1>10000;      
select job,count(*),sum(sal)r1 from emp group by job having job like 'c%' ;


-- Aggregate functions --

/*  sum,avg,count,min,max  */

select sum(sal) from emp;
select avg(sal) from emp;
select count(sal) from emp;
select min(sal) from emp;
select max(sal) from emp;
select sum(sal),avg(sal),min(sal),max(sal),count(sal),count(*) from emp;


-- window functions --

/* row_number() over(), rank() over(), dense_rank(), rand()  */

select row_number() over() r1,ename,sal from emp ;
select row_number() over(order by sal) r1,ename,sal from emp ;

select rank() over()r1,ename,job,sal from emp ;
select rank() over(order by sal)r1,ename,job,sal from emp ;
select rank() over(partition by job order by sal)r1,ename,job,sal from emp ;
select rank() over(partition by job order by sal)r1,ename,job,sal from emp ;
select dense_rank() over(partition by job order by sal)r1,ename,job,sal from emp ;

--  joins --
/*
   crossjoin, 
   innerjoin, 
   natualjoin, 
   simplejoin,
   outerjoin - leftouterjoin,rightouterjoin,
   selfjoin 
*/
-- crossjoin --
select * from emp,dept;    
select e.ename,p.dname,e.deptno,p.deptno from emp e,dept p where e.deptno=p.deptno ;
select e.ename,p.dname,e.deptno,p.deptno from emp e,dept p where e.deptno=p.deptno order by ename ;
select e.ename,p.dname,e.deptno,p.deptno from emp e,dept p where e.deptno=p.deptno order by dname ;
select * from  menucard,softdrink;
select m.name,s.name from  menucard m,softdrink s;
select m.name menu ,s.name softdrink,(m.rate + s.rate) Rate from  menucard m,softdrink s;
select m.name menu ,s.name softdrink,(m.rate + s.rate) Rate from  menucard m cross join softdrink s;
select e.ename,s.name from emp e  inner join softdrink s order by s.name;

-- innerjoin --
select e.ename, d.dname, e.job, e.sal  from emp  e inner join  dept d  ;
select e.ename, d.dname, e.job, e.sal  from emp  e, dept d  where e.deptno=d.deptno ;
select e.ename, d.dname, e.job, e.sal  from emp  e inner join dept d  where e.deptno=d.deptno ;
select c.name,c.address, s.sname, s.comm from customer c inner join salespeople s ;
select c.name,c.address, s.sname, s.comm from customer c inner join salespeople s order by s.sname ;

-- natural join --
select * from emp natural join dept;
select * from customer natural join sales ;

-- simple join --
select * from emp simple join dept using(deptno) ;
select * from emp simple join dept using(pwd) ;

-- outer join --
select e.ename ,e.pwd ,d.loc,d.dname from emp e right outer join dept d on e.deptno=d.deptno;
select e.ename ,e.pwd ,d.loc,d.dname from dept d left outer join emp e on e.deptno=d.deptno;
select e.ename, e.job, ec.name from emp e ,emp_cards ec where e.empno=ec.empid;
select e.ename, e.job, ec.name from emp e right outer join emp_cards ec on e.empno=ec.empid;
select e.ename, e.job, ec.name from emp e left outer join emp_cards ec on e.empno=ec.empid;

-- self jpin --
select e1.ename, e2.ename from emp e1, emp e2 where e1.mgr=e2.empno;
select e1.empno ,e1.ename, e2.mgr, e2.ename from emp e1, emp e2 where e1.mgr=e2.empno;

-- subquery --
/* scaler, virtual/derived, nested  */

-- scaler --
select (select sal from emp where ename='jones') - (select sal from emp where ename='james') diff;
select (select sum(sal) from emp) - (select sum(sal) from emp) diff;
select (select sum(sal) from emp where deptno=20) - (select sum(sal) from emp where deptno=10) diff;
select abs( (select sum(sal) from emp where deptno=10) - (select sum(sal) from emp where deptno=20)) diff;
select (select sum(sal) from emp where deptno=10)sal1 , (select sum(sal) from emp where deptno=20) sal2;

-- virual --
select * from (select * from dept)e;
select * from (select ename ,job,sal,comm from emp)e;
select * from (select row_number() over()r1 , ename ,job,sal,comm from emp)e where r1>15 ;
select * from (select row_number() over()r1 , ename ,job,sal,comm from emp)e where r1=24 ;
select row_number() over()r2 ,ename,job,sal,comm,r1  from (select row_number() over()r1 , ename ,job,sal,comm from emp)e ; 
select max(r1) from (select max(sal)r1 from emp)e;
select min(r1) from (select min(sal)r1 from emp)e;
select job,r1 from (select job,count(*)r1 from emp group by job)e;
select * from (select ename,job,sal,comm,dense_rank() over(order by sal )r1 from emp)e;
select * from (select ename,job,sal,comm,dense_rank() over(order by sal )r1 from emp)e where r1=2;

-- nested --
select ename,job,sal from emp where deptno = (5+5);
select ename,sal from emp where sal > (select sal from emp where ename='jones');
select ename,hiredate from emp where hiredate > (select hiredate from emp where ename='jones');
select ename,sal from emp where sal  <= (select max(sal) from emp); 
select ename, sal from emp where sal  < (select max(sal) from emp)order by sal desc; 
select ename,job,sal from emp where sal = (select distinct sal from emp order by sal desc limit 3,1);
select distinct * from (select deptno, if(deptno=10,'x',if(deptno=20,'y',NULL))r1 from emp) e;
select distinct * from (select deptno, if(deptno=10,'x',if(deptno=20,'y',NULL))r1 from emp) e where r1 is not null;
select distinct * from (select deptno, if(deptno=10,'x',if(deptno=20,'y',NULL))r1 from emp) e where r1 is not null;