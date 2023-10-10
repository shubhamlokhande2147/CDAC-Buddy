#include<stdio.h>
int main()
{   
    int n1,n2;
    printf("Enter the first no. : ");
    scanf("%d",&n1);

    printf("Enter the second no. : ");
    scanf("%d",&n2);

    if(n1==n2)
    {
        printf("no. is equal");
    }
    else if (n1>n2)
    {
        printf("no.1 is greater");
    }
    else if (n1<n2)
    {
        printf("no.1 is smaller");
    }
    else
    {
        printf("please enter no.");
    }
    
    
}