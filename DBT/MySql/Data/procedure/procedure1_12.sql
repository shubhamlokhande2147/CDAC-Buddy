drop procedure if exists que12;
delimiter $
create procedure que12(cid int)
BEGIN
 
      select c.cname,o.* from customers c join orders o on c.cnum=o.cnum where c.cnum=cid;
  
end $
delimiter ;