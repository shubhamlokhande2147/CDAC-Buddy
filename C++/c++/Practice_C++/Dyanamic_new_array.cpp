#include<iostream>
using namespace std;

int main()
{
	int n;
	cout<<"\nEnter size of array : ";
	cin>>n;
	
	int *ptr = new int[n];
	
	cout<<"\nEnter element : \n";
	for(int i=0;i<n;i++)
	 {
	 	cin>>ptr[i];
	 }
	cout<<"\nDisplay element : \n"; 
	for(int i=0;i<n;i++)
	 {
	 	cout<<ptr[i]<<endl;
	 }
	
	delete[] ptr;
	
	return 0;
}
