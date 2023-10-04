#include<iostream>
using namespace std;

template<class T1,class T2>
float add(T1 a,T2 b)
{
	return a+b;
}

int main()
{
	cout<<"Addition : "<<add(2,3.4f);
	
	return 0;
}
