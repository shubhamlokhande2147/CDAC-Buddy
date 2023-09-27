//function overloading

#include<iostream>
using namespace std;

class ABC
{
	public:
		 void add(int a,int b)	
		 {
		 	cout<<"\nAddition : "<<a+b;
		 }
		 void add(int a,float b)	
		 {
		 	cout<<"\nAddition : "<<a+b;
		 }
		 void add(int a,double b)	
		 {
		 	cout<<"\nAddition : "<<a+b;
		 }
		 
		 void add(int a,int b ,double c)	
		 {
		 	cout<<"\nAddition : "<<a+b+c;
		 }
		 
};

int main()
{
	ABC a1;
	a1.add(12,13);
   	a1.add(22,12.6f);
    a1.add(42,134.6);
   a1.add(12,23,232.23);
   return 0;	
} 
