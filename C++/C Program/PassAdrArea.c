#include<stdio.h>
float area(float* ,float*);
float area1(float r);
const float pi= 3.142f; 
 
void main() 
{
    float len,bre,total;

    printf("\nenter len : ");
    scanf("%f",&len);
    
    printf("enter bre : ");
    scanf("%f",&bre);

    total = area(&len,&bre);
    printf("\nArea : %f",total);

    printf("\nArea : %f",area1(len));

}

float area(float* p,float* q)
{
    float c = *p * *q;
    return c;
}

float area1(float r)
{
    return pi * r *r;
}
