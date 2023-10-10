#include<iostream>
using namespace std;

template<class T1,class T2>
void add(T1 a,T2 b)
{
	 float result;
	 result = a+b;
     cout<<"Addition : "<<a<<" + "<<b<<" = "<<result;
}

int main()
{
  add(12,1);
  return 0;	
}
