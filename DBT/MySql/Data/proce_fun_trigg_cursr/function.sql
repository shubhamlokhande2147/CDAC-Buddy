
/*  use sirji_table DB

Drop function if exists f1 ;
delimiter $
create function f1() returns int 
deterministic
begin

          return 20;
     
end $
delimiter ;


*/

/*
drop function if exists f2 ;
delimiter $ 
create function f2(x int, y int) returns int 
deterministic
begin 
       declare z int;
        set z:=x+y;
        return z;

end $
delimiter ;
*/

/*
 use sirji_table
 
drop function if exists f3 ;
delimiter $ 
create function f3() returns int 
deterministic
begin 
       declare z int;
       select max(deptno) + 1 into z from dept;
        return z;

end $
delimiter ;
*/


Drop function if exists f1 ;
delimiter $
create function f1() returns int 
deterministic
begin
          call pro1();
          return 1;
     
end $
delimiter ;

Drop procedure if exists pro1 ;
delimiter $
create procedure pro1() 
begin
        declare z int;
        set z:=0;
        select max(sal) into z from emp limit 1,1;
        select z;
end $
delimiter ;


