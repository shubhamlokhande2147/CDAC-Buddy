#include<iostream>
using namespace std;

int main()
{ 
    int temp[2][7],i,j;
  
    for(i=0;i<2;i++)
    {
        for(j=0;j<=6;j++)
        {
          cout<<"City : "<<i+1<<" Day : "<<j+1<<endl;
          cin>>temp[i][j];
        }
    }
       
  for(i=0;i<2;i++)
    {
        for(j=0;j<=6;j++)
        {
          cout<<"City : "<<i+1<< "Day : "<<j+1<<" = "<<temp[i][j]<<endl;
        }
        cout<<"\n";
    }
    

    return 0;
}