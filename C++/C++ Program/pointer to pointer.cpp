#include <iostream>
using namespace std;
int main()
{
	int a=10;
	int*b=&a;
	int**c=&b;
	cout<<**c<<" "<<*b<<" "<<a<<"\n";
	cout<<"sizeof b: "<<sizeof(b)<<endl;
	cout<<"sizeof **c: "<<sizeof(**c)<<endl;
	cout<<"sizeof c: "<<sizeof(c)<<endl;
	cout<<"sizeof *b: "<<sizeof(*b)<<endl;
return 0;
}
