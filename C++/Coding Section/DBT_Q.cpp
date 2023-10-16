#include<iostream>
using namespace std;

int main()
{
	int i,n;
	cout<<"enter the size of array : ";
	cin>>n;
	
	int arr[n];
	int temp1[n];
	int temp2[n];	
	
	for( i=0;i<n;i++)
	{
	     cin>>arr[i];	
	}
	
	for(int i=0;i<n;i++)
   {
		if(arr[i]<9)
		{
			temp1[i]=arr[i];
		}
		else
	    {
			temp2[i]=arr[i];
		}

    }
	      for(int i=0;i<n;i++)
          {
           cout<<"\n"<<temp1[i]<<endl;
 		  }
	      for(int i=0;i<n;i++)
          {
          cout<<temp2[i]<<endl;
 		  }

	return 0;
}
