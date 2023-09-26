//Uses contentment,sorting,manipulator

#include <iostream>     
using  namespace std;  
#include<string.h>
#include <iomanip>      // std::setfill, std::setw  

class date
{
	int dd,mm,yy;
	public:
		void get()
		{
			cout<<"enter DOB : \n";
			cin>>dd>>mm>>yy;
		}
		void put()
		{
			cout<<"DOB : "<<dd<<"/"<<mm<<"/"<<yy<<endl;
		}
};
class student
{
	int rollno;
	char name[10];
	int marks[5];
	int sum=0;
    float avg=0;
	date d;
	
	public:
		void get()
		{
			cout<<"enter rollno\n";
			cin>>rollno;
			cout<<"enter student name\n";
			cin>>name;
			
			cout<<"\nEnter 5 subject marks : \n";
            
			 for(int i=1;i<=5;i++)
			 {
			 	cout<<"Subject "<<i<<":";
			 	cin>>marks[i];
			 	cout<<endl;
			 	sum+=marks[i];
			 } 
			 avg=(float)sum/5;		
			 d.get();
		}
		void put()
		{
			cout<<"\nRoll no. :"<<rollno<<"\nName : "<<name<<"\nAverage : "<<avg<<endl;
			d.put();
		}
		int getrollno()
		{
			return rollno;
		}
		char* getname()
		{
			return name;
		}
		void setrollno(int r)
		{
			rollno=r;
		}
		void setname(char* n)
		{
			strcpy(name,n);
		}
		
		
};
int main()
{
	student s[10],temp;
	int i,n,j;
	cout<<"enter no. of student : \n";
	cin>>n;
	for(i=0;i<n;i++)
	{
		s[i].get();
		
	}
	cout << setfill ('#') << setw (100); 
	for(i=0;i<n;i++)
	{
		s[i].put();
		
	}
	 
	 cout<<"\n";
	 cout << setfill ('*') << setw (100);
	 cout<<"\nSorted Information "<<endl;  
    // cout << 24 << endl;  
	
	//cout<<"**********************************sort information**************************************\n";
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(s[i].getrollno()>s[j].getrollno())
			{
				temp=s[i];
				s[i]=s[j];
				s[j]=temp;
			}
			
		}
	}
	for(i=0;i<n;i++)
	s[i].put();
}
