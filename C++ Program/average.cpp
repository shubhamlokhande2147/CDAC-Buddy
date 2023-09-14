#include <iostream>
using namespace std;
int main()
{
	int m1,m2,m3,m4,m5;
	float total,avg;
	
	cout<<"Enter the 5 subject marks : "<<endl;
	cin>>m1>>m2>>m3>>m4>>m5;
	
	total = m1+m2+m3+m4+m5;
	avg = (float)total/5;
	cout<<"Average of 5 subjects marks : "<<avg;
	
	return 0;
}
