#include<iostream>
using namespace std;
class complex
{
	int real,img;

public:
	complex();
	complex(int,int);
	void display();
	complex operator+(complex&);
	complex operator-(complex&);
	complex operator-();
	
	
};
complex::complex()
{
	real=img=0;
}
complex::complex(int real,int img)
{
	this->real=real;
	this->img=img;
}
void complex::display()
{
	if(img>0)
	cout<<"complex number is "<<real<<"+"<<img<<"i"<<endl;
	else
	cout<<"complex number is "<<real<<img<<"i"<<endl;
}
complex complex::operator+(complex & c)
{
	complex temp;
	temp.real=this->real + c.real;
	temp.img=this->img + c.img;
	return temp;
}
complex complex::operator-(complex & c)
{
	complex temp;
	temp.real=this->real - c.real;
	temp.img=this->img -c.img;
	return temp;
}
complex complex::operator-()
{
	complex temp;
	temp.real=-this->real;
	temp.img=-this->img;
	return temp;
}
 
int main()
{
	complex c1(1,2);
	complex c2(3,4);
	complex c3=c1-c2;//c1.operator-(c2)
	c3.display();
	

	complex c4(5,6);
	complex c5=-c4;//c5=c4.operator-()
	c5.display();
	
}

