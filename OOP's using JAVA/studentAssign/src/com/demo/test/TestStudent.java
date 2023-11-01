package com.demo.test;
import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do
		{
			System.out.println("1.Display all student\n2.Search by Id\n3.Search by name\n4.Calcuate GPA of Student\n5.Exit");
			System.out.println("Enter choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				break;								
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;		
			case 5:
				System.out.println("Exiting from loop");
				System.exit(0);
				break;	
			}
		
		}while(true);
	}

}
