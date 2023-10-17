
DROP PROCEDURE if EXISTS checkUser ;
delimiter $
CREATE PROCEDURE checkUser(_emailid varchar (50))
BEGIN
     DECLARE flag bool;
             SELECT true into flag from login where emailid=_emailid;
             if flag THEN
               SELECT * from login where emailid=_emailid ;
            else
               SELECT "ERROR";
             end if;       
END $
delimiter ;        