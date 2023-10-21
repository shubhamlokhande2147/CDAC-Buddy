/* use campus database*/

drop trigger if exists Voting;
delimiter $
create trigger Voting before insert on R for each row
BEGIN
	if new.age<18 then 
		signal sqlstate '45000' set message_text = "Person not eligible for voting";
	end if;
END $   
delimiter ;