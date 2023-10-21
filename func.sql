
drop function if exists sumSalary;
delimiter $
create function sumSalary(_deptno int) RETURN int 
deterministic
BEGIN
   DECLARE @z int;
   SELECT sum(sal) into @z from emp where deptno=_deptno ;
   return @z;
END $
delimiter ;