#include<iostream>
using namespace std;

int main()
{
        int a[5] = {1,2,3,4,5};
        int *b = &a[4];
        int *c = a+4;

        if(b == c)  //pointer comparison
        {
            cout<<"\nBoth pointer pointing to same location 1";
        }

        if(a == b)  
        {
            cout<<"\nBoth pointer pointing to same location 2";
        }
        
        if(*b == *c)  
        {
            cout<<"\nBoth pointer pointing to same value";
        }
        if(*b == *a+4)  
        {
            cout<<"\nBoth are Equals";
        }


  return 0;
}