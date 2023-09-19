#include<iostream>
using namespace std;

void ustrcpy(char*p,char*q);

int main()
{
	char a[15];
	char b[15];
	cout<<"\n Enter your String1:";
	cin>>a;
    ustrcpy(b,a);
    cout<<"Copied string : "<<b;
}
void ustrcpy(char*q,char*p)
{
	while(*p!='\0')
	{
		*q=*p;
		p++;
		q++;
	}
}
