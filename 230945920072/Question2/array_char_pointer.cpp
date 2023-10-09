#include<iostream>
using namespace std;
#include<string.h>
//array char pointers
//here 5 char pointer pointing to different 5 strings stored in sdm array pointer

int main()
{
	char* sdm[5]={"software","dev","life","cycle","management"};
	
	for( int i=0; i<5;i++)
	{
	int x=strlen(*(sdm+i));
		
		for(int j=0;j<=x;j++)
		{
			cout<<*(*(sdm+i)+j);
			
		}
		cout<<endl;
	}
	return 0;
}
