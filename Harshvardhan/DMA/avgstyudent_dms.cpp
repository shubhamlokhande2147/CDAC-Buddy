#include<iostream>
using namespace std;
int main()
{	
	int m,n;
	cout<<"Enter no of subject";
	cin>>m;
	cout<<"\nEnter No of character: ";
	cin>>n;
	int *mark_m = new int[m];
	char *student_n=new char[n];
	int sum=0;
	cout<<"Enter no of marks"<<endl;
	for(int i =0;i<m;i++)	
	{
		cin>>mark_m[i];
		sum+=mark_m[i];
	}
	cout<<"enter student name: "<<endl;
	cin>>student_n;
	cout<<"Student is "<<student_n;
	double avg = (double)sum/m;
	cout<<"avg is "<<avg;
	return 0;
	
}
