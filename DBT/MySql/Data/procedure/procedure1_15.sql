drop procedure que14 ;
delimiter $ 
create procedure que14(d1 date,d2 date)
BEGIN
       select d1,d2,extact(subdate(d1,d2));
end $
delimiter ;