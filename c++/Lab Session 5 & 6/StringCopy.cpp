#include<iostream>
using namespace std;

void ustrcpy(char*p,char*q);

int main()
{
	char *a = new char[15];
	char *b = new char[15];
	cout<<"\n Enter your String1:";
	cin>>a;
    ustrcpy(b,a);
    cout<<"\nCopied string : "<<b;
    delete[] a;
    cout<<"\nAfter Delete Opeartion : \t a="<<a;
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
