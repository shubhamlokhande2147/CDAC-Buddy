package com.demo.test;

import java.util.Scanner;
import com.demo.services.ExamService;
import com.demo.services.ExamServiceImpl;

public class TestExamDemo {

	public static void main(String[] args) {
		
		ExamService eservice = new ExamServiceImpl(); 
		
       Scanner sc = new Scanner(System.in);
       int choice;
       
       do {
    	   
    	   System.out.println("\n1.JAVA Exam \n2.HTML Exam");
    	   choice = sc.nextInt();
    	   
    	   switch(choice)
    	   {
    	   case 1 : 
    		      eservice.javaexam();
    		      break;

    	   case 2: 
 		      break;
 		      
    	   case 3 :
    		      System.out.println("Thank you for attending exam..");
    		      System.exit(0);
 		          break;
 		          
 		   default :
 		          System.out.println("You are entered wrong choice..");
 		          break;

    	   }
    	   
       }while(true);
       
		 
	}

}
