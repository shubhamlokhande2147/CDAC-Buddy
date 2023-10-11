/*
op=
        **
       ****
      ******
     ********
    **********
   ************
  **************
 ****************
******************
******************
 ****************
  **************
   ************
    **********
     ********
      ******
       ****
        **
 */       

#include<iostream>
using namespace std;

int main()
{
	for(int i=1;i<=10;i++)
	  {
	  
	  	for(int j=10;j>i;j--)
	   	{
		   cout<<" ";
		} 
		
		
		 for(int k=1;k<i;k++)
	         {
	         	 cout<<"*";	       
			 } 
	

     	  for(int l=1;l<i;l++)
			 {
			   cout<<"*";
			 }
			 
			 cout<<"\n";	  
     }
     
     
	   for(int i=1;i<=10;i++)
        {
     		for(int j=1;j<i;j++)
	     	{
		     cout<<" ";
		    } 
		
		 for(int k=10;k>i;k--)
	         {
	         	 cout<<"*";	       
			 } 

     	  for(int l=10;l>i;l--)
			 {
			   cout<<"*";
			 }
			 cout<<"\n";
  	
  }
	
	return 0;
}
