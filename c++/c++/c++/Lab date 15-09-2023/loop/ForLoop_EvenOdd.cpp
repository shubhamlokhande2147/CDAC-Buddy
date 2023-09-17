#include<iostream>
using namespace std;

int main()
{
     int esum=0,osum=0;
     
     for(int i=1;i<=20;i++)
     {
     	if(i%2==0)
     	{
     		esum+=i;
		}
		else
		{
			osum+=i;
		}	 
	 } 
	 cout<<"Even no sum between 1 to 20 : "<<esum<<endl;
	 cout<<"Odd no sum between 1 to 20 : "<<osum<<endl;
	 
	return 0;
}
