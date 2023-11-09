package com.demo.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.demo.beans.Question;
import com.demo.dao.ExamDao;
import com.demo.dao.ExamDaoImpl;

public class ExamServiceImpl implements ExamService {
	Scanner sc = new Scanner(System.in);
	
	
	private ExamDao edao;

	public ExamServiceImpl() 
	{
		edao = new ExamDaoImpl(); 
	}

	@Override
	public void javaexam() {
//		private int examid;
//		 private String examname;
//		 private String topic;
//	     private LocalDate ld;
//	     private Question[] ques;
//	     
	     System.out.println("Enter examid : ");
	     int eid = sc.nextInt();
	     
	     System.out.println("Enter exam name: ");
	     String ename = sc.next();
	     
	     System.out.println("Enter exam name: ");
	     String topic = sc.next();
	     
	     System.out.println("Enter date (dd/MM/yyyy): ");
	     String dt = sc.next();
    	 LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	     
	     
	     
	     
	     
	     
		
		//edao.javatest(eid,ename,topic,ld,ques);
		
	}
	
	
}
