
/*

drop procedure if exists p1 ;
delimiter $
create procedure p1(str varchar(20))
begin 
         declare a int;     
          set a:=0;
        
      lbl :LOOP
        set a:=a+1;
        set @x1 = substring(str,a,1);
        select @x1;

         if a>=length(str) THEN
           leave lbl;
         end if;
      
      end LOOP lbl;  
end$
delimiter ;

*/



/*


drop procedure if exists p1 ;
delimiter $
create procedure p1(str varchar(20))
begin
    
        
      declare a int;     
          set a:=0;
        set @t=" ";
      lbl :LOOP
        set a:=a+1;
        set @x1 = substring(str,a,1);
          select @x1;

  set @t:= concat(@t,@x1,',');

         if a>=length(str) THEN
           leave lbl;
         end if;
      
      end LOOP lbl;  
   select @t;
end$
delimiter ;


*/

/*

drop procedure if exists p2 ;
delimiter $
create procedure p2(str varchar(20))
begin
    
        
      declare a int;     
          set a:=0;
   
   set @t=" ";
     
      lbl :LOOP
        set a:=a+1;
        set @x1 = substring(str,a,1);


if @x1 between 'a' and 'z'
  THEN set @t:= concat(@t,@x1);
end if;

if @x1 between '0' and '9'
  THEN set @p:= concat(@p,@x1);
end if;
         if a>=length(str) THEN
           leave lbl;
         end if;
      
      end LOOP lbl;  
   
   select @t;
   select @p;
end$
delimiter ;

*/


/*

crse
stnt
sphone
sadr

create table crse (id int ,name varchar(20),duration varchar(20),summary varchar(20));

create table stnt(id int,namefirst varchar(20),namelast varchar(20),dob date,emaild varchar(20));        

create table sphone(id int primary key,studid int,num varchar(20),isactive bool,foreign key(studid) references stnt(id));

create table sadr(id int,studid int unique not null,adr varchar(20),foreign key(studid) references stnt(id));

drop all tables;
*/





