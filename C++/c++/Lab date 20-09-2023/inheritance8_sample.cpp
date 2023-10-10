#include<iostream>
using namespace std;

class A
{
	public :
		void show()
		{
			cout<<"\nShow of A";
		}
};


class B : public A
{
	public :
		void show()
		{
			cout<<"\nShow of B";
		}
};


class C : public A,B
{
	public :
		void show()
		{
			cout<<"\nShow of C";
		}
};

int main()
{
	C c1;
	//c1.A::show();
    c1.show();
//	c1.show();
}
