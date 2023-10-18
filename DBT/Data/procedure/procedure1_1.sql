
DROP PROCEDURE if EXISTS pro1 ;
delimiter $
CREATE PROCEDURE pro1(str varchar(50))
BEGIN
-- set @x =" ";
 declare y int;
set y:=0;
--            -- lb1:LOOP
             --set y:=y+1;
                select left(str,y);
                
            --end LOOP lb1;
       
END $
delimiter ;        