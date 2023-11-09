package com.demo.dao;

import java.time.LocalDate;
import java.util.Scanner;

import com.demo.beans.Question;

public class ExamDaoImpl implements ExamDao {
    Scanner sc = new Scanner(System.in);   
    static int count=0;

	@Override
	public void javatest(int eid, String ename, String topic, LocalDate ldt, Question[] ques) {
     // int count=0;
		 System.out.println("Welcome..!");
		 for(int i=0; i<ques.length; i++)//3 1 2 3 2
		 {

		 System.out.println(ques[i].getQno());
		 System.out.println(ques[i].getQuestion());
		 System.out.println(ques[i].getOp1());
		 System.out.println(ques[i].getOp2());
		 System.out.println(ques[i].getOp3());
		 System.out.println(ques[i].getOp4());
		 System.out.println("enter choice: ");
		 int ch = sc.nextInt();
		//if(ch!=0) {
            if(((ch==3) && (ques[i].getOp3().equals(ques[i].getAnswer()))))
            {
            	System.out.println("Correct answer..");
            	count++;
            }
            
		    if(((ch==1) && (ques[i].getOp1().equals(ques[i].getAnswer()))))
            {
            	System.out.println("Correct answer..");
            	count++;
            }
		     if(((ch==2) && (ques[i].getOp2().equals(ques[i].getAnswer()))))
           {
           	System.out.println("Correct answer..");
           	count++;
           }
		    if(((ch==3) && (ques[i].getOp3().equals(ques[i].getAnswer()))))
           {
           	System.out.println("Correct answer..");
           	count++;
           }
		     if(((ch==2) && (ques[i].getOp2().equals(ques[i].getAnswer()))))
           {
           	System.out.println("Correct answer..");
           	count++;
           }
		//} else
          // {
           //	System.out.println("Wrong answer..");
         //  }
		 System.out.println("count : "+count);
		     
		   }		 

		 }
//		 for(int i=0; i<ques.length; i++)//4 1 2 3 2
//		 {
//		 System.out.println(ques[i].getQno());
//		 System.out.println(ques[i].getQuestion());
//		 System.out.println(ques[i].getOp1());
//		 System.out.println(ques[i].getOp2());
//		 System.out.println(ques[i].getOp3());
//		 System.out.println(ques[i].getOp4());
		 //System.out.println("enter choice: ");
		 //int ch = sc.nextInt();
		 
//			 switch(ch)
//			 {
//				 case 1 :
//					 
//					  if(( (ques[i].getOp1().equals(ques[i].getAnswer()))))
//			           {
//			           	System.out.println("Correct answer..");
//			           }
//			           else
//			           {
//			           	System.out.println("Wrong answer..");
//			           } 
//					 
//					 
//					 
//					 
//					 //ques[i].getOp4().equals(ques[i].getAnswer());
//				 
//		           if(( (ques[i].getOp4().equals(ques[i].getAnswer()))))
//		           {
//		           	System.out.println("Correct answer..");
//		           }
//		           else
//		           {
//		           	System.out.println("Wrong answer..");
//		           }  
//				 case 2 :
//					 //ques[i].getOp4().equals(ques[i].getAnswer());
//				 
//		           if(( (ques[i].getOp1().equals(ques[i].getAnswer()))))
//		           {
//		           	System.out.println("Correct answer..");
//		           }
//		           else
//		           {
//		           	System.out.println("Wrong answer..");
//		           } 
//		           
//				 case 3 :
//					 //ques[i].getOp4().equals(ques[i].getAnswer());
//				 
//		           if(( (ques[i].getOp2().equals(ques[i].getAnswer()))))
//		           {
//		           	System.out.println("Correct answer..");
//		           }
//		           else
//		           {
//		           	System.out.println("Wrong answer..");
//		           } 
//		           
//			   case 4 :
//					 //ques[i].getOp4().equals(ques[i].getAnswer());
//				 
//		           if(( (ques[i].getOp3().equals(ques[i].getAnswer()))))
//		           {
//		           	System.out.println("Correct answer..");
//		           }
//		           else
//		           {
//		           	System.out.println("Wrong answer..");
//		           }  
//		     }
		 }
		 
		 
//		 for(int i=0; i<ques.length;i++)
//		 {
//			 System.out.println("enter choice: ");
//			 int[] ch = new int[ques.length];
//					ch[i]= sc.nextInt();
//					  if(( (ques[i].getOp1().equals(ques[i].getAnswer()))))
//							  {
//			           	System.out.println("Wrong answer..");
//
//							  }
//
//		 }
//		 
		 
	
		 
		 
//           if(((ch==4)|| (ques[i].getOp4().equals(ques[i].getAnswer()))))
//           {
//           	System.out.println("Correct answer..");
//           }
//           else
//           {
//           	System.out.println("Wrong answer..");
//           }  }
//		 
		 
	


