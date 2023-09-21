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
class B:protected A{
	public:
		void show()
		{
			cout<<a<<b<<endl;
		}
};
class C : protected B
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
//	bobj.display();// error 
	C cobj;
	cobj.show();
}
