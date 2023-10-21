/* use campus database*/

drop trigger if exists presc;
delimiter $
create trigger presc before insert on patient_pres for each row
BEGIN
	DECLARE flag BOOLEAN;
	set flag=true;
	select FALSE into flag FROM patient_reg where  pid=new.pid;
	if flag THEN
	 	signal sqlstate '45000' set message_text = "Person is not a registered  patient";
	end if;

END $
delimiter ;