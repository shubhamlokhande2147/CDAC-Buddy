#include<iostream>
using namespace std;

int ustrlen(char *c);

int main()
{
	int len;
	char *ch = new char[20];
	cout<<"\nEnter character : ";
	cin>>ch;
	 
	 len=ustrlen(ch);
	 cout<<"\nLength : "<<len;
	 
	 delete[] ch;
	
     return 0;	
}

int ustrlen(char *c)
{
	int len;
	   while(*c!='\0')
	   {
	   	 len++;
	   	 c++;
	   }
	   return len;
	
}
