#include<stdio.h>

int main()
{
    char a[5] = "pune";
    printf("%s",a);
    //printf("%s",a++); //not allow bcoz a is const int*

    char *b = a;
    printf("\n%c",b[0]); 
    printf("\n%c",2[b]); 
    printf("\n%s",(b+1)); 
    printf("\n%s",(b+2)); 

    char c[15];
    printf("\nenter word : ");
    scanf("%s",&c);
    printf("\nenterd string : %s",c);
    printf("\n%s",(c+1));
    printf("\n%s",(c+2));

    return 0;
}