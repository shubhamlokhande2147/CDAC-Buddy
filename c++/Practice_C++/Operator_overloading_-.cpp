#include<iostream>
using namespace std;

class Complex
{
	int real,img;
	 public:
	 	 Complex()
	 	 {
	 	 	real=img=0;
		  }
		  Complex(int real,int img)
		  {
		  	this->real=real;
		  	this->img=img;
		  }
		  
		  void show()
		  {
		  	cout<<"\n"<<real<<"+"<<img<<"i";
		  }
		  Complex operator-(Complex& c)
		  {
		  	Complex temp;
		  	temp.real=this->real-c.real;
			temp.img=this->img-c.img;
			return temp;
		  }
};

int main()
{
	Complex c1(2,3);
	c1.show();
	
	Complex c2(5,6);
	c2.show();
	
	Complex c3=c2-c1;
	
	c3.show();
	return 0;
}
