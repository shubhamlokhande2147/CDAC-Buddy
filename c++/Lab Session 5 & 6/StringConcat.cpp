#include<iostream>
using namespace std;

void strconcat(char*p,char*q);
int main()
{
	char *a = new char[15];
	char *b = new char[15];
	cout<<"\n Enter your String1:";
	cin>>a;
	cout<<"\n Enter your String2:";
	cin>>b;
	strconcat(a,b);
	cout<<"\nConcate String : "<<a;
	delete[] a;
    cout<<"\nAfter Delete Opeartion : \t a="<<a;
	
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
