#include<stdio.h>
#include<stdlib.h>

int main()
{
	int n;
	char *ptr;
	
	
	printf("enter the no. of character : ");
	scanf("%d",&n);
	
	ptr = (char*)malloc(n * sizeof(char)+1);
	
	printf("\naccept String. : ");
	scanf("%s",ptr);
	printf("\nDisplay String. :%s ",ptr);
	free(ptr);
}
