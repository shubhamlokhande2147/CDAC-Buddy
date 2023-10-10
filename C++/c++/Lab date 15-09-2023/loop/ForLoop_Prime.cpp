#include<iostream>
using namespace std;
int main()
{
	int num,i;
	int flag=0;
	for(i=2;i<=num/2;i++)
	{
	if(num%i==0)
	{
        flag=1;
    	break;
	}
			
	}
	if(flag==0)
	{
		cout<<num<<" is prime number"<<endl;
	}
	else
	{
		cout<<num<<" is not prime number"<<endl;
	}

	return 0;
}


