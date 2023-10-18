#include<iostream>
using namespace std;

int main()
{
	int arr[]={86,0,0,16,0,16,0,0,53,0,19};
	
//	cout<<sizeof(arr)/sizeof(arr[0]);
	
	int i,j,sum=0,count=0;
	
	for(i=0;i<11;i++)
	  {
	  	 for(j=i;j<11;j++)
	  	   {
	  	      sum = arr[i] + arr[j];
	  	        if(sum < 1)
	  	        {	  	        
				  	count++;
	  	   			cout<<arr[i] << " "<<arr[j]<<endl;	

				}
		   }
	  }
   cout<<"Total pair : "<<count;

	return 0;
}
