#include<iostream>
using namespace std;
#include<string.h>

void ustrconcat(char*p,char*q);
int main()
{

	char *a,*b;
	cout<<"\n Enter your String 1:";
	a=new char[15];
	cin>>a;
	
	cout<<"\n Enter your String 2:";
	b=new char[15];
	cin>>b;

	ustrconcat(a,b);
	cout<<"\nConcate String : "<<a;
	
	delete []a;
	delete []b;
	return 0;	
}
 void ustrconcat(char*p,char*q){
 	while(*p!='\0')
 	{p++;}
 	while(*q!='\0'){
 		*p=*q;
 		p++;
 		q++;
	 }	
	 *q = '\0';
 }
