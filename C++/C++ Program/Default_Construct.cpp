#include<iostream>
using namespace std;

class Student
{
   int rno;
   char name[20];
   double fees;
   
   public:
           Student()
		   {
		   	 cout<<"Enter the roll no. : "<<endl;
		   	 cin>>rno;
		   	 cout<<"Enter the name : "<<endl;
		   	 cin>>name;
		   	 cout<<"Enter the fees : "<<endl;
		   	 cin>>fees;
		   }	
		   
		   void disp()
		   {
		   	cout<<"Roll no. : "<<rno<<endl<<"name : "<<name<<endl<<"Fees : "<<fees;
		   }
};


int main()
{
	Student s1;
	s1.disp();
	return 0;
}
