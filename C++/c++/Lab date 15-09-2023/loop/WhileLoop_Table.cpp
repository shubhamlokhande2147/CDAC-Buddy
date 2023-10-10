#include<iostream>
using namespace std;
int main()
{
	int i=1,num;
	
	cout<<"\nEnter the num : ";
	cin>>num;

	while(i<=10)
	{
		cout<<num<<" * "<<i<<" = "<<num*i<<endl; 
		i++;
	}
	cout<<"\n";
    return 0;
	
}
