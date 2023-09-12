#include<stdio.h>

void main()
{
    int a=10;
    int *b=&a;

    char ch='A';
    char *chh=&ch;

    printf("size of a : %d",sizeof(a));   //4bytes
    printf("\nsize of b : %d",sizeof(b));   //4bytes
    printf("\nsize of &a : %d",sizeof(&a));  //4bytes

    
    printf("\n\nsize of ch : %d",sizeof(ch));  //1bytes
    printf("\nsize of chh : %d",sizeof(chh));   //4byte
    printf("\nsize of &ch : %d",sizeof(&ch));   //4bytes
    printf("\nsize of &chh : %d",sizeof(&chh));   //4bytes

    //Pointer Arithmetic
    int a1[5] = {1,2,3,4,5};

    int *b1= a1;
    b++;  //(a+0)= 100+0 = 100++ = 101 =2
    printf("\n\n*b1 : %d",*b1);
    printf("\n*b1+1 : %d",*b1+1);  //2+1 = 3
    
    b1 = b1 + 3;
    printf("\n*b1+3 : %d",*b1);  //3+2 = 5


}