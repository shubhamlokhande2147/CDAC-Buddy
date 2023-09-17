#include<iostream>
#include<string.h>
using namespace std;
class String1{
	int len;
	char *ptr;
	public:
		String1(char*); //only string is passed as parameter
		String1(char,int); //string and its length is passed 
		String1(int);	// here only length of string is passed
		String1();	//No argument is passed
		void show();
};
String1::String1(char ch,int len)
{
	int i;
	this -> len=len;
	ptr=new char[this->len];
	for(i=0;i<this->len;i++)
	{
		ptr[i]=ch;
		cout<<ptr[i];
	}
	ptr[i]='\0';
}

String1::String1(char * ptr1)
{
	len = strlen(ptr1);
	ptr = new char[len+1];
	strcpy(this->ptr,ptr1);
}

String1::String1(int len)
{
	this->len=len;
	ptr = new char[this->len+1];
	char ch[this->len+1];
	cout<<"\nEnter string \n";
	cin>>ch;
	strcpy(ptr,ch);
} 

String1::String1(){
	int len;
	cout<<"Enter Length: \n";
	cin>>len;
	char ptr1[len+1];
	this->len=len;
	ptr = new char[this->len+1];
	cout<<"Enter string\n";
	cin>>ptr1;
	strcpy(ptr,ptr1);
}

void String1::show()
{
	cout<<"String is  "<<ptr<<endl;
	cout<<"Length is  "<<len<<endl;
}

int main()

{
	String1 s1("cdac");
	s1.show();
	String1 s2('*',50);
	String1 s3(7);
	s3.show();
	String1 s4;
	s4.show();
	return 0;
}










