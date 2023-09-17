#include<iostream>
using namespace std;
int main()
{
	int i,fact=1;
	int num;
	cout<<"\nEnter the num : ";
	cin>>num;
	for(i=1;i<=num;i++)
	{
		fact*=i;	

	}
	cout<<"Factorial of number is "<<fact;
    return 0;
	
}
