#include<iostream>
#include<string.h>
using namespace std;
class Employee{
    public:
    char name[15];
    int id;
	void getdata()
	{
		cout<<"enter name and id : "<<endl;
		cin>>name>>id;
	  }  
	  
	  void disp()
	  {
	  	cout<<"name : "<<endl<<name<<"id : "<<id<<endl;
	  }
};

int main()
{
   
	
  Employee e1[20];
  int n;
  
  cout<<"\nEnter the count of Employee : "<<endl;
  cin>>n;
 
 for(int i=0;i<n;i++)	
 {
 	e1[i].getdata();
 }
 
 for(int i=0;i<n;i++)	
 {
 	e1[i].disp();
 }
	
	cout<<"\nsizeof array : "<<sizeof(e1);
	
	return 0;
}
