#include<iostream>
using namespace std;
#include<string.h>
template<class X> //template array 
 arrayaddition(X arr[],int &a){  //addition function in template
 	int sum=0;
 	arr[a];


	for(int i=0;i<a;i++){      //output for array
	 	sum=sum+arr[i];         //calculate sum
	}
	
	 cout<<"Sum is : "<<sum<<endl; //display sum
 	}
 	
 	
 int main(){
 	int p[100];    // new array created
 	int n;  
	cout<<"Enter number of elements: "<<endl;      
 	cin>>n;		  //taken size as input
 	cout<<"Enter array elements: "<<endl;  
	for(int i=0;i<n;i++){   //taken input
 		cin>>p[i];
	}
	
 	arrayaddition(p,n);  //passed to function and get the sum
 }
