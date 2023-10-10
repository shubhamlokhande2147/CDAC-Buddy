#include<iostream>
using namespace std;
#include<string.h>

class Adr
{
	int plotno;
    char street[20],city[20];
       public:
			 Adr(){  }
			 			 
          void get()
		   {
		       cout<<"\nEnter Ploat no. : ";
			   cin>>plotno;  	
			   
		       cout<<"\nEnter Street : ";
			   cin>>street;
			   
			   cout<<"\nEnter City : ";
			   cin>>city;   
		   }
            
			void display()
            {
            	cout<<"\nPloat no. : "<<plotno<<"\nStreet : "<<street<<"\nCity : "<<city;
			}

};

class Student
{
	int roll;
	int marks[5];
	int sum=0;
	float avg=0;
	
	Adr adress;
	 public:
	       void get1()
		   {
		       cout<<"Enter roll no. : ";
			   cin>>roll;  	
		       cout<<"Enter 3 subjets marks : ";
			   
			        for(int i=0;i<5;i++)
			        {
		    
		                cin>>marks[i];
			        	sum = (float)sum+marks[i];
					}
			   
			   	adress.get();   
		   }
		   
		   void display()
		   {
		   	    adress.display();	
		   	    avg=(float)sum/5;
		        cout<<"\nRoll No: "<<roll<<"\nMarks : "<<sum<<" "<<"\nAvearge : "<<avg; 
				cout<<"\n------------------------------------------------";  
		   }	
};

int main()
{ 
    int n;
    
	Student s1[10];
	   cout<<"\nEnter the obj. of Students : ";
	   cin>>n;
	   
	   for(int i=0;i<n;i++)
	     {
	     	s1[i].get1();
		 }
		 cout<<"**********************************************" ; 
	   for(int i=0;i<n;i++)
	     {
        	s1[i].display();
        	cout<<"\n";
		 }
	

	return 0;
}
