<<<<<<< HEAD
#include<iostream>
using namespace std;

class Complex
{
  int real,img;
      public:
      	 Complex()
      	  {	 } 
		Complex(int real,int img)
      	 {
      	    this->real=real;
			this->img=img;	
		 }
 //	     void get();
		 void show();	
		 
		 Complex operator+(Complex& c1)
		 {
		 	Complex temp(this->real+c1.real,this->img+c1.img);
		 	 return temp;
		 }
	
};
//
//void Complex::get()
//{
//	cout<<"\nEnter real no. : ";
//	cin>>real;
//	
//	cout<<"\nEnter img no. : ";
//	cin>>img;
//}

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
{
	Complex c1(2,3);
	c1.show();
	
	Complex c2(3,5);
	c2.show();
	
	Complex c3=c1+c2;
	c3.show();
	
	return 0;
}
=======
#include<iostream>
using namespace std;

class Complex
{
  int real,img;
      public:
      	 Complex()
      	  {	 } 
		Complex(int real,int img)
      	 {
      	    this->real=real;
			this->img=img;	
		 }
 //	     void get();
		 void show();	
		 
		 Complex operator+(Complex& c1)
		 {
		 	Complex temp(this->real+c1.real,this->img+c1.img);
		 	 return temp;
		 }
	
};
//
//void Complex::get()
//{
//	cout<<"\nEnter real no. : ";
//	cin>>real;
//	
//	cout<<"\nEnter img no. : ";
//	cin>>img;
//}

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
{
	Complex c1(2,3);
	c1.show();
	
	Complex c2(3,5);
	c2.show();
	
	Complex c3=c1+c2;
	c3.show();
	
	return 0;
}
>>>>>>> 780e2f0eead5a6b2acfd4a998fcfbbe958e5b35a
