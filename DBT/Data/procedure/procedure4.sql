
DROP PROCEDURE if EXISTS addStudent ;
delimiter $
CREATE PROCEDURE addStudent(id int,nmft varchar (20),nmlt varchar (20),dob date,email varchar (50))
BEGIN
        DECLARE exit handler for 1062 SELECT 'Data Present' As 'Error';
        INSERT INTO student(ID,namefirst,namelast,DOB,emailID) values (id,nmft,nmlt,dob,email);
END $
delimiter ;        