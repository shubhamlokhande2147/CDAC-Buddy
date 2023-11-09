package com.demo.dao;

import java.time.LocalDate;

import com.demo.beans.Question;

public class ExamDaoImpl implements ExamDao {

	@Override
	public void javatest(int eid, String ename, String topic, LocalDate ldt, Question[] ques) {
     
		 System.out.println("Welcome..!");
		 System.out.println(ques[0].getQno());
		 System.out.println(ques[0].getQuestion());
		 System.out.println(ques[0].getOp1());
		 System.out.println(ques[0].getOp2());
		 System.out.println(ques[0].getOp3());
		 System.out.println(ques[0].getOp4());
		 

	}



}
