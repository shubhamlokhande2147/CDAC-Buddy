
DROP PROCEDURE if EXISTS addStudent ;
delimiter $
CREATE PROCEDURE addStudent(studid int,nmft varchar (20),nmlt varchar (20),dob date,email varchar (50),id1 int ,num int , isact tinyint(1) )
BEGIN
        DECLARE exit handler for 1062 SELECT 'Data Present' As 'Error';
        INSERT INTO student(ID,namefirst,namelast,DOB,emailID) values (id,nmft,nmlt,dob,email);
        --INSERT INTO student_phone(ID,studentid,number,isActive) values (id1,studid,num,isact);
END $
delimiter ;        