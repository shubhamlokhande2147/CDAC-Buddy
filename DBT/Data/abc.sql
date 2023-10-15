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