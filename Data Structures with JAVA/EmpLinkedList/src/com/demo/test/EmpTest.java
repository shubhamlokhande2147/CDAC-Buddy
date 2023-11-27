package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.services.EmpServices;
import com.demo.services.EmpServicesImpl;

public class EmpTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmpServices emp = new EmpServicesImpl();
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
				emp.DisplayAll();
				break;
				
			case 5:
				System.out.println("Thank you for visiting...");
				System.exit(0);
			default:
				break;
			}
		} while (choice != 5);
	}
}
