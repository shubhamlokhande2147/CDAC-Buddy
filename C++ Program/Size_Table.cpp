#include<iostream>
using namespace std;
void line();

int main()
{
	
	cout<<"---------Format Specifiers Table-------------"<<endl;
	
	line();
	cout<<"\nData Type"<<"         "<<"Size"<<endl;
	line();
	cout<<"\nInteger"<<"           "<<"4"<<endl;
	line();
	cout<<"\nFloat"<<"             "<<"4";
}
void line()
{ 
   int i=0;
	while(i<=30)
	{
		cout<<"-";
		i++;
	}
}
