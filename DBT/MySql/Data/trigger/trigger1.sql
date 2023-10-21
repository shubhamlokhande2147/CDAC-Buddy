
/* select sirji_table database  */

 drop trigger if exists queT1;
delimiter $
create trigger queT1  before insert on insertStudent for each row 
BEGIN
	insert into LOG1 values(new.id,new.name,"Record inserted successfully");
END $
