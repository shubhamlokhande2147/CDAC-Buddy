#include<stdio.h>
void square(int *p);

void main()
{
    int a=10;
    square(&a);
    printf("Square : %d",a);
}
void square(int *p)
{
    *p = *p * *p;
}
