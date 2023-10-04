//static data member and static member function

#include<iostream>
using namespace std;

class Complex
{
   int real,img;
   static int count;  //static data member declaration
      public:
              Complex()
			  {
			  	cout<<"\nDefault constructor called  :";
			  	real=2;
			  	img=3;
			  	count++;
	    	  }	       
  	    	
              Complex(int real,int img)
			  {
			  	cout<<"\nParameterized constructor called  :";
			  	this->real=real;
			  	this->img=img;
			  	count++;
	    	  }	      
	    	  
	    	  void show()
	    	  {
	    	  	if(img>0)
	    	  	{
	    	  		cout<<"\nComplex no. : "<<real<<"+"<<img<<"i"<<endl;
				}
				else
				{
					cout<<"\nComplex no. : "<<real<<img<<"i"<<endl;
				}
			  }
			  
			  static int getcount()  //static member function
			  {
			   return	count;
			  }
}; 
int Complex::count=0; //static data member initializtion -> memory takes place

int main()
{
	Complex c1;
	c1.show();
	
	
	Complex c2(2,-7);
	c2.show();
	cout<<"\nNo. of objects : "<<Complex::getcount();

	return 0;
}
