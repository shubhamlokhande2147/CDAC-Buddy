 drop procedure if exists que8;
delimiter $
create procedure que8()
BEGIN
	SET @x :=0;
	l1:LOOP
		set @x:=@x+1;
		if (@x%2=0) THEN
			insert into R1 values(@x,'i is even');
		else 
			insert into R1 values(@x,'i is odd');
		end IF;
		if (@x>=10) THEN
			leave l1;
		end if;

	end loop l1;

    select * from R1;
end $
delimiter ;