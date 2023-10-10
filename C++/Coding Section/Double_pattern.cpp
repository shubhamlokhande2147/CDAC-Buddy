#include<iostream>
using namespace std;

int main()
{
	for(int i=1;i<=5;i++)
	  {
	  
	  	for(int j=5;j>i;j--)
	   	{
		   cout<<" ";
		} 
		
		
		 for(int k=0;k<i;k++)
	         {
	         	 cout<<"*";	       
			 } 
		   cout<<i;

     	  for(int l=0;l<i;l++)
			 {
			   cout<<"*";
			 }
			 cout<<"\n";
	  }
	
	return 0;
}
