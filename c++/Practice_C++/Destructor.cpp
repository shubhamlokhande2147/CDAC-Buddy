#include<iostream>
using namespace std;

class Demo
{
	public:
		 virtual ~Demo()
		 {
		 	cout<<"\nBaseclass destructor is called";
		 }
		 
};

class Demo2 : public Demo
{
	public:
		 ~Demo2()
		 {
		 	cout<<"\nDerivedclass destructor is called";
		 }
		 
};

int main()
{
	Demo *ptr=new Demo2();
	delete ptr;
	
	
	return 0;
}
