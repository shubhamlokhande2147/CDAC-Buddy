#include<iostream>
using namespace std;

class A
{
	int a;
	public:
		A()
		{
			cout<<"\ndefault of A";
		}
		A(int a)
		{
			cout<<"\npara of A";
           this->a=a;			
		}
		void display()
		{
			cout<<"\nvalue of a : "<<a;
		}
};

class B:public A
{
	int b;
	public:
		B()
		{
		 cout<<"\ndefault of B";
		}
		B(int a,int b):A(a)
		{
			cout<<"\npara of B";
           this->b=b;			
		}
		void display()
		{
			A::display();
			cout<<"\nvalue of b : "<<b;
		}
};


int main()
{
	B obj1(10,20);
	obj1.display();
	return 0;
}
