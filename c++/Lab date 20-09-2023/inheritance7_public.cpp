#include<iostream>
using namespace std;
class A
{
	int c=10;
	public:
		int a=20;
	protected:
		int b=30;
	public:
		void display()
		{
			cout<<"In Display of A\n ";
		}
};
class B:public A{
	public:
		void show()
		{
			cout<<a<<b<<endl;
		}
};
class C : public B
{
	public:
		void show()
		{
			cout<<a<<b;
		}
		
};
int main()
{
	B bobj;
	bobj.show();
	bobj.display();
	C cobj;
	cobj.show();
}
