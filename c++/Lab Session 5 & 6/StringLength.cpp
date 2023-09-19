#include<iostream>
using namespace std;

int ustrlen(char*p);

int main()
{
	char a[15];
    int len;
	cout<<"\n Enter your String1:";
	cin>>a;
    len=ustrlen(a);
    cout<<"Length of string : "<<len;
}
int ustrlen(char*p)
{
    int len=0;
	while(*p!='\0')
	{
        len++;
		p++;
	}
            return len;
}
