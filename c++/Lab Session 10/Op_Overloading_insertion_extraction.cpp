#include<iostream>
using namespace std;
class Complex
{
	int real,img;
	public:
	Complex(int real=0,int img=0)
	{
		this->real=real;
		this->img=img;
	}
	friend void operator<<(ostream &cout,Complex &obj);
	friend void operator>>(istream &cin,Complex &obj);
	
		
};
void operator>>(istream &cin,Complex &obj)
{
	cout<<"Enter Real : ";
	cin>>obj.real;
	cout<<"Enter Imaginary: ";
	cin>>obj.img; 
}
void operator<<(ostream &cout,Complex &obj)
{	if(obj.img>=0)
	{
		cout<<obj.real<<" + "<<obj.img<<"i"<<endl;	
	}
	else
	{
		cout<<obj.real<<obj.img<<"i"<<endl;
	}
}
int main()
{
	Complex obj;
	cout<<"Enter complex Number\n ";
	cin>>obj;
	cout<<"Complex Number is ";
	cout<<obj;
	return 0;
}
