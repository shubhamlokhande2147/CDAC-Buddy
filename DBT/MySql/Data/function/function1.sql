
/*  use sirji_table db  */

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
/*
drop function if exists que1;
delimiter $
create function que1(_deptno int) returns int
deterministic
BEGIN
    declare sum1 int;
    declare count1 int;
    declare temp int;
    set sum1:=0;
    select count(*) into count1 from emp where deptno=_deptno group by deptno;
    l1:loop
        set count1=count1-1;
        if count1>=0 then
            select sal into temp from emp where deptno=_deptno limit 1,1;
            set sum1=sum1+temp;

        else 
            leave l1;
        end if;
    end loop l1;
    return sum1;
END $
delimiter ;
*/
