#include<iostream>
using namespace std;

class Person
{
	char name[20];
	int mobile;
	     public:
	     	 void get()
	     	 {
	     	 	cout<<"\nEnter name : ";
	     	 	cin>>name;
	     	 	
				cout<<"\nEnter mobile no. : ";
	     	 	cin>>mobile;
	         }
	         
	         void show()
	         {
	         	cout<<"\nName : "<<name;
	         	cout<<"\nMobile: "<<mobile;
			 }
};

class Emp : public Person
{
	int id;
	char dpt[20];
        public:	
	     	 void get()  
	     	 {
	     	 	Person::get();
	     	 	cout<<"\nEnter emp id : ";
	     	 	cin>>id;
	     	 	
				cout<<"\nEnter emp department : ";
	     	 	cin>>dpt;
	         }
	         
	         void show()
	         { 
	            Person::show();
	         	cout<<"\nEmp id : "<<id;
	         	cout<<"\nEmp department : "<<dpt;
			 }
};



int main()
{
	Emp e1;
	e1.get();
	e1.show();
	
	return 0;
}
