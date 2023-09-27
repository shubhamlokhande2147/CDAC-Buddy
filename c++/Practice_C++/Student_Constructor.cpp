#include<iostream>
using namespace std;
#include<string.h>


class Student
{
   int roll;
   char nm[];
        public:
		   Student()  //default constructor
		   {
		   	 cout<<"\nDefault constructor";
		     roll=101;   
             strcpy(this->nm,"shubham");
		   }	
		   
		   Student(int roll,char nm[])//parameter constructor 
		   { 
		      cout<<"\n\nParameter constructor";
		      this->roll=roll;
			  strcpy(this->nm,nm);   	
		   }	
		   
		   
		   
		   void display()
		   {
		   	 cout<<"\nRoll no. : "<<roll;
		   	 cout<<"\nName : "<<nm;
		   }
};

int main()
{
	Student s1; //default constructor obj
	s1.display();
	
	Student s2(201,"omkar");
	s2.display();
	
	return 0;
}
