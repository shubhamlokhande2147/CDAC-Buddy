   
DROP PROCEDURE IF EXISTS addQualification;
delimiter $
 CREATE PROCEDURE addQualification( id int,pstudentID  int, name varchar(20),college varchar(20),university varchar(50) ,marks int,year1 varchar(10))
 BEGIN
	declare  x bool;
	select true into  x from  student s where s.ID=pstudentID;
    IF  x=true then 
	insert into student_qualifications VALUES(id,pstudentID,name,college,university,marks,year1);
	select "Record inserted";
	else 
	 select "Student not found";
	end if;
 end $
 delimiter ;
