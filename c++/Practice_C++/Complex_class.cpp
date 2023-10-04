#include<iostream>
using namespace std;

class Complex
{
	int real,img;
	  public:
	  	  void get()
	  	  {
	  	     cout<<"\nEnter the real no. ";
			 cin>>real;
			 cout<<"\nEnter the img no. ";
			 cin>>img;	 	
		  }
		  
		  void display()
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
	Complex c1;
	c1.get();
	c1.display();
	
	return 0;
}
