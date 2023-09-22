#include<iostream>
using namespace std;
int main()
{
	int a,b;
	int arr[5] = {1,2,3,4,5};
	cout<<"Enter the value of a and b: : ";
	cin>>a>>b;
	try{
		int i=0;
		if(b!=0)
		{
			cout<<"a/b = "<<a/b<<endl;
		}
		else
		{
			throw "0";
		}
			while(1)
			{
				cout<<arr[i]<<" , ";
				i++;
				if(i==5)
				{
					throw 5;
				}
			}
		
		
	}
	catch(const char* x)
	{
		cout<<"Error: Division by Zero!";
	}
	catch(int y)
	{
		cout<<"\nArray index of out bond";
	}
	
	return 0;
}
