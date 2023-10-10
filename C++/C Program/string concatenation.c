#include<stdio.h>
void strconcat(char*p,char*q);
int main()
{
	char a[15],b[15];
	printf("\n Enter your String1:");
	scanf("%s",a);
	printf("\n Enter your String2:");
	scanf("%s",b);
	strconcat(a,b);
	printf("Concate String : %s",a);
	return 0;	
}
 void strconcat(char*p,char*q){
 	while(*p!='\0')
 	{p++;}
 	
 	while(*q!='\0'){
 		*p=*q;
 		p++;
 		q++;
	 }	
 }
