#include<stdio.h>

void main()
{
    int a = 10;
    int *b = &a;
    int **c = &b;
    
    //Addresses
    printf("\n%d",&a);
    printf("\n%d",&b);
    printf("\n%d",&c);

    //Pointing to same value
    printf("\n\n%d",a);
    printf("\n%d",*b);
    printf("\n%d",**c);
  
}