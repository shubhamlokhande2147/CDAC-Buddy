#include<iostream>
using namespace std;

int main()
{
    int arr[5][5]=
    {
        {1,0,1,1,1},
        {1,0,1,0,0},
        {0,1,0,1,1},
        {1,1,1,1,1},
        {0,0,0,0,1}  
    };
    
 int i , j , count=0 ,  max=0 , floornum=0,k;
  
for(i=0 ; i<5; i++)
{
      count=0;
     
      for(j=0;j<5;j++)
       {
        cout<<arr[i][j]<<" ";
        if(arr[i][j]==1)
        count++;
       }
                                
       if(count>max)
       {
         floornum=i+1;
         max=count;
       }                
   cout<<endl;                    
}
// if(floornum>=max)
// {           
//   for(k=0;k<5;k++)
//   {
//    cout<<arr[i][j]<<" ";
//   }
// }

     cout<<"\nmaximum count in a single row =" <<max<<endl;
      cout<<"floor num is ="<<floornum;
            
  return 0;
    
}

