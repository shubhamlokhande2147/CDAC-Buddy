#include <iostream>
using namespace std;
#include <string.h>

//user defined string class 

class String1{
	int len;
	char * ptr; //base address of string as pointer data member
	public:
		String1(char *);//parameterized constructor decln
		void show();
		String1(char,int);//overloaded parameterized constructor decln
		String1(); //default constructor
		String1(String1 &); //copy constructor
		~String1(); //destructor
};
void String1 :: show() //to display string
{
	cout<<"String is "<<ptr<<endl;  
	cout<<"length is "<<len<<endl;
}
String1::String1(char * ptr1) //parameterized constructor defn
{
	len=strlen(ptr1);
	ptr=new char[len+1];//dma
	strcpy(this->ptr,ptr1);
	
}
String1::String1(char ch,int len) //parameterized constructor defn
{
	int i;
	this->len = len;
	ptr=new char[this->len+1];//dma
	for(i=0;i<this->len;i++)
	{
		ptr[i]=ch;
		cout<<ptr[i];
	}
	ptr[i]='\0';	
}
String1::String1() //default constructor defn to accept string 
{
	int len;
	cout<<"\n enter length of your string \n";
	cin>>len;
	char ptr1[len+1];
	this->len=len;
	ptr=new char[this->len+1];//dma
	cout<<"enter your string \n ";
	cin>>ptr1;
	strcpy(ptr,ptr1);
}
String1::String1(String1 &s) //copy constructor
{
	
	this->len=s.len;
	this->ptr=new char[this->len+1];
	strcpy(this->ptr,s.ptr);
}
String1::~String1() //destructor
{
	if(ptr)
	delete []ptr;
	ptr=NULL;
}

int main(){
	String1 s1("computer");
	s1.show();
	
	String1 s2('+',20);
	
	String1 s4;
	s4.show();	
	
	String1 s5("laptop");
	{
		cout<<"  copy constructor called\n";
		String1 s6(s5); //copy constructor
	    s6.show();
	}
	s5.show(); 
	
}
