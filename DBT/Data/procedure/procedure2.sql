
DROP PROCEDURE if EXISTS checkUser ;
delimiter $
CREATE PROCEDURE checkUser(p varchar (50))
BEGIN
     DECLARE flag bool;
             SELECT true into flag from login where emailid=p;
             if flag THEN
               SET @x:=concat("SELECT * from login where emailid=p") ;
               prepare z from @x;
               execute z;
            else
               SELECT "ERROR";
             end if;       
END $
delimiter ;        