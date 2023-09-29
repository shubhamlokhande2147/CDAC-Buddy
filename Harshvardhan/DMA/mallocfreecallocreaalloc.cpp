/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include<stdio.h>
#include <cstdlib>
using namespace std;

int main()
{
    //cout<<"Hello World";
 
    int n;
    cin>>n;
    cout<<"Malloc"<<endl;
    int* ptr = (int*)malloc(n*sizeof(int));
    for(int i=0;i<n;i++)
    {
        ptr[i]=i;
    }
    for(int i=0;i<n;i++)
    {
        cout<<ptr[i]<<",";
    }
    cout<<"\ncalloc: "<<endl;
    double* ptr1 = (double*)calloc(n,sizeof(double));
    for(int i=0;i<n;i++)
    {
        ptr1[i]=i;
    }
    for(int i=0;i<n;i++)
    {
        cout<<ptr1[i]<<",";
    }
    cout<<"Enter new memory: ";
    int m;
    cin>>m;
    ptr =(int*)realloc(ptr,m*sizeof(int)); 
        for(int i=0;i<m;i++)
    {
        ptr[i]=i;
    }
    for(int i=0;i<m;i++)
    {
        cout<<ptr[i]<<",";
    }
    
    free(ptr);
    free(ptr1);
    return 0;
}

