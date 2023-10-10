#include<iostream>
using namespace std;

int main()
{
	int *ptr = new int(10);
	cout<<"\nBefore delete ptr value is : "<<*ptr;
	
	delete ptr;
	cout<<"\nAfter delete ptr value is : "<<*ptr;
	
	return 0;
}
