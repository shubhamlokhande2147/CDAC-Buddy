
DROP PROCEDURE if EXISTS checkUser ;
delimiter $
CREATE PROCEDURE checkUser(p varchar (50),message varchar (200))
BEGIN
     DECLARE flag bool;
             SELECT true into flag from login where emailid=p;
             if flag THEN
                 SELECT username,password from login;
              
            else
                 INSERT into log (curr_date,curr_time,message) values (current_date(),current_time(),message);
               SELECT "Data inserted";
             end if;       
END $
delimiter ;        