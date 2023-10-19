
DROP PROCEDURE if EXISTS pro1 ;
delimiter $
CREATE PROCEDURE pro1(str varchar(50))
BEGIN

   declare x int ;
   set x:=0;
   set @t=" ";
 
             lb1:LOOP
             set x:=x+1;
            set @s= SUBSTRING(str, x, 1);
             
                 set @t = concat(@t,@s,",");
               if x > length(str)-1 
               THEN            
               leave lb1;
             end if;
               end LOOP lb1; 
               select @t;
              
END $
delimiter ;        