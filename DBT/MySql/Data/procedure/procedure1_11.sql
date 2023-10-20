drop procedure if exists que11;
delimiter $
create procedure que11()
BEGIN
    --  set @dno=0;
    --     set @p="select deptno from emp where empno=1";
    --     prepare p1 from @p;
    --     execute p1;
    --     lbl:LOOP
        
           select concat(deptno,' -> ',group_concat(ename)) from emp group by deptno ;
--    leave lbl;
--         end LOOP lbl;
end $
delimiter ;