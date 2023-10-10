#include<stdio.h>
int ustrlen(char *);   //fun declaration

int main()
{
	char a[15];
	int len;
	printf("\nEnter the String : ");
	scanf("%s",a);
	
	len=ustrlen(a);  //fun call
	printf("\nLength of the string : %d",len);
	return 0;
}

int ustrlen(char *p)   //fun defination
{
	int len=0;
	
	while(*p != '\0')
	{
		len++;
		p++;
	}
	return len;
}
