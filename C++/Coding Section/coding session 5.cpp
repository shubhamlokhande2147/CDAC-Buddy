#include<iostream>
using namespace std;

int main()
{
	int arr[]={10,30,50,70,20};
    int sum=0;
    int bud=150;
    
    for(int i=0;i<5;i++)
    {
    	sum = sum + arr[i];
    	if(sum<=bud)
    	{
		 //sum = sum + arr[i];
             cout<<sum;
             
		}
		
	}

  return 0;	
}
