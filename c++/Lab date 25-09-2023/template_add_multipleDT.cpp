#include<iostream>
using namespace std;

template<class T1,class T2>
float add(T1 &a,T2 &b)
{
	float result;
	result = a+b;
	return result;
}

int main()
{
  int a=23;
  float b=4.5;
  cout<<"\nAddition : "<<add(a,b);
  return 0;	
}
