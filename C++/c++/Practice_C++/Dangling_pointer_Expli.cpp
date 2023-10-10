//Run online
//dangling pointer overcome to write deffination of copy constructor

#include<iostream>
using namespace std;
#include<string.h>

class Demo
{
	int len;
	char *ptr;
	     public:
	     	  Demo(char *sptr)
	     	  {
	     	  	 cout<<"\nContructor is called";
	     	  	  len=strlen(sptr);
	     	  	  ptr=new char[len+1];
				  strcpy(ptr,sptr);
			  }
			  
			   ~Demo()
			   {
			   	 cout<<"\nDestructor is called"<<endl;
			   	 if(ptr)
			   	   delete [] ptr;
			      ptr=NULL;  
			   }
			   
			  void show()
			  {
			  	cout<<"\nString : "<<ptr;
			  }
			  Demo(Demo&d)//copy constructor
			  {
			  	this->len;
			  	this->ptr=new char[len+1];
			  	strcpy(this->ptr,d.ptr);
			  }
};



int main()
{
	Demo d1("Shubham");
	d1.show();
//	d1.~Demo();
 {
 	Demo d2(d1);
 	d2.show();
 	d2.~Demo();
	 }	
	 d1.show();
}
