/*
drop function if exists f1 ;
delimiter $ 
create function f1() return int
deterministic
begin 
   
     select * from dept;
     return (0);

end $
delimiter ;

*/
drop function if exists f2 ;
delimiter $ 
create function f2() return table 
deterministic
begin 
select * from dept;
    RETURN 0  ;

end $
delimiter ;