#include <iostream>
using namespace std;

int main()
{ 
    int ptr1[5];  //int array declaration
    int *ptr2[5]; //int array of pointer declaration
	
	cout<<"Enter five no. : ";
	
	for(int i=0;i<=4;i++)
	{
		cin>>ptr1[i];  //input five no.
	}
	
	for(int i=0;i<=4;i++)
	{
		ptr2[i]=&ptr1[i]; //copy address ptr1 into ptr2
	}
	
	cout<<"The Values are : "<<endl;
	
	for(int i=0;i<=4;i++)
	{
		cout<<"\n"<<ptr2[i];  //print address
        cout<<"\n"<<*ptr2[i];  //print value
	}
	
	return 0;
}
