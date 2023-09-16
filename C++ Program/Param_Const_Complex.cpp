#include<iostream>
using namespace std;

class Complex
{
  int real,img;
  
  public:
         Complex() //default constructor
		 {
	        real=4;
	        img=5;
		 }
		 Complex(int r,int i)//parameterized constructor
		 {
		    real=r;
			img=i; 	
	     }	
	     
		 void display()const  //const display fun
	     {
	     	cout<<"Complex no. : " <<real<<"+"<<img<<"i"<<endl;
		 }
		 
		  int getReal()const //const getReal fun 
		 {
		 	return real;
		 }
		 
		 void setReal(int r) //non-const setReal fun
		 {
		 	real=r;
		 }
		 
		 
};

int main()
{
	Complex c1(2,3);  //non-const obj
	c1.display(); //non-const obj access const display fun
	c1.setReal(7);
	c1.display();
	
	const Complex c2;  //const obj
	//c2.setReal();  //const obj - read only,no changes ==> ERROR
	c2.display(); //const obj access const display fun
	c2.getReal(); //const obj access getReal fun
	c2.display();//const obj access const display fun
	
}
