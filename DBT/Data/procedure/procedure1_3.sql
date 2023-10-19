
DROP PROCEDURE if EXISTS pro1 ;
delimiter $
CREATE PROCEDURE pro1(name varchar(200))
BEGIN
        DECLARE a INT;
        set a=0;

        set @x:=" ";
        set @y:=" ";
        set @z:=" ";

        lb:LOOP
           set a :=a+1;
           set @x := substring(name,a,1);

               if(@x BETWEEN 'a' AND 'z') THEN 
                   set @y:=concat(@y,@x);
                     end if;
               if(@x BETWEEN '0' AND '9') THEN 
                    set @z:=concat(@z,@x);
                    end if;
                    
                    if a > LENGTH(name)-1 THEN
                    leave lb;
                    end if; 
               
                                
        end LOOP lb;
                           SELECT @y As String;
                           SELECT @z As Number;  


END $
delimiter ;        