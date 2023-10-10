#include<iostream>
using namespace std;
class A
{
	int a;
	public:
		A()
		{
			cout<<"Default of A\n";
		}
		A(int a)
		{
			cout<<"Para of A\n";
			this->a=a;
		}
		void display()
		{
			cout<<"In display of class A\n";
			cout<<"Value of a is "<<a<<endl;
		}
};
class B:public A
{
	int b;
	public :
		B()
		{
			cout<<"In defalut of class B\n";
		}
		B(int b):A(10)
		{
			cout<<"Para of B\n";
			this->b=b;
		//	cout<<"value of b: "<<b<<endl;
		}
		void display()
		{
			A::display();
			cout<<"In display of class b\n";
			cout<<"Value of b is "<<b<<endl;
		}
};
int main()
{
	B Bobj(20);
	Bobj.display();
	cout<<"size of B:"<<sizeof(Bobj);
}
