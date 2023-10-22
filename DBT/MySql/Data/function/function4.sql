/*  use campus db  */

drop FUNCTION if exists calculate_sum;
delimiter $
create FUNCTION calculate_sum(_sid int) returns int
deterministic
BEGIN
set @msum=0;
	SELECT sum(marks) into @msum from student s join student_qualifications sq on s.id=sq.studentid where s.id=_sid;
	return  @msum;
end $
delimiter ;