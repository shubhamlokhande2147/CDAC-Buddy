/* use campus database*/

drop trigger if exists updateT;
delimiter $
create trigger updateT after update on student for each row
BEGIN 
	insert into student_log values(new.id,new.namefirst,new.namelast,new.dob,new.emailID);
End $
delimiter ;