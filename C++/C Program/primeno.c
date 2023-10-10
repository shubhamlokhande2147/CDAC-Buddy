#include<stdio.h>
int main()
{   
    int n1,i,m=0,f=0;
    printf("Enter the first no. : ");
    scanf("%d",&n1);

    m=n1/2;
    for(i=2;i<=m;i++)
    {
        if(n1%i==0)
        {
            printf("no. is not prime");
            f=1;
            break;

        }
    }

    if(f==0)
    {
            printf("no. is prime"); 
            return 0;
    }

    

}