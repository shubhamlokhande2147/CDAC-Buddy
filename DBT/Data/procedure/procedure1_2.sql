
DROP PROCEDURE if EXISTS pro1 ;
delimiter $
CREATE PROCEDURE pro1(str varchar(50))
BEGIN

   declare x int ;
   declare y int;
   declare z varchar (50);

   set x:=0;
   set y:=0;
   set y:=length(str);
   set z=" ";

             lb1:LOOP
             set x:=x+1;
                
               if x <= y THEN 
                  SELECT concat(z,group_concat(SUBSTRING(str, x, 1),',')) as string;
             else            
               leave lb1;
            
             end if;
               end LOOP lb1; 
              
END $
delimiter ;        