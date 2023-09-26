#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
    int size=8;
    //cin>>size;
    int s,e;
    int arr[size]={15,-2,2,-8,1,7,10,23};
    int maxLen = INT_MIN;
    for(int i=0;i<size;i++)
    {
        int sum=0;
        for(int j=i;j<size;j++)
        {
            sum+=arr[j];
            if(sum==0){
                if(maxLen<j-i+1)
                {
                    s=i;
                    e=j;
                    maxLen =max(maxLen,j-i+1);
                }
            }
        }
    }
    cout<<s<<" "<<e<<endl;
    return 0;
}
