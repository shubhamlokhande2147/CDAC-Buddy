#include<iostream>
using namespace std;

class Emp
{
  int id;
  float salary;
  
     public:
	     void get()  //inside fun deffination
		 {
		   cout<<"\nEnter emp id : ";
		   cin>>id;
		   
		   cout<<"\nEnter emp salary : ";
		   cin>>salary; 	
		 }	
		 
	     void display();//inside fun declaration
	//	 {
	//	   cout<<"\nEmp id : "<<id<<"\tEmp salary : "<<salary; 	
	//	 }	
};
void Emp::display()//outside fun deffination
{
		   cout<<"\nEmp id : "<<id<<"\tEmp salary : "<<salary;
}

int main()
{
	Emp e1;
	e1.get();
	e1.display();
	
	return 0;
}
