<<<<<<< HEAD
#include<iostream>
using namespace std;

class Demo 
{
   public:
       virtual void display()
	   {
	        cout<<"\nBaseclass display() is called";   	
	   }	
	   void print()
	   {
	   	    cout<<"\nBaseclass print() is called";   	
	   }
};

class Demo2 : public Demo
{
	public:
     virtual void display()
	   {
	        cout<<"\nDerivedclass display() is called";   	
	   }		
	   void print()
	   {
	   	    cout<<"\nDerivedclass print() is called";   	
	   }
};

int main()
{
	//Demo d1;
	//d1.display();
	//d1.print();
	
	Demo *ptr;
	Demo2 d1; 
	ptr=&d1;
	ptr->display();
	ptr->print();
	
	return 0;
}
=======
#include<iostream>
using namespace std;

class Demo 
{
   public:
       virtual void display()
	   {
	        cout<<"\nBaseclass display() is called";   	
	   }	
	   void print()
	   {
	   	    cout<<"\nBaseclass print() is called";   	
	   }
};

class Demo2 : public Demo
{
	public:
     virtual void display()
	   {
	        cout<<"\nDerivedclass display() is called";   	
	   }		
	   void print()
	   {
	   	    cout<<"\nDerivedclass print() is called";   	
	   }
};

int main()
{
	//Demo d1;
	//d1.display();
	//d1.print();
	
	Demo *ptr;
	Demo2 d1; 
	ptr=&d1;
	ptr->display();
	ptr->print();
	
	return 0;
}
>>>>>>> 780e2f0eead5a6b2acfd4a998fcfbbe958e5b35a
