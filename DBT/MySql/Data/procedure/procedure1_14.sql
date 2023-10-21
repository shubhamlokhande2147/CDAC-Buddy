drop procedure if exists que14 ;
delimiter $
create procedure que14(num int)
BEGIN
   DECLARE a INT;
   set a:=0;
   
   set @x=" ";
   set @y=" ";
   set @z=" ";
   set @z1=" ";  

    lbl : LOOP
           set a :=a+1;
           set @x := substring(num,a,1);

           set @y = @y + @x;
          
          if a > LENGTH(num)-1 THEN
                    leave lbl;
                    end if; 
    end LOOP lbl;           
    

                set @z :=substring(@y,1,1);
                 

             if(@z=0) THEN 
              set @z1:=concat(@z1,'Zero ');
             end if;

            if(@z=1) THEN 
              set @z1:=concat(@z1,'One ');
             end if;
                              
             if(@z=2) THEN 
              set @z1:=concat(@z1,'Two ');
             end if;
                 
             if(@z=3) THEN 
              set @z1:=concat(@z1,'Three ');
             end if;
              
             if(@z=4) THEN 
              set @z1:=concat(@z1,'Four ');
             end if;
                 
             if(@z=5) THEN 
              set @z1:=concat(@z1,'Five ');
             end if;
              
             if(@z=6) THEN 
              set @z1:=concat(@z1,'Six ');
             end if;
                 
             if(@z=7) THEN 
              set @z1:=concat(@z1,'Seven ');
             end if;
              
             if(@z=8) THEN 
              set @z1:=concat(@z1,'Eight ');
             end if;
                 
             if(@z=9) THEN 
              set @z1:=concat(@z1,'Nine ');
             end if;





select @z1;
end $
delimiter ;