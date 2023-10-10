//LAb 11 Daimond problem

#include<iostream>
using namespace std;

class Printer
{
	int id=101;
	public:	
		void display()
		  {
		  	cout<<"\nId : "<<id;
			cout<<"  Black and white printer";
	      }
};

class Inkz:virtual public Printer
{
	int id=201;
	public:
		void display()
		{ 
		    cout<<"\nId : "<<id;
		 	cout<<"  Inkz printer";
		}
};

class Laser:virtual public Printer
{
	int id=301;
	public:
		void display()
		{
		    cout<<"\nId : "<<id;
		 	cout<<"  Laser printer";
		}
};

class Tharmal:public Inkz,public Laser
{
	int id=401;
	public:
		void display()
		{
		
    		Printer::display();
	    	Inkz::display();
		    Laser::display();
			cout<<"\nId : "<<id;
		 	cout<<"  Tharmal printer";
		}
};

int main()
{
	Tharmal t1;
	t1.display();
		
	return 0;
}
