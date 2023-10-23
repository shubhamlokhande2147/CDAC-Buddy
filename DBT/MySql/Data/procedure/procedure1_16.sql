drop procedure que14 ;
delimiter $ 
create procedure que14(d1 date,w2 int)
BEGIN
       select d1+ weekday(w2);
end $
delimiter ;