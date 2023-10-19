#include<iostream>
using namespace std;

int main()
{
	int i,j;
	int arr[3][3]={
	               1,2,3,
				   4,5,6,
				   7,8,9  
			    };
			    int temp[3][3];
			    
	 for(i=0;i<3;i++)
	   {
	   	  for(j=0;j<3;j++)
	   	  {
	   	  	cout<<arr[i][j]<<" ";
	   	  	temp[i][j]=arr[i][j];
		  }
		    cout<<endl;
		}	
	 
	  cout<<endl;

		for(i=0;i<3;i++)
		{
		
		if(i==0)
		{
		  for(j=2;j>=0;j--)
	   	  {
	   	  	arr[i][j]=temp[i][j];
	   	  	cout<<arr[i][j]<<" ";
		  }
		    cout<<endl;
	    
		}
		else 
		{
		
	     for(j=0;j<3;j++)
	   	  {
	   	  	cout<<arr[i][j]<<" ";
		  }
		    cout<<endl;	
		 }	 
}
			    
    return 0;			    
}
