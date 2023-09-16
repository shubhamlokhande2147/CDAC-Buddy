#include<iostream>
using namespace std;

int main()
{
	int n;
	cout<<"Enter no of Elment: ";
	cin>>n;
	int *ptr = new int[n];
	cout<<"Enter elements";
	for(int i=0;i<n;i++)
	{
		cin>>ptr[i];
	}
	cout<<"\nArray Element are: ";
	for(int i=0;i<n;i++)
	{
		cout<<ptr[i]<<" ";
	}
	
	delete[] ptr;
	
	return 0;
}
