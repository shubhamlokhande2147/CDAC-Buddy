#include<iostream>
using namespace std;


class Complex
{
	int real,img;
	
	public:
		void getdata()
		{		
			cout<<"\nEnter the real and img no. : "<<endl;
			cin>>real>>img;
		}
		void display()  //inside fun defination
	    {
	  	  cout<<"Complex no. : "<<real<<"+"<<img<<"i"<<endl;
	    }
	    
	    void acceptparam(int,int);   //fun declaration 
         
        void setReal(int r)
        {
        	real=r;
		}
		
		int getReal()
		{  
			return real;
		}
           
};

            
       void Complex :: acceptparam(int r,int i) //outside fun defination
       {
       	 real=r;
       	 img=i;
	   }

int main()
{
	Complex c1;
	c1.getdata();
	c1.display();
	
	Complex c2;
	c2.acceptparam(12,34);
	c2.display();
	c2.setReal(55);
	c2.display();
	cout<<"\nModified Value of real : "<<c2.getReal();
	return 0;
}
