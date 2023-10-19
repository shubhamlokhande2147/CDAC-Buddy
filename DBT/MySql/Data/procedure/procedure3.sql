
DROP PROCEDURE if EXISTS getQualification ;
delimiter $
CREATE PROCEDURE getQualification(studid int)
BEGIN
     DECLARE flag bool;
             SELECT true into flag from student where id = studid; 
             if flag THEN
                 SELECT * from student s join student_qualifications sq on s.id=sq.studentID where s.id = studid; 
              else 
                  SELECT "Student not found" as 'ERROR';
             end if;       
END $
delimiter ;        