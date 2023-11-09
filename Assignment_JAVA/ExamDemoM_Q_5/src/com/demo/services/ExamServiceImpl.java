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
	     
	     System.out.println("Enter exam topic : ");
	     String topic = sc.next();
	     
	     System.out.println("Enter date (dd/MM/yyyy): ");
	     String dt = sc.next();
    	 LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	     

	     Question[] ques = new Question[5];
	     {
	 		ques[0] = new Question(1,"Number of primitive data types in Java are?","6","7","8","8","8",1);
	 		ques[1] = new Question(2,"What is the size of float and double in java?","32 and 64","32 and 32","64 and 64","63 and 32","32 and 64",1);
	 		ques[2] = new Question(3,"Automatic type conversion is possible in which of the possible cases?","Byte to int","Int to long","Long to int","Short to int ","Int to long",1);
	 		ques[3] = new Question(4,"Which of the following is not a Java features?","Dynamic","Architecture Neutral","Use of pointers","Object-oriented","Use of pointers",1);
     		ques[4] = new Question(5,"What is the return type of the hashCode() method in the Object class?","Object","int","long","void","int",1);

	     }
	    
	     edao.javatest(eid,ename,topic,ldt,ques);
		
	}
	
	
}
