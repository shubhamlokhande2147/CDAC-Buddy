#include<iostream>
using namespace std;
#include<string.h>
class Student
{
   int roll;
   char nm[20];
        public:
        	 Student(){ }
        	 Student(int r,char n[])
        	 {
        	 	roll=r;
        	 	strcpy(nm,n);
			 }
			 
			 void show()
			 {
			 	cout<<"\n\nRoll no. :"<<roll;
			 	cout<<"\nName :  "<<nm;
			 }
};

int main()
{
	Student s1(101,"Shubham");
	s1.show();
	
	Student s2(s1);
	s2.show();
	
	return 0;
}


