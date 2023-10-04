#include<iostream>
using namespace std;

template<class T>
class A
{
   public: 
    T n1=4;
    T n2=5.3;
      void add()
      {
	   cout<<"Addition : " <<n1+n2;
	  }
};
int main()
{
	 
	 A <float>a;
	 a.add();
	
	return 0;
}
