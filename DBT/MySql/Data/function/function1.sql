Drop function if exists sumSalaty ;
delimiter $
create function sumSalaty(_deptno int ) returns int 
deterministic
begin

     declare z int ;
     select sum(sal) into z from emp where deptno=_deptno;

     return z;
 
end $
delimiter ;
