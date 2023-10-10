#include<iostream>
using namespace std;

int main()
{
	int a=10;
	int *b=&a;
	int **c=&b;
	
	cout<<a<<" "<<*b<<" "<<**c<<endl;
	cout<<&a<<" "<<b<<" "<<*c<<endl;
		cout<<sizeof(a)<<" "<<sizeof(b)<<" "<<sizeof(c);
	
	return 0;
}
