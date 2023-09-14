#include<iostream>
using namespace std;
void add(int a,int b);
void add(int a,int b,int c);
void add(float a,double c,int b);
int main()
{
	add(10,2);
	add(10,12,45);
	add(23.0f,45.0,34);
}
void add(int a,int b){
	cout<<"\nsum "<<(a+b);
}
void add(int a,int b,int c){
	cout<<"\nsum "<<(a+b+c);
}
void add(float a,double c,int b){
	cout<<"\nsum "<<(a+c+b);
}
