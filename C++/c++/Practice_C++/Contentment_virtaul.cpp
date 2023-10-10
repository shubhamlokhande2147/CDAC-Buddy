/*
   Here uses, 
           cotentment,
            virtual fun,
			pure fun,
			array of obj,
			dynamic memory allocation,
			sorting by salary. 
*/


#include<iostream>
using namespace std;

class Date
{
	int dd,mm,yy;
	   public:
	   	  void get()  
	     	 {
	     	 	cout<<"\nEnter day : ";
	     	 	cin>>dd;
	     	 	
				cout<<"\nEnter month : ";
	     	 	cin>>mm;
	     	 	
				cout<<"\nEnter year : ";
	     	 	cin>>yy;	     	 	
	         }
	         void display()
	         {
	         	cout<<"\nDate : "<<dd<<"/"<<mm<<"/"<<yy;
			 }
	         
};

class Person
{
	char name[20];
	long mobile;
	     public:
	     	 void get()
	     	 {
	     	 	cout<<"\nEnter name : ";
	     	 	cin>>name;
	     	 	
				cout<<"\nEnter mobile no. : ";
	     	 	cin>>mobile;
	         }
	         
	         void show()
	         {
	         	cout<<"\nName : "<<name;
	         	cout<<"\nMobile: "<<mobile;
			 }
			 
			 virtual int bonous()=0;
};

class Emp : public Person
{
	int id;
	char dpt[20];
	Date d1;
        public:	
	     	 void get()  
	     	 {
	     	 	Person::get();
	     	 	d1.get();   //contentment get() fun
	     	 	cout<<"\nEnter emp id : ";
	     	 	cin>>id;
	     	 	
				cout<<"\nEnter emp department : ";
	     	 	cin>>dpt;
	         }
	         
	         void show()
	         { 
	            Person::show();
	            d1.display(); //contentment display() fun
	         	cout<<"\nEmp id : "<<id;
	         	cout<<"\nEmp department : "<<dpt;
			 }
			 
			 virtual int bonous()
			 { 
			   // Person::bonous();
			 	int b=5000;
			 	return b;
			 }
};

class Manager: public Emp
{
	int salary;
	char branch[20];
	//Date d1;
	     public:
	     	 void get()
	     	 {
	     	 	Emp::get();
	     	 //	d1.get();
	     	 	cout<<"\nEnter salary : ";
	     	 	cin>>salary;
	     	 	
				cout<<"\nEnter branch : ";
	     	 	cin>>branch;
	         }
	         
	         void show()
	         { 
	            Emp::show();
	    //        d1.display();
	         	cout<<"\nSalary of manager : "<<salary;
	         	cout<<"\nBranch of manager : "<<branch;
			 }
			 
			 virtual int bonous()
			 { 
			 	return salary+Emp::bonous();
			 }
		    	
};


int main()
{
//	Manager m1;
//	m1.get();
//	m1.show();
//	cout<<"\nTotal salary : "<<m1.bonous();
	  int n;
	  cout<<"\nEnter the no. obj : ";
	  cin>>n;
	  
	  Manager *ptr=new Manager[n];
	  
	  for(int i=0;i<n;i++)  //for loop = input data
	  {
         ptr[i].get();	  	 
	  }
	  cout<<"**********************************************************"<<endl;
	  
	  for(int i=0;i<n;i++)//for loop = display data
	  {
         ptr[i].show();	  	 
         cout<<"\nTotal salary : "<<ptr[i].bonous();
         cout<<"\n\n######################################################"<<endl;
	  }
	
	//sorting by salary
	cout<<"@@@@@@@@@@@@@@@@@@@@@ Sorted by Salary @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"<<endl;
	
	Manager temp;
	for(int i=0;i<n;i++)
	  {
	  	 for(int j=i+1;j<n;j++)
	  	   {
		     if(ptr[i].bonous()>ptr[j].bonous())
	  	     {
               temp=ptr[i];
			   ptr[i]=ptr[j];	
			   ptr[j]=temp;  	   	
		     }
	  				 	
		   }
	  	   
	  }
	   
	
	  for(int i=0;i<n;i++)//for loop = display data
	  {
         ptr[i].show();	  	 
         cout<<"\nTotal salary : "<<ptr[i].bonous();
         cout<<"\n\n######################################################"<<endl;
	  }
	
	
	  
	delete[] ptr;
	return 0;
}
