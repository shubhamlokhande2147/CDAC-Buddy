DROP PROCEDURE if EXISTS addQualification ;
delimiter $
CREATE PROCEDURE addQualification(studid int, id int, nm varchar(20),clg varchar(20),unity varchar(20),mrks varchar(20),year int)
BEGIN
           DECLARE flag bool;
             SELECT true into flag from student where id = studid; 
             if flag THEN
                  insert into student_qualifications(id,studentID,name,college,university,marks,year) values (id,studid,nm,clg,unity,mrks,year);
                  SELECT "Date Inserted";
              
              else                               
                 SELECT "Student Present" as 'ERROR';


             end if;  

        
END $
delimiter ;    