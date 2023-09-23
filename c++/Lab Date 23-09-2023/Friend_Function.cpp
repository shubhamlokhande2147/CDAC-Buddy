#include<iostream>
using namespace std;

class Tharmal
{
	int id;
	public:
		void display()
		{
		
    		//Printer::display();
	    	//Inkz::display();
		  //  Laser::display();
			cout<<"\nId : "<<id;
		 	cout<<"  Tharmal printer";
		}
		friend void data(Tharmal&);
};
void data(Tharmal& t1)
{
	t1.id=10;
}
int main()
{
	Tharmal t1;
    data(t1);
	t1.display();
	
	
	return 0;
}
