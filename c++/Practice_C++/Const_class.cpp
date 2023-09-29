#include<iostream>
using namespace std;

class Complex
{
	int real=2,img=-3;
	  public:
	  	  void get() 
	  	  {
	  	     cout<<"\nEnter the real no. ";
			 cin>>real;
			 cout<<"\nEnter the img no. ";
			 cin>>img;	 	
		  }
		  
		  void display()const
		  { if(img>=0)
		  {
	     	cout<<"\nComplex no. : "<<real<<"+"<<img<<"i"<<endl;	
		  }
		  else
		  {
		  	cout<<"\nComplex no. : "<<real<<img<<"i"<<endl;
		  }
		  
		  }
};

int main()
{
  const	Complex c1; //constant obj
	c1.display();
	
	Complex c2;  //non-const obj
	c2.get();
	c2.display();
	
	return 0;
}
