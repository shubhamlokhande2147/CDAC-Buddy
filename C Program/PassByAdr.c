#include<stdio.h>
void swap(int *p, int *q);  //fun declaration

void main()
{
    int a=10,b=20;
    printf("\nBefore swap a : %d b : %d",a,b);
    swap(&a,&b);   //fun calling
    printf("\nAfter swap a : %d b : %d",a,b);
}

void swap(int *p, int *q)  //fun defination
{
    int temp;
    temp = *p;    //swap the value
    *p = *q;
    *q = temp;
}








