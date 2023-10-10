#include<iostream>
#include<string.h>
using namespace std;

class Student
{
   int rno;
   char name[20];
   double fees;
   
   public:
           Student(int,char[],double); //constructor and fun declaration
           
		   void disp() //inside fun defination
		   {
           	cout<<"Roll no "<<rno<<endl<<"Name "<<name<<endl<<"Fees "<<fees<<endl;
		   }
};
           Student::Student(int no,char nm[],double f)  //outside fun defination
            {
	           rno=no;
	           strcpy(name,nm);
            	fees=f;	
            }


int main()
{
	Student s1(10,"AbhayShubham",10000);   //parameter passes into object
	s1.disp();
	return 0;
}
