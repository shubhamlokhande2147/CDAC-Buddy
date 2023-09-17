#include<iostream>
using namespace std;
int main()
{ 
    cout<<"\nPattern 1 :"<<endl;
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            cout<<j;
        }
        cout<<"\n";
    }
 cout<<"\n---------------------------------------------------------------\n";

   cout<<"\nPattern 2 :"<<endl;
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            cout<<j;
        }
        cout<<"\n";
    }
 cout<<"\n---------------------------------------------------------------\n";
 
 cout<<"\nPattern 3 :"<<endl;
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            cout<<i;
        }
        cout<<"\n";
    }
 cout<<"\n---------------------------------------------------------------\n";

 cout<<"\nPattern 4 :"<<endl;
 int num =1;
    for(int i=1;i<5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            cout<<num<<" ";       
            num++;
        }
        cout<<"\n";
    }
 cout<<"\n---------------------------------------------------------------\n";

 cout<<"\nPattern 5 :"<<endl;
 char ch='A';
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            cout<<ch<<" ";        
        }           
        ch++;
        cout<<"\n";
    }
 cout<<"\n---------------------------------------------------------------\n";

 cout<<"\nPattern 6 :"<<endl;
 char ch1='A';
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            cout<<ch1<<" "; 
            ch1++;       
        }           
        cout<<"\n";
    }
 cout<<"\n---------------------------------------------------------------\n";

 cout<<"\nPattern 6 :"<<endl;
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            if(j%2==1)
            {
              cout<<"1";
            } 
            else
            {
                cout<<"0";
            }
        }           
        cout<<"\n";
    }
 cout<<"\n---------------------------------------------------------------\n";

 cout<<"\nPattern 6 :"<<endl;
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            if(j%2==1)
            {
              cout<<"0";
            } 
            else
            {
                cout<<"1";
            }
        }           
        cout<<"\n";
    }
 cout<<"\n---------------------------------------------------------------\n";

 return 0;
}