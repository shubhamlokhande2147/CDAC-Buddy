
DROP PROCEDURE if EXISTS addUser ;
delimiter $
CREATE PROCEDURE addUser(v1 varchar (20),v2 varchar (20),v3 varchar (20))
BEGIN
        DECLARE exit handler for 1062 SELECT 'Database Present' As 'Error';
        INSERT INTO login values (v1,v2,v3);
END $
delimiter ;        