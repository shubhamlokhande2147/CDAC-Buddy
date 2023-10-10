#include<iostream>
using namespace std;
#include<string.h>

int main()
{
	char *ptr[6]={"Shubham","Omkar","Vaibhav","Vivek","Shiv","Sid"};
	
	cout<<"\nDisplay string by string : ";
	   for(int i=0;i<6;i++)
	   {
	   	  cout<<"\n";
	   	  cout<<ptr[i];
	   }
	
	cout<<"\n\nDisplay char by char each string : \n";   
	   for(int i=0;i<6;i++)
	   {
	   	  int x=strlen(*ptr+i);
	   	     
	   	      for(int j=0;j<=x;j++)
	   	      {
	   	        cout<<*(*(ptr+i)+j);	
			  }
			  cout<<endl;
	   }
	
	return 0;
}

