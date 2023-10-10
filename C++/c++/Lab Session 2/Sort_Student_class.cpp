#include<iostream>
#include<string.h>
#include<algorithm>
using namespace std;
class student
{
	int roll_no;
	char* name;
	int age;
	int Tmark;
	public:
		void get()
		{	
			cout<<"Enter roll no: ";
			cin>>this->roll_no;	
			cout<<"Enter Name";
			cin>>this->name;
			cout<<"\nEnter Age: ";
			cin>>this->age;
			cout<<"\nEnter Total Marks";
			cin>>this->Tmark;
		}
		void display()
		{
			cout<<"Roll no: "<<this->roll_no<<endl;
			cout<<"Name: "<<this->name<<endl;
			cout<<"Age: "<<this->age<<endl;
			cout<<"Total Marks: "<<this->Tmark<<endl;
		}
};
int main()
{
	int n;
	cout<<"Enter the number of Student ";
	cin>>n;
	student s1[10];
	for(int i=0;i<n;i++)
	{
		s1[i].get();
	}
		for(int i=0;i<n;i++)
	{
		s1[i].display();
	}
}
