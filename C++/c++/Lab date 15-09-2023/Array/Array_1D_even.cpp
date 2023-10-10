#include<iostream>
using namespace std;

int main()
{ 
    int a1[5],a2[5],a3[5],i;
  
    cout<<"Enter the no. : "<<endl;
    for(i=0;i<=4;i++)
    {
        cin>>a1[i];
    }


   for(i=0;i<=4;i++)
    {
      if(a1[i]%2==0)
      {
        a2[i]=a1[i];
      }  
      else
      {
        a3[i]=a1[i];
      }   
    }

    for(i=0;i<=4;i++)
    {
        cout<<"Even no. : "<<a2[i]<<" "<<endl;
    }
    cout<<"\n";
    for(i=0;i<=4;i++)
    {
        cout<<"Odd no. : "<<a3[i]<<" "<<endl;
    }
    
    return 0;
}