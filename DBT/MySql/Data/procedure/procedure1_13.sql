drop procedure if exists que13;
delimiter $
create procedure que13(num varchar(20))
BEGIN
        DECLARE a INT;
        set a:=0;
        set @y:=" ";

  

          lbl:LOOP
           set a :=a+1;
           set @x := substring(num,a,1);

            if(@x=0) THEN 
              set @y:=concat(@y,'Zero ');
             end if;
                    
            if(@x=1) THEN 
              set @y:=concat(@y,'One ');
             end if;

             if(@x=2) THEN 
              set @y:=concat(@y,'Two ');
             end if;
                    
             if(@x=3) THEN 
              set @y:=concat(@y,'Three ');
             end if;
              
             if(@x=4) THEN 
              set @y:=concat(@y,'Four ');
             end if;
                    
             if(@x=5) THEN 
              set @y:=concat(@y,'Five ');
             end if;
            
             if(@x=6) THEN 
              set @y:=concat(@y,'Six ');
             end if;
                    
            if(@x=7) THEN 
              set @y:=concat(@y,'Seven ');
             end if;

             if(@x=8) THEN 
              set @y:=concat(@y,'Eight ');
             end if;
                    
             if(@x=9) THEN 
              set @y:=concat(@y,'Nine ');
             end if;
        
          if a > LENGTH(num)-1 THEN
                    leave lbl;
                    end if; 
           
           end LOOP lbl;
             select @y;
end $
delimiter ;