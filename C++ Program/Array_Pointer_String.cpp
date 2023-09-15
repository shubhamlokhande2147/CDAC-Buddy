#include <iostream>
#include<string.h>
using namespace std;

int main()
{
     char *name[5]={"rohan","ram","rahul","rohit","rachana"};
    
	 for(int i=0;i<5;i++)
	 {
	  cout<<"\n"<<name[i]<<endl; //print value
      cout<<(name+i)<<endl; //print address
      cout<<*(name+i)<<endl; //print value
	 }
     
     cout<<"\n----------character by chaaracter prints-----------------"<<endl;
     for(int i=0;i<5;i++)
     {
     	int x=strlen(*(name+i));//calculate length,bcoz for ignore garbage value of string
     	
     	  for(int j=0;j<=x;j++)
     	   {
     	     cout<<*(*(name+i)+j);	
		   }
	 }
 
     return 0;
}
