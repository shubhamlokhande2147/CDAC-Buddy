#include<iostream>
using namespace std;
int funlocal();
int funstatic();


int main()
{
	cout<<"------------------Local-------------"<<endl;
	cout<<"final value "<<funlocal()<<endl;
	cout<<"final value "<<funlocal()<<endl;
	cout<<"final value "<<funlocal()<<endl;
	cout<<"------------------Static-------------"<<endl;
	cout<<"final value "<<funstatic()<<endl;
	cout<<"final value "<<funstatic()<<endl;
	cout<<"final value "<<funstatic()<<endl;
}
int funlocal()
{
	int x=0;
	static int count=0;
    cout << "\nI am called " << ++count << " times!\n";

	cout<<"Initial value of x : "<<x<<"\t";
	x++;
	return x;
}

int funstatic()
{
	static int x=0;
	cout<<"Initial value of x : "<<x<<"\t";
	x++;
	return x;
}
