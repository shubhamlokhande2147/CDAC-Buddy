#include<iostream>
using namespace std;

class Complex
{
	int real,img;
	public:
//		  Complex(int real,int img)
//		  {
//		  	this->real=real;
//		  	this->img=img;
//    	  }
    	  void get()
    	  {
    	    cout<<"\nEnter real :";
			cin>>real;
    	    cout<<"\nEnter img :";
			cin>>img; 	
		  }
         void display()
         {
         	if(img>=0)
    	      cout<<"\nComplex no. : "<<real<<"+"<<img<<"i";
    	     else
			 cout<<"\nComplex no. : "<<real<<img<<"i"; 
	     }
	     
	     Complex Complex::operator=(const Complex &c)
	     {
	     	real=c.real;
	     	img=c.img;
	     	return c;
		 }
};

int main()
{
	Complex c1;
	c1.get();
	c1.display();
		
	Complex c2;
	c2.get();
	c2.display();
	
	c1=c2;
	c1.display();

}
