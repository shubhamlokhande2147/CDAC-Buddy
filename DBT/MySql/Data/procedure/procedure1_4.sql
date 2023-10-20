
DROP PROCEDURE if EXISTS pro1 ;
delimiter $
CREATE PROCEDURE pro1(name varchar(200))
BEGIN
        DECLARE a INT;
        set a=0;
        

        set @x=" ";
        set @y=" ";
        set @z=" ";
        
        lb:LOOP
           set a =a+1;
           set @x = substring(name,1,1);
           set @y = substring(name,2,4);
           set @z = substring(name,5);


               set @p := concat(@x,'(',@y,')',' is ',@z); 


                    if a > LENGTH(name)-1 THEN
                    leave lb;
                    end if; 
               
        end LOOP lb;               
        SELECT @p;


END $
delimiter ;        