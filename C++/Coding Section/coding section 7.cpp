#include<iostream>
using namespace std;

int main()
{
	int row;
	int col;
	int max=0;

	cout<<"enter the row size\n";
	cin>>row;
	cout<<"enter the col size\n";
	cin>>col;
	int c=col/2 , r=row/2, i,j;
	int arr[row][col];
	                       for(i=0;i<row;i++)
			                  {
				
									for(j=0;j<col;j++)
									{
					                     cin>>arr[i][j];
									}
		                  	  }
                   for(i=0;i<row;i++)
			                  {
				
									for(j=0;j<col;j++)
									{
					                     cout<<arr[i][j];
									}
									cout<<endl<<" ";
		                  	  }

	
		             if(col%2==0  && row%2 !=0)
					 {
					 	cout<<arr[r-1][c-1]<<" ";
					 	
                         cout<<arr[r][c]<<" ";
					 }
					 
					 else 
					 {
						    for(i=0;i<row;i++)
		                  {
			
								for(j=0;j<col;j++)
								{
									
				                     if(arr[i][j]>max)
				                     {
				                     	max=arr[i][j];
									 }
									
								}
	                  	  }
	                  	  cout<<max<<endl;
     	
     	
                   }

				
}
