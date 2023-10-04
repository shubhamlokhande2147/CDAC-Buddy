#include<iostream>
using namespace std;
//static int b=0;

class Static
{
		   public:
	   	   void fun()
	   	   {	
	   	      int a=0;	  
	   	      cout<<"\nLocal a : "<<a;
 	   	   	  a++; 
		   } 
		    void fun1()
	   	   {
	   	   	  static int b=0;
	   	   	  cout<<"\nSatic b : "<<b;
	   	   	  b++;
	      }
		   
};

int main()
{
	Static s1;
	s1.fun();
	s1.fun();
	s1.fun();
	cout<<"\nFinal : ";
	s1.fun();
 
    Static s2;
	s2.fun1();
	s2.fun1();
	s2.fun1();
    cout<<"\nFinal : ";
	s2.fun1();
	
	return 0;
}
