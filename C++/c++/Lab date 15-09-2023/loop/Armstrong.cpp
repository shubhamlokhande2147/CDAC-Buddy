#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
	int num,rem;
	int sum=0;
	printf("enter the number:");
	scanf("%d",&num);
	int temp=num;
	
	while(num>0)
	{
		rem=num%10;
		sum=sum+(rem*rem*rem);
		num=num/10;
	}
	if(temp==sum)
	{
		printf("%d is armstrong number",temp);
	}
	else
	{
		printf("%d is not armstrong number",temp);
	}
	return 0;
}
