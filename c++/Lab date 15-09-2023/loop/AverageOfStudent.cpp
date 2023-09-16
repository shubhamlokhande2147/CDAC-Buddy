#include<iostream>
using namespace std;
int main()
{
	int m1,m2,m3,m4,m5;
	double avg=0;
	for(int i=1;i<=5;i++)
	{
		cout<<"Enter marks of student "<<i<<endl;
		cin>>m1>>m2>>m3>>m4>>m5;
		avg=(m1+m2+m3+m4+m5)/5;
		cout<<"Average of student "<<i <<" = "<<avg<<endl;
	}
    return 0;
	
}
