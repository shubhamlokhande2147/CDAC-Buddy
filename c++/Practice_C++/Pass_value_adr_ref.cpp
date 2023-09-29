#include<iostream>
using namespace std;
/*
class A
{
   int n1,n2;
   int temp;

	public:
		void get()
		{
		   cout<<"\nEnter number 1 : ";
		   cin>>n1;
		   
		   cout<<"\n\nEnter number 2 : ";
		   cin>>n2; 	
		}
		
	     void swap()
		  {
            temp=n1;
			n1=n2;
			n2=temp;    		  	
		  }	
		 
		 void display()
		{
		   cout<<"\nn1 : "<<n1<<" n2 : "<<n2; 	
		} 
};

int main()
{
	A a1;
	a1.get();
	cout<<"\nBefore swap: ";
	a1.display();
	
	cout<<"\nAfter swap: ";
	a1.swap();
	a1.display();

    return 0;
}
*/
void swap1(int a,int b);
void swap2(int *a,int *b);
void swap3(int &a,int &b);
 int main()
 {
 	int n1,n2;
           cout<<"\nEnter number 1 : ";
		   cin>>n1;
		   
		   cout<<"\nEnter number 2 : ";
		   cin>>n2; 	
		
	cout<<"\nBefore swap: ";
 	cout<<"\nn1 : "<<n1<<" n2 : "<<n2; 	
 	
    swap3(n1,n2);//call pass by ref
	swap1(n1,n2); //call pass by value

    swap2(&n1,&n2); //call pass by adr

 	return 0;
 }
 
 void swap1(int a,int b)  //pass by value
 { 
    cout<<"\n********Pass by value************";
 	int temp;
 	temp=a;
 	a=b;
 	b=temp;
	cout<<"\n\nAfter swap: ";
 	cout<<"\nn1 : "<<a<<" n2 : "<<b;
 }
 
 
 void swap2(int *a,int *b)  //pass by adr
 {
 	cout<<"\n********Pass by adr************";
 	int temp;
 	temp=*a;
 	*a=*b;
 	*b=temp;
	cout<<"\n\nAfter swap: ";
 	cout<<"\nn1 : "<<*a<<" n2 : "<<*b;
 }
 
 
 void swap3(int &a,int &b)  //pass by ref
 {
 	cout<<"\n********Pass by ref************";
 	int temp;
 	temp=a;
 	a=b;
 	b=temp;
	cout<<"\n\nAfter swap: ";
 	cout<<"\nn1 : "<<a<<" n2 : "<<b;
 }
