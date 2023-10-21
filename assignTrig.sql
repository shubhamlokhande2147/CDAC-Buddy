/*
 -- trig1->

 drop trigger if exists queT1;
delimiter $
create trigger queT1  before insert on insertStudent for each row 
BEGIN
	insert into LOG1 values(new.id,new.name,"Record inserted successfully");
END $
delimiter ; */

/*
 -- trig2->
 drop trigger if exists insertDuplicate;
delimiter $
create trigger insertDuplicate before insert on student for each row
BEGIN 
	insert into student_log values(new.id,new.namefirst,new.namelast,new.dob,new.emailID);
End $
delimiter ; */

/* 
 -- trig3->
drop trigger if exists updateT;
delimiter $
create trigger updateT after update on student for each row
BEGIN 
	insert into student_log values(new.id,new.namefirst,new.namelast,new.dob,new.emailID);
End $
delimiter ; */

/* added date extra ni in assignment */ 
/* drop trigger if exists updateT;
delimiter $
create trigger updateT after update on student for each row
BEGIN 
	insert into student_log values(new.id,new.namefirst,new.namelast,new.dob,new.emailID,CURRENT_DATE());
End $
delimiter ;  */

/* 
 -- trig4->
drop trigger if exists deltrig;
delimiter $
create trigger deltrig  after DELETE on student1 for each row
BEGIN
	insert into student_log values(old.id,old.namefirst,old.namelast,old.dob,old.emailID);
end $
delimiter ; */

/* 
 -- trig5->
drop trigger if exists sunday;
delimiter $
create trigger sunday before insert on student1 for each row
BEGIN
	if dayname(now()) = "sunday" then 
		signal sqlstate '42000' set message_text = "today is sunday insertion is not available! ";
	else 
		insert into student_log values(new.id,new.namefirst,new.namelast,new.dob,new.emailID);
	end if;
end $
delimiter ; */


/* 
 -- trig1_1->
drop trigger if exists Voting;
delimiter $
create trigger Voting before insert on RX100 for each row
BEGIN
	if new.age<18 then 
		signal sqlstate '45000' set message_text = "Person not eligible for voting";
	end if;
END $   
delimiter ; */

/*
 -- trig1_2-> 
drop trigger if exists presc;
delimiter $
create trigger presc before insert on patient_pres for each row
BEGIN
	DECLARE flag BOOLEAN;
	set flag=true;
	select FALSE into flag FROM patient_reg where  pid=new.pid;
	if flag THEN
	 	signal sqlstate '45000' set message_text = "Person is not a registered  patient";
	end if;

END $
delimiter ;
 */
 