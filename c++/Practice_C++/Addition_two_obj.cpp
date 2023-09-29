#include<iostream>
using namespace std;

class Demo
{
   int a;
     public:
     	void get();
     	void show();
     	Demo add(Demo&);
};

Demo Demo::add(Demo &d)
{ 
     Demo temp;
     temp.a=this->a+d.a;
     return temp;
}

void Demo::get()
{
	cout<<"\nEnter value of a : ";
	cin>>a;
}

void Demo::show()
{
	cout<<"\na: "<<a;
}

int main()
{
	Demo d1;
	d1.get();
	d1.show();
	
	Demo d2;
	d2.get();
	d2.show();
	
	Demo d3=d2.add(d2);
	d3.show();
	return 0;
}
