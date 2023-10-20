drop procedure if exists que6;
delimiter $
create procedure que6(str1 varchar(100))
BEGIN

	DECLARE x int;
	set x:=0;
	set @y:=" ";
	set @cout:=0;
	set @dig=0;
	set @white=0;
				
			lbl:LOOP
			 set x:=x+1;
	      		set @y:=substring(str1,x,1);
		          
                if(@y like  'a' or @y like 'e' or @y like 'i' or @y like 'o' or @y like 'u') THEN
                 set @cout=@cout+1;
                end if; 				
				
				if(@y BETWEEN '0' AND '9') THEN 
                    set @dig=@dig+1;
                end if; 
				
				if(@y like ' ' ) THEN
					set @white=@white+1;
                end if;
				if x >= length(str1) THEN
				   leave lbl;
				  end if; 
				   
				  
              end LOOP lbl;	
          	 SELECT @cout as "Vowel Count",@dig as "Digit Count", @white as "Whitespace Count";

end $
delimiter ;