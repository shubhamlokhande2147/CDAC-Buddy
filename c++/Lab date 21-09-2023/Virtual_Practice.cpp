#include<iostream>
using namespace std;

class Base
{
  public:
        //virtual void show()=0;//it is pure virtual function
        virtual void show()//virtual function
		{
		  cout<<"\nDisplay show of base class";	
		}	
		void print()
		{
		  cout<<"\nDisplay print of base class";
		}
};

class Derived : public Base
{
  public:
        void show()
		{
		  cout<<"\nDisplay show of derived class";	
		}	
		void print()
		{
		  cout<<"\nDisplay print of derived class";
		}
   	
};

int main()
{
	Base *ptr;
	Derived d1;
	ptr=&d1;
	ptr->show();
	ptr->print();
	
	return 0;
}
