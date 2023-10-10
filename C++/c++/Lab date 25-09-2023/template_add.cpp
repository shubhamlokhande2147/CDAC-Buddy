#include<iostream>
using namespace std;

template<class T>
T add(T &a,T &b)
{
	T result;
	result=a+b;;
	return result;
}

int main()
{
	int p=23;
	int q=22;
	cout<<"\nAddition : "<<add(p,q);
	
	double p1=12.3;
	double q1=12.2;
	cout<<"\nAddition : "<<add(p1,q1);
	
	return 0;
}
