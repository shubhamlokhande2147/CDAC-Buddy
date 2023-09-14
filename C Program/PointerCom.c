#include<stdio.h>

int main()
{
        int a[5] = {1,2,3,4,5};
        int *b = &a[4];
        int *c = a+4;

        if(b == c)  //pointer comparison
        {
            printf("\nBoth pointer pointing to same location 1");
        }

        if(a == b)  
        {
            printf("\nBoth pointer pointing to same location 2");
        }
        
        if(*b == *c)  
        {
            printf("\nBoth pointer pointing to same value");
        }
        if(*b == *a+4)  
        {
            printf("\nBoth are Equals");
        }


  return 0;
}