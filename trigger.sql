

/* drop trigger if exists trig1;
delimiter $
create trigger trig1 before insert on d3 for each ROW
BEGIN
	insert into d4 value(NEW.DEPTNO, NEW.NAME, NEW.LOC);
end $
delimiter ; */

drop trigger if exists trig1;
delimiter $
create trigger trig1 before insert on d3 for each ROW
BEGIN
	insert into d4 value(NEW.DEPTNO, NEW.NAME, NEW.LOC,CURRENT_DATE(), CURRENT_TIME(),user());
end $
delimiter ; 

drop trigger if exists trig2;
delimiter $
create trigger trig2 before delete on d3 for each ROW
BEGIN
	insert into d5 value(OLD.DEPTNO, OLD.NAME, OLD.LOC,CURRENT_DATE(), CURRENT_TIME(),user());
end $
delimiter ; 

/*
drop trigger if exists trig3;
delimiter $
CREATE TRIGGER trig3 before insert on d3 for each row
BEGIN 
	if dayname(now()) = 'Sunday' THEN
		signal sqlstate '42000' set message_text='Invalid transaction, because to is Monday';
	end if;
	
end $
delimiter ; 

*/


 drop trigger if exists trig4;
delimiter $
CREATE TRIGGER trig4 before insert on d3 for each row
BEGIN 

  declare z int;
	select max(deptno) + 1 into z from d3;
	set new.deptno = z;
  	
end $
delimiter ; 
  
  
drop trigger if exists trig4;
delimiter $
CREATE TRIGGER trig4 before insert on d3 for each row
BEGIN 

  declare z int;
	select max(deptno) + 1 into z from d3;
	set new.deptno = z;
	if z>62 THEN 
	signal sqlstate "42000" set message_text="ERROR Limit exceeded! ";
	end if;

  	
end $
delimiter ; 

drop trigger if exists tr10;
delimiter $
create trigger tr10 before insert on d3 for each ROW
BEGIN
	set new.name = upper(new.name);
end  $
delimiter ;
/* 
drop trigger if exists tr11;
delimiter $
create trigger tr11 after insert on a3 for each ROW
BEGIN
	insert into b3 values(new.c1);
end  $
delimiter ; */

drop trigger if exists tr11;
delimiter $
create trigger tr11 before insert on a3 for each ROW
BEGIN
	insert into b3 values(new.c1);
end  $
delimiter ;