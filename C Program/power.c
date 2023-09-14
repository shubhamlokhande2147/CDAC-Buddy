#include<stdio.h>
#include<math.h>

int main()
{   
    double base,expo,power=0;
   
    printf("Enter the base no. : ");
    scanf("%lf",&base);  
    printf("Enter the expo no. : ");
    scanf("%lf",&expo);
  
    power = pow(base,expo);
    printf("%lf",power);
    return 0;
}