#include<iostream>
using namespace std;

class Complex
{
	int real,img;
	public:
		Complex(int r,int i)
		{
			real=r;
			img=i;
		}
		void show()
		{
			cout<<"Complex no. : "<<real<<"+"<<img<<"i"<<endl;
		}
};

int main()
{
	Complex c1(2,1);
	Complex c2(c1);
	c1.show();
	c2.show();
}
