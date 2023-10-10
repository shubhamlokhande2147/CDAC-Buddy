//LAB 11 vitual and pure virtual function

#include<iostream>
using namespace std;

class Printer
{
	public:	
		virtual void display()=0;   //pure virtual function
};

class Inkz: public Printer
{
	public:
		virtual void display()
		{ 
		 	cout<<"Inkz printer";
		}
};


class Tharmal:public Inkz
{
	public:
		virtual void display()
		{
	    	Inkz::display();
		 	cout<<"\nTharmal printer";
		}
};

int main()
{
	Tharmal t1;
	t1.display();
		
	return 0;
}
