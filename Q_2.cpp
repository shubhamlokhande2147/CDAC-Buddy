#include<iostream>
using namespace std;
#include<string.h>

class String
{
  int length;
  char *ptr;
     public:
	   String()  //default constru
	   {
	      length=0;   	
	   }	
	   
	   String operator=(String &s)
	   {
	   	  length=strlen(s.ptr);
	   	  delete [] ptr; //memory delete
	   	  ptr = new char[length +1];
	   	  strcpy(ptr,s.ptr);
	   }
	   
	   String(char *str)
	   {
	   	 length = strlen(str);
	   	 ptr = new char[length +1];
	   	 strcpy(ptr,str);
	   }
	   
	   String(String & c) //call copy con
	   {
	   	 length = strlen(c.ptr);
	   	 ptr = new char[length +1];
	   	 strcpy(ptr,c.ptr);
	   }
	   
	   ~String()  //destructor
	   {
	   	 cout<<"\nDestructor is called";
	   	if(ptr)
	   	{
	   		delete[] ptr;
	   		ptr=NULL;
		   }
		   
	   }
	   
	   void show()
	   {
	   	 cout<<"\nString : "<<ptr;
	   	 cout<<"\nLength : "<<length;
	   }
};


int main()
{
	char str1[25],str2[25];
	cout<<"\nEnter string 1 :";
	cin>>str1;
	cout<<"\nEnter string 2 :";
	cin>>str2;
	
	String s1(str1),s2(str2);   //obj created
	s1.show();
	s2.show();
	
	//s2(s1);
	//s2.show();
	String s3=s2;
	s3.show();
	
	return 0;
}
