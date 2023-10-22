
/*
drop procedure if exists pro1;
delimiter $
create PROCEDURE pro1()
begin
	DECLARE _deptno int;
	DECLARE _dname,_loc,_pwd,_startedon VARCHAR(100);
	DECLARE c1 CURSOR for select * from dept;

	open c1;
	1b1: LOOP
		FETCH c1 into _deptno,_dname,_loc,_pwd,_startedon;
		SELECT _deptno,_dname,_loc,_pwd,_startedon;
	end LOOP 1b1;
		CLOSE c1;
	End $
delimiter ;

*/

/*
drop procedure if exists pro1;
delimiter $
create PROCEDURE pro1()
begin
	DECLARE _deptno int;
	DECLARE _dname,_loc,_pwd,_startedon VARCHAR(100);

	DECLARE c1 CURSOR for select * from dept;
 
    DECLARE EXIT handler for 1329 SELECT "EOF";     
 
 open c1;
	1b1: LOOP
		FETCH c1 into _deptno,_dname,_loc,_pwd,_startedon;
		SELECT _deptno,_dname,_loc,_pwd,_startedon;
	end LOOP 1b1;
		CLOSE c1;
	End $
delimiter ;

*/

/*
drop procedure if exists pro1;
delimiter $
create PROCEDURE pro1(IN x int)
begin
	DECLARE _deptno int;
	DECLARE _dname,_loc,_pwd,_startedon VARCHAR(100);

	DECLARE c1 CURSOR for select * from dept where deptno=x;
 
    DECLARE EXIT handler for 1329 SELECT "EOF";     
 
 open c1;
	1b1: LOOP
		FETCH c1 into _deptno,_dname,_loc,_pwd,_startedon;
		SELECT _deptno,_dname,_loc,_pwd,_startedon;
	end LOOP 1b1;
		CLOSE c1;
	End $
delimiter ;

*/

drop procedure if exists pro1;
delimiter $
create PROCEDURE pro1(IN x int)
b1: begin
    declare flag bool;
   select DISTINCT true into flag from emp where deptno=x;
   
   
   if flag THEN
	b2: BEGIN
	DECLARE _sal,_deptno int;
	DECLARE _ename,_job VARCHAR(100);


	DECLARE c1 CURSOR for select ename,job,sal,deptno from emp where deptno=x;
	
	open c1;
		lb1: loop
			fetch c1 into _ename,_job,_sal,_deptno;
			select _ename,_job,_sal,_deptno;
		end loop;
	close c1;
	end b2;
	ELSE
		select "invalid deptno";
	end if;
	end b1 $
delimiter ;     
 
