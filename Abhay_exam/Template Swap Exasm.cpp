#include<iostream>
using namespace std;
#include<string.h>
template<class X> //define template of a type can take data of same type
swap1(X &a,X &b){ //define function in template
	X temp=a;
	a=b;       //function working for same data types
	b=temp;
}
int main(){
	int p; //declare new variables in main
	int q;
	cout<<"Integer Swapping"<<endl;
	cout<<"Enter p and q"<<endl;
	cin>>p>>q;
	cout<<"Value Before Swapping of p and q is: "<<p<<"&"<<q<<endl;
	swap(p,q); //call function integer type
	cout<<"Value After Swapping of p and q is: "<<p<<"&"<<q<<endl;
	cout<<endl;	
	cout<<endl;	
	cout<<"Character Swapping"<<endl;	
	char x; //dclare new for character
	char y;
	cout<<"Enter p and q"<<endl;
	cin>>x>>y;
	cout<<"Value Before Swapping of p and q is: "<<x<<" & "<<y<<endl;	
	swap(x,y); //call function char type
	cout<<"Value After Swapping of p and q is: "<<x<<" & "<<y<<endl;	
	cout<<endl;	
	cout<<endl;	
}

