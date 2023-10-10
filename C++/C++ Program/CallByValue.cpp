#include <iostream>
using namespace std;
void swap(int p,int q);

int main()
{ 
   int a,b;
   cout<<"Enter the value of a and b: ";
   cin>>a>>b;
   cout<<"Before Swapping "<<a<<" "<<b<<endl;
   swap(a,b);
   cout<<"After Swapping "<<a<<" "<<b<<endl;
   return 0;
}
void swap(int p,int q){
	int temp;
	temp=p;
	p=q;
	q=temp;
	cout<<"After Swapping "<<p<<" "<<q<<endl;
}
   

