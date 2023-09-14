#include<stdio.h>
int main()
{   
    int n1,r,sum=0,temp;
    printf("Enter the first no. : ");
    scanf("%d",&n1);
   
    temp=n1;

    while (n1>0)
    { 
       r=n1%10;
       sum = sum + (r*r*r);
       n1 = n1/10;
    }
    if (temp==sum)
    {
       printf("armstrong number");
    }
    else
    {
        printf("armstrong not number");
    }
}