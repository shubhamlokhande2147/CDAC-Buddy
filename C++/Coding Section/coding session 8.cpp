#include<iostream>
using namespace std;

int main()
{  
    int n,max=0;;
    cout<<"\nenter array size :";
    cin>>n;
    
    int arr[n];
	
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}
	
	for(int i=0;i<n;i++)
	{
		//cout<<arr[i];
         if(arr[i]>max)
         {
         	max=arr[i];
		 }
	}
	cout<<"\nMax : "<<max;
	
		
	return 0;
}
