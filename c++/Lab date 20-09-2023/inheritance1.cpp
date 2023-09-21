#include<iostream>
using namespace std;
class A
{
	public:
		A()
		{
			cout<<"Default of A\n";
		}
		void display()
		{
			cout<<"In display of class A\n";
		}
};
class B:public A
{
	public :
		B()
		{
			cout<<"In defalut of class B\n";
		}
		void display()
		{
			cout<<"In display of class B\n";
		}
};
int main()
{
	B Bobj;
	Bobj.display();
}
