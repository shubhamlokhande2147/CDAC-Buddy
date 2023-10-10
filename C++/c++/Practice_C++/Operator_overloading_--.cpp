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
		  
		  Complex operator--(int)
		  {
		  	Complex temp;
			 temp.real=this->real-1;
			 temp.img=this->img-1;
		  	return temp;
		  }
};

int main()
{
	Complex c1(2,3);
	c1.show();
	Complex c2=c1--;
	c2.show();
	
	return 0;
}
