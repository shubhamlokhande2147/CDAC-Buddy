/*one array + compare one element to each other and 
if sum of two element is 6 then prints element
o/p ->
i : 1 j :5
i : 5 j :1

*/
#include<iostream>
using namespace std;

int main()
{	int i,j,sum=0;

	int arr[4]={1,5,7,1};
	for(i=0;i<4;i++)
	{
	    for(j=i+1;j<5;j++)
	    {
	      sum=arr[i]+arr[j];
	      if(sum==6)
           {
             cout<<"i : "<<arr[i]<<" "<<"j :"<<arr[j]<<endl;
           }  
	      
        }	 		

    }

	
	return 0;
}
