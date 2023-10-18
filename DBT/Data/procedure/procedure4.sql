
DROP PROCEDURE if EXISTS addStudent ;
delimiter $
CREATE PROCEDURE addStudent(studid int,nmft varchar (20),nmlt varchar (20),dob date,email varchar (50),pid int ,num int , isact tinyint(1),aid int, adr varchar(20))
BEGIN
        INSERT INTO student(id,namefirst,namelast,DOB,emailID) values (studid,nmft,nmlt,dob,email);
        INSERT INTO student_phone(ID,studentID,number,isActive) values (pid,studid,num,isact);
        INSERT INTO student_address(id,studentID,address) values (aid,studid,adr);
END $
delimiter ;        