
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