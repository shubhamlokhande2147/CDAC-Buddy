#include<iostream>
using namespace std;

void strconcat(char*p,char*q);
int main()
{
	char a[15],b[15];
	cout<<"\n Enter your String1:";
	cin>>a;
	cout<<"\n Enter your String2:";
	cin>>b;
	strconcat(a,b);
	cout<<"\nConcate String : "<<a;
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
