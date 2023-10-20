/* drop procedure if exists pro10;
delimiter $
create procedure pro10(str1 varchar(100))
BEGIN
	SELECT STR1;
end $
delimiter ; */

/* drop procedure if exists que6;
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
 */
 
/* drop procedure if exists que8;
delimiter $
create procedure que8()
BEGIN
	SET @x :=0;
	l1:LOOP
		set @x:=@x+1;
		if (@x%2=0) THEN
			insert into R100 values(@x,'i is even');
		else 
			insert into R100 values(@x,'i is odd');
		end IF;
		if (@x>=10) THEN
			leave l1;
		end if;

	end loop l1;

    select * from R100;
end $
delimiter ;
 */
 
/* drop procedure if exists que9;
delimiter $
create procedure que9()
BEGIN
	DECLARE _ename varchar(1000);
	DECLARE _sal int;
	DECLARE c1 cursor for
	select ename, sal from emp order by sal desc limit 5;
	open c1;
	lbl: LOOP 
		FETCH c1 into _ename,_sal;
		select _ename,_sal;
	end LOOP lbl;
	close c1;
end $
delimiter ; */

drop procedure if exists que10;
delimiter $
create procedure que10()
BEGIN
	
	DECLARE _empno int;
	DECLARE _ename varchar(12);
	DECLARE	_gender char(1);
	DECLARE	_JOB varchar(20);
	DECLARE _MGR INT;
	DECLARE _HIREDATE date;
	DECLARE _sal,_comm,_deptno,_BONUSID int;
	DECLARE  _username varchar(20);
	DECLARE	 _PWD varchar(20);
	DECLARE _phone varchar(45);
	DECLARE _isActive tinyint(1);
	
	DECLARE c1 cursor for select * from emp;
	DECLARE EXIT handler for 1329 select "End of File";
	open c1;
	lbl : LOOP
	
	FETCH c1 into _empno,_ename,_gender,_JOB,_MGR,_HIREDATE,_sal,_comm,_deptno,_BONUSID,_username,_PWD,_phone,_isActive;

	       if _deptno=10 THEN
		        INSERT into emp10 values(_empno,_ename,_gender,_JOB,_MGR,_HIREDATE,_sal,_comm,_deptno,_BONUSID,_username,_PWD,_phone,_isActive);   
		    end if;  
	          if _deptno=20 THEN
		        INSERT into emp20 values(_empno,_ename,_gender,_JOB,_MGR,_HIREDATE,_sal,_comm,_deptno,_BONUSID,_username,_PWD,_phone,_isActive);   
		    end if;
			
			 if _deptno=30 THEN
		        INSERT into emp30 values(_empno,_ename,_gender,_JOB,_MGR,_HIREDATE,_sal,_comm,_deptno,_BONUSID,_username,_PWD,_phone,_isActive);   
		    end if;
	 
	  end LOOP lbl;  		        
    close c1;
end $
delimiter ;