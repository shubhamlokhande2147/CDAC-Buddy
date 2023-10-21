

drop trigger if exists deltrig;
delimiter $
create trigger deltrig  after DELETE on student for each row
BEGIN
	insert into student_log values(old.id,old.namefirst,old.namelast,old.dob,old.emailID);
end $
delimiter ;