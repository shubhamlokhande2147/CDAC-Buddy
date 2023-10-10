#include<stdio.h>
#include<string.h>
void strreu(char* p);
int x=0;
//char a[15];

int main()
{  
  char a[15];
  	printf("\n Enter string:");
	scanf("\n%s",a);
    x=strlen(a)-1;
	strreu(a);
	return 0;
	
}
void strreu(char* p)
{   
     
	char b[15];
	int y=0;
	while(x>=0)
	{
		b[y]=p[x];
		x--;
		y++;
	
	}
	printf("\nReverse String : %s",b);
}
