/* select campus database  */


 drop trigger if exists insertDuplicate;
delimiter $
create trigger insertDuplicate before insert on student for each row
BEGIN 
	insert into student_log values(new.id,new.namefirst,new.namelast,new.dob,new.emailID);
End $
delimiter ;