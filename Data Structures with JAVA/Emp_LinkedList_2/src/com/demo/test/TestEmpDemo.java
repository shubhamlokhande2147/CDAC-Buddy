package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmpService;
import com.demo.service.EmpServiceImpl;

public class TestEmpDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EmpService emp = new EmpServiceImpl();
		
		
		int choice = 0;
		do {
			System.out.println("\n1.Add Employee\n2.Delete Employee by id\n3.Search by id \n4.Display all\n5.Exit");
			System.out.println("Enter Choice");
			choice = sc.nextInt();
			
			
			switch (choice) {
			case 1:
				emp.addEmp();
				break;
				
			case 2:
				System.out.println("Enter id ");
				int id3 = sc.nextInt();
				boolean status = emp.deletebyId(id3);
				if (status) {
					System.out.println("Success");
				} else {
					System.out.println("Not found id");
				}
				break;
			case 3:
				System.out.println("Enter id ");
				int id = sc.nextInt();
				Employee e = emp.searchById(id);
				if (e != null) {
					System.out.println(e);
				} else {
					System.out.println("Emp not found");
				}
				break;
		      
			case 4:
				emp.display();
				break;
			
			case 5:
				System.out.println("Thank tou for visiting...");
				System.exit(0);
			 }
	   }while(true);
		
	}
}
