#include<iostream>
using namespace std;

class Stud
{
	
	int m1,m2,m3,m4,m5;
	int m[5]; //using array
	int sum;
	float avg;
	
	public:
		
		 void get()
		 {
		 	cout<<"\nEnter the 5 sub marks : ";
		 	cin>>m1>>m2>>m3>>m4>>m5;
		 }
		 
		 void display1()
		 {
		     sum = m1+m2+m3+m4+m5;
		     cout<<"\nTotal marks : "<<sum;
		     avg=(float)sum/5;
		     cout<<"\nAverage : "<<avg;
		 }
		 
		 void display2()
		 {
		 	 for(int i=0;i<5;i++)
		 	  {
		 	  	cout<<"\nEnter 5 marks : ";
		 	  	cin>>m[i];
		 	    sum=sum+m[i];	
			  }
		     //sum = m1+m2+m3+m4+m5;
		     cout<<"\nTotal marks : "<<sum;
		     avg=(float)sum/5;
		     cout<<"\nAverage : "<<avg;
		 }
		
	
};

int main()
{
	Stud s1;
	s1.get();
	s1.display1();
	s1.display2();
	return 0;
}
