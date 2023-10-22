/*
drop procedure if exists Q1;
delimiter $
create PROCEDURE Q1()
BEGIN
	SELECT "Hello world";
END $
delimiter ;


*/

/* drop procedure if exists Q1;
delimiter $
create PROCEDURE Q1(IN x int ,IN y int)

BEGIN

   SELECT x + y as 'ADD';

END $
delimiter ; */

/*
drop procedure if exists Q1;
delimiter $
create PROCEDURE Q1(IN x int ,IN y int, OUT z int)

BEGIN
	set z:=x+y;
   

END $
delimiter ;

*/

/* drop procedure if exists Q1;
delimiter $
create PROCEDURE Q1(IN x int ,IN y int, OUT z1 int,OUt z2 int,OUt z3 int,OUt z4 int)

BEGIN
	set z1:=x+y;
	set z2:=x*y;
	set z3:=x-y;
	set z4:=x/y;
   

END $
delimiter ; */

/*
drop procedure if exists Q1;
delimiter $
create PROCEDURE Q1(IN x int)

BEGIN
  
  IF x>100 THEN
	SELECT 'Number is greater than 100';
	ELSE
		SELECT 'Number is smaller than 100';
	end if;

END $
delimiter ;

*/


/* drop PROCEDURE if EXISTS proq1;
delimiter $
create PROCEDURE proq1(IN y int)
BEGIN	
	DECLARE x int;
	set x:=0;
	set @z="";
	ib1l:LOOP
		SET x:=x+1;
		if x>10 THEN
			LEAVE ib1l;
		end if;
		set @z:=CONCAT(@z,' ',x*y);
		SELECT x*y;
	end LOOP ib1l;
END $
delimiter ; */


/*

drop PROCEDURE if EXISTS proq2;
delimiter $
create PROCEDURE proq2()
BEGIN	
 declare exit handler for 1062 select "Data already present" as 'Error Window';
 
    INSERT INTO d values (2,'shubham','PG-DAC');

END $
delimiter ;

*/

/* Not executed
drop PROCEDURE if EXISTS proq3;
delimiter $
create PROCEDURE proq3(IN P1 int,IN P2 varchar(30), In P3 varchar(30));
BEGIN	
	
	if P3 = 'PGDAC' THEN
		Insert Into d values (P1,P2,P3);
	ELSE
		Select "Invalid department";
	END IF;
END $
delimiter ;
*/

/*

drop PROCEDURE if EXISTS proq4;
delimiter $
create PROCEDURE proq4(_deptno int)
BEGIN
	select * from dept where deptno=_deptno;
END $
delimiter ;


*/



/* drop PROCEDURE if EXISTS proq5;
delimiter $
create PROCEDURE proq5(_deptno int,_c1 int ,_name varchar(20),_dept varchar (20))
BEGIN
declare flag bool;
    select true into flag from dept where deptno=_deptno; 
  
  if flag THEN
        INSERT into d values (_c1,_name,_dept);                 
			select "Record inserted ..!";
			
   ELSE 
      	select "Record not found...!";
	   
	end if;
	
END $
delimiter ; */

/* drop PROCEDURE if EXISTS proq6;
delimiter $
create PROCEDURE proq6()
BEGIN
	DECLARE exit handler for 1050 select "Table alredy present";
	
	create table c121(c1 int PRIMARY KEy auto_increment, c2 int UNIQUE);


	
END $
delimiter ;
 */

/*
drop PROCEDURE if EXISTS proq6;
delimiter $
create PROCEDURE proq6()
BEGIN
	DECLARE exit handler for 1051 select "Table alredy deleted";
	
	drop table c121;
	
END $
delimiter ;


*/


/* 
drop PROCEDURE if EXISTS proq7;
delimiter $
create PROCEDURE proq7()
BEGIN

   select row_number() over() R1,ename,job,sal from emp;
 	
END $
delimiter ;
 */
 
 
-- drop PROCEDURE if EXISTS proq8;
-- delimiter $
-- create PROCEDURE proq8(x int)
-- BEGIN

   -- select row_number() over() R1,ename,job,sal from emp limit x;
 	
-- END $
-- delimiter ;



/* drop PROCEDURE if EXISTS proq9;
delimiter $
create PROCEDURE proq9(start int,end int)
BEGIN

   select row_number() over() R1,ename,job,sal from emp limit start,end;
 	
END $
delimiter ; */

drop PROCEDURE if EXISTS proq10;
delimiter $
create PROCEDURE proq10(x int)
BEGIN
   DECLARE y int;
   DECLARE z int;
   set y:= (SELECT count(*) from emp);
   set z:=y-1;
   select ename,job,sal from emp limit z,x;
 	
END $
delimiter ; 




/*
drop PROCEDURE if EXISTS proq11;
delimiter $
create PROCEDURE proq11(IN P1 int,IN P2 varchar(30), In P3 varchar(30))
BEGIN	
	set @x1:=P1;
	set @x2:=P2;
	set @x3:=P3;
	set @y:="Insert Into d values (?,?,?)";
	prepare z from @y;
	EXECUTE z using @x1,@x2,@x3;
END $
delimiter ;
 
 */
