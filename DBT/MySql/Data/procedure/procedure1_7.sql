
DROP PROCEDURE if EXISTS pro1 ;
delimiter $
CREATE PROCEDURE pro1(name varchar(200))
BEGIN
        DECLARE a INT;
        set a=0;

        set @x=" ";
        set @y=" ";

        lb:LOOP
           set a =a+1;
           set @x = substring(name,a,1);

               if(@x BETWEEN 'a' AND 'z') THEN 
                   set @y=concat(@y,@x);
                   SELECT @y;
                   
                    if a > LENGTH(name)-1 THEN
                    leave lb;
                    end if;
               end if;                 
        end LOOP lb;

END $
delimiter ;        