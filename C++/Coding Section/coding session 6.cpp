#include<iostream>
using namespace std;

int main()
{ 
    int n,i,j,k;
    cout<<"enter size of array : "<<endl;
    cin>>n;

    char arr[n],temp[n];
    for(i=0;i<n;i++)
    {
        cin>>arr[i];
    }

    for(j=0;j<n;j++)
    {
        if(arr[i] <= 9)
        {
            temp[j] = arr[i];
        }
    }

    for(k=0;k<n;k++)
    {
        cout<<temp[k];
    }


    return 0;
}