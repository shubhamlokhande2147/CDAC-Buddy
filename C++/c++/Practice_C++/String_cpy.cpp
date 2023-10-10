#include<iostream>
using namespace std;
void ustrcpy(char *a,char *b);

int main()
{
	char a[5]="pune";
	char b[5];
	
	ustrcpy(a,b);
	
	cout<<b;
	return 0;
}

void ustrcpy(char *a,char *b)
{
	while(*a!='\0')
	{
		*b=*a;
		a++;
		b++;
	}
	*a='\0';
}
