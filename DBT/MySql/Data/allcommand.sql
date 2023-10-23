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


/* 
  view - simple ,complex

*/


select * from dept;
create or replace view v1 as select * from dept;
show full tables;
select * from v1;
create or replace view v2 as select deptno,dname,startedon from dept;
insert into v1 values(1,1,1,1,1);
insert into v2 values(2,2);
select * from dept;
update v2 set loc='kolhapur' where deptno=2;

select empno,ename,job,deptno from emp; 
create or replace view v3 as select empno,ename,job,deptno from emp where deptno=10;
update v3 set job='SALESMANAGER' where ename='AARAV';  
select * from v3;  
select * from emp where deptno=10;

create or replace view v4 as select * from emp;
alter table emp add column c1 int;
select * from v4; -- no add c1 column in v4

-- view with alias nm
create or replace view v5 as select deptno,dname 'Department name' from dept;
select * from v5;

create table x1(c1 int ,c2 int);  
create or replace view x2 as select c1,c2 ,c1+c2 R1 from x1;
insert into x1(c1,c2) values(10,10);
select * from x1;
select * from x2;  


/* stored variabe */

set @x1:=now();
select @x1;

select 10+10 into @x2;
select @x2;

set 10+20, 10*20 into @x3,@x4;    
select @x1,@x2,@x3,@x4;

select ename into @x5 from emp limit 1 ;
select @x5;

select max(sal) into @x6 from emp limit 1;
select @x6;

select max(sal),min(sal) into @x6,@x7 from emp limit 1;
select @x6,@x7;

/* subsets : union ,intersection */
select * from books;
select * from newbooks;

select bookname from books union select bookname from newbooks;
select bookname from books union all select bookname from newbooks;

select bookname from books intersect select bookname from newbooks;
select bookname from books intersect all select bookname from newbooks;

select bookname from books except select bookname from newbooks;
select bookname from books except all select bookname from newbooks;

select o.bookname , n.bookname from books o left outer join newbooks n on o.bookname=n.bookname;  
select o.bookname , n.bookname from books o right outer join newbooks n on o.bookname=n.bookname;    
select o.bookname , n.bookname from books o left outer join newbooks n on o.bookname=n.bookname union select o.bookname , n.bookname from books o right outer join newbooks n on o.bookname=n.bookname;
select o.bookname , n.bookname from books o left outer join newbooks n on o.bookname=n.bookname intersect select o.bookname , n.bookname from books o right outer join newbooks n on o.bookname=n.bookname;
select o.bookname , n.bookname from books o left outer join newbooks n on o.bookname=n.bookname except select o.bookname , n.bookname from books o right outer join newbooks n on o.bookname=n.bookname;


/* group concat */
select job,group_concat(ename) from emp group by job;
select deptno,group_concat(ename) from emp group by deptno;

/* index : clustered and non-clustered */

select empno,ename,job,sal from emp;
explain select empno,ename,job,sal from emp; 

select empno,ename,job,sal from emp where job='manager'; 
explain select empno,ename,job,sal from emp where job='manager';  --all records are check

select empno,ename,job,sal from emp where empno=7788; 
explain select empno,ename,job,sal from emp where empno=7788;      --1 records are chesk ,bcoz pk assign to empno

create index ind1 on emp(job);
select empno,ename,job,sal from emp where job='manager';
explain select empno,ename,job,sal from emp where job='manager';  --5 records are chesk ,bcoz in1 index is assign to job
show indexes from emp;
desc emp;

create table x(c1 int ,c2 int);
create index ind2 on x(c2);
show indexes from x;
desc x;
insert into x values (2,2);
insert into x values (2,2);
explain select * from x where c1=1;  --all row are checks
explain select * from x where c1=1;  --1 row is check,bcoz ind 2 assign to c2 column

drop index ind2 on x;  --drop index

create unique index ind2 on x(c2);
show indexes from x;
insert into x values (33,33);
