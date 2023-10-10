#include<iostream>
using namespace std;

int main()
{ 
    int a[5],i;
  
    cout<<"Enter the no. : "<<endl;
    for(i=0;i<=4;i++)
    {
        cin>>a[i];
    }

    for(i=0;i<=4;i++)
    {
        cout<<a[i]<<" ";
    }
    
    return 0;
}