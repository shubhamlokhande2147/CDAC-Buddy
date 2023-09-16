#include<iostream>
using namespace std;

int main()
{
	char *ptr=new char[20];
	cout<<"\nEnter the character : ";
	cin>>ptr;
	
	cout<<"Display String :  ";
	cout<<ptr;
	
	delete[] ptr;
	
	return 0;
}
