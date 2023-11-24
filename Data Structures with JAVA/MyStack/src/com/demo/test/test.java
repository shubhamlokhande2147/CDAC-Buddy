package com.demo.test;

import java.util.Scanner;

import com.demo.beans.MyStack;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack ob = new MyStack();
		Scanner sc = new Scanner(System.in);

		// without swtich case code

		// ob.push(20);
		// ob.push(30);
		// ob.push(20);
		// ob.push(30);
		// ob.push(20);
//		ob.push(30);
//		ob.push(20);
//		ob.push(30);
//		ob.push(20);
//		ob.push(30);
//		ob.printStack();
		// ob.pop();
		// ob.pop();
		// ob.printStack();
		// ob.push(200);
		// ob.printStack();

		do {
			System.out.println("\n1.Push\n2.Pop\n3.Print Stack\n4.Exit");
			System.out.println("enter your choice : ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("enter the element : ");
				int n = sc.nextInt();
				ob.push(n);
				break;

			case 2:
				ob.pop();
				break;

			case 3:
				ob.printdata();
				break;

			case 4:
				System.out.println("you are exit now..");
				System.exit(0);
				break;

			default:
				System.out.println("please enter correct choice..");
				break;

			}

		} while (true);

	}

}
