drop procedure if exists que11;
delimiter $
create procedure que11()
BEGIN
   
        	-- DECLARE _deptno int;
            -- 	DECLARE c1 cursor for select deptno from dept;
            -- open c1;
            -- lbl :Loop 
	        -- FETCH c1 into _deptno;
            -- select _deptno;

           select concat(deptno,' -> ',group_concat(ename)) from emp group by deptno ;
           
        --    end Loop lbl;
        --    close c1;

end $
delimiter ;