#include<stdio.h>
void ustrcpy(char*p,char*q);

int main()
{
	char a[15];
	char b[15];
	printf("\n Enter your String1:");
	scanf("%s",a);
    ustrcpy(b,a);
   printf("Copied string : %s",b);
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
