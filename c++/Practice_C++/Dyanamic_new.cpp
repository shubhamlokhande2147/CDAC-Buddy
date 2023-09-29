#include<iostream>
using namespace std;

int main()
{
	int m,n,sum=0;
	float avg;
	
	cout<<"\nEnter the no. of sub : ";
	cin>>m;
	cout<<"\nEnter the no. of char : ";
	cin>>n;
	
	
	int* marks = new int[m];  //create dyanamic memory to marks
	char* nm  = new char[n+1];//create dyanamic memory to name

    cout<<"\nEnter marks : ";
    for(int i=0;i<m;i++)
	{
		cin>>marks[i];
		sum=sum+marks[i];
	}	
	cout<<"\nTotal sum : "<<sum;
	avg=sum/m;
    
	cout<<"\nEnter name : ";
    cin>>nm;
  
    cout<<"\nName : "<<nm<<"     Avg : "<<avg;;
	
	delete[] marks;
	delete[] nm;
	return 0;
}
