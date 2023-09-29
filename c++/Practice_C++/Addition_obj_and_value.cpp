#include<iostream>
using namespace std;

class Demo
{
	int a=5;
	  public:
	  	 int add(int a)
	  	 { 
	  	      this->a=this->a + a;
			  return a;	
	     }
};

int main()
{
	Demo d1;
	cout<<"Addition : "<<d1.add(15);
	
	return 0;
}
