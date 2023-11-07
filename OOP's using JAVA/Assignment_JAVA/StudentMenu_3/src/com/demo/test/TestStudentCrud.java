package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Student;

public class TestStudentCrud {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		Student s1 = new Student(1,"qw",80,75,70);
//		System.out.println(s1);
//		System.out.println("GPA : " + s1.calculateGPA());
//		
//		
		int cnt = 0;
		Student[] starr = new Student[25];	
		starr[0] = new Student(1,"vaibhav",84,75,80);	
		starr[1] = new Student(2,"om",80,55,60);	
		starr[2] = new Student(3,"shubham",60,75,90);	
		starr[3] = new Student(4,"shiv",90,65,70);	
		starr[4] = new Student(5,"sid",80,75,70);	
		starr[5] = new Student(5,"vivek",85,75,77);	
		cnt = 6;
		
		int choice=0;
		
		do{
			System.out.println("1. Display All Student\r\n"
					+ "2. Search by id\r\n"
					+ "3. Search by name\r\n"
					+ "4. calculate GPA of a student\r\n"
					+ "5. Exit");
			System.out.println("Please enter your choice : ");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1: 
				   for(Student e : starr)
				   {	
					 if(e!=null)
                     System.out.println(e);
				   }
				  break;
				  
			case 2: 
				  break;
			  
			case 3: 
				  break;
			  
			case 4: 
				  break;
			  
			case 5: 
				  System.out.println("You are exit now..!");
				  System.exit(0);
				  break;
				
			default : 
				  System.out.println("You enter wrong choice..");
				  break;
				
			  
			  
			}
			
			
		}while(choice!=6);

		
		
		
		
	}

}
;