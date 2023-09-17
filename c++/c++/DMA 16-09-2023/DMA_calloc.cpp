#include<stdio.h>
#include<stdlib.h>

int main()
{
	int n,i,sum=0;
	int *ptr;
	
	printf("enter the no. of element : ");
	scanf("%d",&n);
	
	ptr = (int*)calloc(n , sizeof(int));
	
	printf("\naccept no. : ");
	
	for(i=0;i<n;i++)
	{
		scanf("%d",(ptr+i));
	}
	for(i=0;i<n;i++)
	{
		sum=sum+ *(ptr+i);
	}
	printf("\nSum : %d",sum);
	free(ptr);
}
