#include<iostream>
using namespace std;

int main()
{
	int m,n;
	int i,sum=0;
	
	float avg;
	
	cout<<"\nenter no. of subject : ";
	cin>>m;
	

	int* marks_m = new int[m];
	
	for(i=0;i<m;i++)
	{
		cin>>marks_m[i];
		sum=sum+marks_m[i];
	}
	avg = (float) sum/m;
	
	char* name_n = new char[n+1];

	cout<<"\nenter no. of character : ";
	cin>>n;
	
	cout<<"\nEnter name of student : ";
	cin>>name_n;
	
	cout<<"Name : "<<name_n;
	cout<<" Average : "<<avg;
	
	delete[] marks_m;
    delete[] name_n;
	return 0;	
}
