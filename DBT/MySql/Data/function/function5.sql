

drop function if exists otp2 ;
delimiter $
create function opt2() returns int
deterministic
BEGIN

  select FLOOR(rand()*900000)+100000 INTO @x;
  return @x;
   
end $
delimiter ;