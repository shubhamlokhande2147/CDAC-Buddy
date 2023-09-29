
#include<iostream>
using namespace std;

class Default
{
	int no;
	char ch;
	     public:
			 Default(int no=5,char ch='*')
			 {
			 	this->no=no;
			 	this->ch=ch;
			 }
			 
			 void show()
			 {   cout<<"\n";
			 	for(int i=1;i<=no;i++)
			 	 {
			 	    cout<<ch;	
				 }
			 }
};

int main()
{
	Default d1;
	d1.show();
	
	Default d2('@');
	d2.show();	
//	
//	Default d3(15);
//	d3.show();	
//	
//	Default d4('&');
//	d4.show();
//	
	return 0;
}
