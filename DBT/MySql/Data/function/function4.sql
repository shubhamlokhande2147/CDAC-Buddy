/* use campus */

drop function if exists calculate_sum ;
delimiter $
create function calculate_sum(_sid int) returns int
DETERMINISTIC
begin

   declare x int;
   set x :=0;
    
	SELECT sum(marks) into x from student s join student_qualifications sq on s.id=sq.studentid where s.id=_sid;
	     return x;

 
end $
delimiter ;