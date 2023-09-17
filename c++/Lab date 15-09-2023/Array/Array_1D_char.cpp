#include<iostream>
using namespace std;

int main()
{ 
    char a[7],i;
  
    cout<<"Enter the string : "<<endl;
    for(i=0;i<7;i++)
    {
        cin>>a[i];
    }

    for(i=0;i<=7;i++)
    {
        cout<<a[i];
    }
    a[i]='\0';

    return 0;
}