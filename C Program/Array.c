#include<stdio.h>

void main()
{
    int a[5] = {1,2,3,4,5};
   
    //Sizeof Operator 
    printf("sizeof a : %d",sizeof(a));   //20 byte
    printf("\nsizeof a[0]: %d",sizeof(a[0]));  //4 byte
    printf("\nsizeof a[2]: %d",sizeof(a[2]));
    printf("\nTotal Element in Array: %d",sizeof(a)/sizeof(a[0]));  //5

    //Addresses
    printf("\n\nAdr of  &a: %d",&a);  
    printf("\nAdr of  &a[1]: %d",&a[0]);  
    printf("\nAdr of  &a[3]: %d",&a[3]);  

    //Value of an Array
    printf("\n\nAdr of  a[0]: %d",a[0]);  //1
    printf("\nAdr of  a[1]: %d",a[1]);  //2
    printf("\nAdr of  a[3]: %d",a[3]);  //4

}