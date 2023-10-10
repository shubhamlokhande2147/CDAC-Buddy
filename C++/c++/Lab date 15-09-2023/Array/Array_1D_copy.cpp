#include<iostream>
using namespace std;

int main()
{ 
    int a1[5],a2[5],i;
  
    cout<<"Enter the no. : "<<endl;
    for(i=0;i<=4;i++)
    {
        cin>>a1[i];
    }

   for(i=0;i<=4;i++)
    {
        a2[i]=a1[i];
    }

    for(i=0;i<=4;i++)
    {
        cout<<a2[i]<<" ";
    }
    
    return 0;
}