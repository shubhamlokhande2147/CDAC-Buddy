
//Not run progran in Dev++

#include<stdio.h>
#include<stdlib.h>


int main()
{
    int n,sum=0;
    int *ptr;
    
    printf("\nEnter the element size : ");
    scanf("%d",&n);
    
    ptr=(int *)malloc(n * sizeof(int));  //malloc fun
    
    printf("\nEnter element : ");
       for(int i=0;i<n;i++)
       { 
         scanf("%d",&*ptr+i);
	   }
     for(int i=0;i<n;i++)
       { 
         printf("%d",*ptr+i);
         sum=sum + *(ptr+i);
	   }
	   printf("\nSum : %d",sum);
	   free(ptr);
	
	return 0;
}
