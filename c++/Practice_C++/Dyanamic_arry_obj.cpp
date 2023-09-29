#include<iostream>
using namespace std;

class Complex
{
  int real,img;
      public:
	     void get();
		 void show();	
	
};

void Complex::get()
{
	cout<<"\nEnter real no. : ";
	cin>>real;
	
	cout<<"\nEnter img no. : ";
	cin>>img;
}

void Complex::show()
{    if(img>0)
     {
	  cout<<"\nComplex no. is : "<<real<<"+"<<img<<"i"<<endl;
     }
     else
	 {
      cout<<"\nComplex no. is : "<<real<<img<<"i"<<endl;	
	 }
}

int main()
{     int n;
	 cout<<"\nEnter the no. obj : ";
	 cin>>n;
	 Complex *ptr=new Complex[n];//create dyanamic obj of array
	
	  for(int i=0;i<n;i++)
	  {
	  	ptr[i].get();
	  }
	  for(int i=0;i<n;i++)
	  {
	  	ptr[i].show();
	  }
	  
	  delete [] ptr;
	 return 0;
}
