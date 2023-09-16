#include<iostream>
using namespace std;
int funlocal();
int funstatic();
static int count=0;
int area();
int main()
{
	cout<<"------------------Local-------------"<<endl;
	cout<<"  final value "<<funlocal()<<endl;
	cout<<"  final value "<<funlocal()<<endl;
	cout<<"  final value "<<funlocal()<<endl;
	cout<<"------------------Static-------------"<<endl;
	cout<<"  final value "<<funstatic()<<endl;
	cout<<"  final value "<<funstatic()<<endl;
	cout<<"  final value "<<funstatic()<<endl;

 	cout<<"Function call no of times :"<<count<<endl;
 	
 	cout<<"Constant Variable"<<endl;
 	cout<<"area of Circle "<<area()<<endl;
}
int funlocal()
{
	int x=0;
	cout<<"Initial value of x: "<<x;
	x++;
	
	return x,count++;
}

int funstatic()
{
	static int x=0;
	cout<<"Initial value of x: "<<x;
	x++;
	return x;
}
int area(){
	const float pi=3.142f;//constant
	double r=2;
	double area1;
	area1=pi*r*r;
	
	return area1;
}
