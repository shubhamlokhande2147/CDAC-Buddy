#include<iostream>
using namespace std;

int main()
{
	int base,exp;
	int power=1;
	cout<<"Enter base and Exponent: ";
	cin>>base>>exp;
	int i=1;
	while(i<=exp)
	{
		power*=base;
		i++;
	}
	cout<<"\nPower = "<<power;
}
