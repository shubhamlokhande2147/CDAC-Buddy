#include<iostream>
using namespace std;
#include<string.h>

class student
{
	int roll_no;
	char name[50];
	double fees;
	public:
		student(int roll_no,char name[],double fees)
		{
			this->roll_no = roll_no;
			strcpy(this->name,name);
			this->fees = fees;
		}
		
		student(student &s)
		{
			this->roll_no = s.roll_no;
			strcpy(this->name,s.name);
			this->fees = s.fees;
		}
		void display()
		{
			cout<<"Roll No : "<<roll_no<<endl;
			cout<<"Name : "<<name<<endl;
			cout<<"Fees : "<<fees<<endl;
		}
};

int main()
{
	student s1(101,"shubham",1234.50);
	s1.display();
	
	student s2(s1);
	s2.display(); 
	
	return 0;
}
