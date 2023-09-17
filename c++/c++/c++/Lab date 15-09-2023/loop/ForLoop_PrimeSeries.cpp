#include<iostream>
#include<math.h>
using namespace std;

int main()
{

   for(int i=2;i<=50;i++)
    {	
	 	int count=0;
	 	//cout<<i;
    	for(int j=2;j<sqrt(i);j++)
     	{
     		//cout<<j;
			if(i%j==0)
			{
		  		count=1;
			}
     	}

		if(count==0)
    	{
	    	cout<<i<<", ";
	    }
  	}
	return 0;
}


