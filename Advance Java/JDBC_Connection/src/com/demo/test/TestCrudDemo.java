package com.demo.test;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.services.EmployeeServive;
import com.demo.services.EmployeeServiveImpl;

public class TestCrudDemo {
	
	public static void main(String[] args) {
		
		EmployeeServive eservice = new EmployeeServiveImpl();
	    
		Scanner sc = new Scanner(System.in);
		int choice=0;
	   
		do {
		System.out.println("1. Add new Employee\n2. Delete Employee\n3. Modify Employee");
		System.out.println("4. Display All\n5. Display by id\n6. Display in sorted order of Salary\n 7. Exit");
        System.out.println("Enter choice : ");
        choice = sc.nextInt();
        
        switch(choice)
        {
        
    	case 1:
			eservice.addnewProduct();
			break;
		case 2:
			System.out.println("enetr pid");
			int id=sc.nextInt();
			boolean status=eservice.deleteById(id);
			if(status) {
				System.out.println("deleted successfully");
			}
			else {
				System.out.println("not found");
			}
			break;
		case 3:
			System.out.println("enetr eid");
			id=sc.nextInt();
			System.out.println("enetr ename");
			String pnm=sc.next();
			System.out.println("enetr dept");
			String qty=sc.next();
			System.out.println("enetr salary");
			double price=sc.nextDouble();
			status=eservice.modifyById(id,pnm,qty,price);
			if(status) {
				System.out.println("modified successfully");
			}
			else {
				System.out.println("not found");
			}
			break;
		case 4:
			List<Employee> plist=eservice.displayAll();
			plist.forEach(System.out::println);
			break;
		case 5:
			System.out.println("enetr pid");
			id=sc.nextInt();
			Employee p=eservice.getById(id);
			if(p!=null) {
				System.out.println(p);
			}
			else {
				System.out.println("not found");
			}
			break;
		case 6:
			plist=eservice.displaySorted();
			plist.forEach(System.out::println);
			break;
		case 7:
			eservice.closeMyconnection();
			sc.close();
			System.out.println("Thank you for visiting....");
			break;
		default:
			break;
        
		}
	   }while(choice!=7);
    }   
}