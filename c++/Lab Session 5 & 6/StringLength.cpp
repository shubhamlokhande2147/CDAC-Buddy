#include<iostream>
using namespace std;

int ustrlen(char*p);

int main()
{
	char *a = new char[15];
    int len;
	cout<<"\n Enter your String1:";
	cin>>a;
    len=ustrlen(a);
    cout<<"\nLength of string : "<<len;
    
	delete[] a;
	cout<<"\nString After delete opeartion - "<<a;
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
