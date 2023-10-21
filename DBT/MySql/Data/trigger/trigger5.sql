/* use campus database*/


drop trigger if exists sunday;
delimiter $
create trigger sunday before insert on student for each row
BEGIN
	if dayname(now()) = "sunday" then 
		signal sqlstate '42000' set message_text = "today is sunday insertion is not available! ";
	else 
		insert into student_log values(new.id,new.namefirst,new.namelast,new.dob,new.emailID);
	end if;
end $
delimiter ; 