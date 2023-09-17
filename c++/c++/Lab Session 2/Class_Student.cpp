#include<iostream>
using namespace std;

class Student
{
	int roll;
	int dob;
	int marks;
	
	public:
		 void getdata()
		 {
		 	cout<<"\nenter the roll : "<<endl;
		 	cin>>roll;
	        cout<<"\nenter the date of birth : "<<endl;
		 	cin>>dob;
		 	cout<<"\nenter the marks : "<<endl;
		 	cin>>marks;	 	
		 }
		 
		 void display()
		 {
		 	cout<<"\nRoll no. : "<<roll<<endl;
		 	cout<<"DOB : "<<dob<<endl;
		 	cout<<"Marks :"<<marks<<endl;
		 }
};

int main()
{
	int n;
	Student s1[10];
	cout<<"\nenter the no. of students : ";
	cin>>n;
	for(int i=1;i<=n;i++)
	{
		s1[i].getdata();
	}
	for(int i=1;i<=n;i++)
	{
		s1[i].display();
	}
	
}
