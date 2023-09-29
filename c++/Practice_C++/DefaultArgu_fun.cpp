#include<iostream>
using namespace std;
	
void display(int=5,char='*'); //default argument


int main()
{
	int no;
	char ch;
	
	display(); //call default method
	display(10); //one argument pass
	display(5,'@');//two argument pass
	   
	return 0;
}

void display(int no,char ch)
{
	 cout<<"\n";
			 	for(int i=1;i<=no;++i)
			 	 {
			 	    cout<<ch;	
				 }
}
