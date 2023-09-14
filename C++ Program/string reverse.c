#include<stdio.h>
#include<string.h>
void strreu();
int x=0;
char a[15];

int main()
{  
  
  	printf("\n Enter string:");
	scanf("\n%s",a);
    x=strlen(a)-1;
	strreu();
	return 0;
	
}
void strreu()
{   
     
	char b[15];
	int y=0;
	while(x>=0)
	{
		b[y]=a[x];
		x--;
		y++;
	
	}
	printf("\nReverse String : %s",b);
}
