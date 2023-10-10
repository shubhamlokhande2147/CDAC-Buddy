#include<iostream>
using namespace std;

int main()
{
	int base,exp;
	int power=1;
	cout<<"Enter base and Exponent: ";
	cin>>base>>exp;
	int i=1;
	for(i=1;i<=exp;i++)
	{
		power*=base;
	}
	cout<<"\nPower = "<<power;
}
