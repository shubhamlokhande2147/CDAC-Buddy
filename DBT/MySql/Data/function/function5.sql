drop FUNCTION if exists otp_generator;
delimiter $
create FUNCTION otp_generator() returns int
deterministic
BEGIN
	SELECT FLOOR(rand()*900000)+100000 INTO @otp;
	return  @otp;
end $
delimiter ;