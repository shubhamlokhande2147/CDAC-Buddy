package com.demo.test;
import com.demo.services.*;
import com.demo.beans.*;
import java.util.*;
public class TestPersonArray {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		PersonService ps=new PersonServiceImpl();
		
		
		
		int choice=0;
		do
		{
			System.out.println("1.Add New Person\n2.Display All\n3.SearchById\n4.Exit");
			System.out.println("Enter Choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				ps.addNewPerson();
				break;
			case 2:
				Person[] arr= ps.displayAll();
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]!=null)
					{	
						System.out.println(arr[i]);
					}
				}
				break;
			case 3:
				System.out.println("Enter id");
				int id1=sc.nextInt();
				Person p3=ps.SearchById(id1);;
				if(p3!=null)
				{
					System.out.println(p3);
				}
				else
				{
					System.out.println("Not Found");
				}
				break;
			case 4:
				System.out.println("Exiting from services");
				System.exit(0);
				break;
			}
		}while(true);
	}

}
