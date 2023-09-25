#include<iostream>
using namespace std;
template <class T>
T swap1(T &a,T &b)
{
	T temp;
	temp=a;
	a=b;
	b=temp;
}
int main()
{
	cout<<"Enter two Number: ";
	float m1,m2;
	//double d1,d2;
	cin>>m1>>m2;
	cout<<"\nBefore Swapping Numbers are :"<<" m1= "<<m1<<" m2 = "<<m2;
	swap1(m1,m2);
	cout<<"\nAfter Swapping Numbers are :"<<" m1= "<<m1<<" m2 = "<<m2;

	//for double
	cout<<"\nEnter two double Number: ";
	double d1,d2;
	cin>>d1>>d2;
	cout<<"\nBefore Swapping Numbers are :"<<" d1= "<<d1<<" d2 = "<<d2;
	swap1(d1,d2);
	cout<<"\nAfter Swapping Numbers are :"<<" d1= "<<d1<<" d2 = "<<d2;

	return 0;
}
