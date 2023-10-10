#include<iostream>
using namespace std;

int main()
{
	int n;
	cout<<"\nenter the no. : "<<endl;
	cin>>n;
	
	switch(n)
	{
	           	case 1 : cout<<"You entered one"<<endl;
		         break;
		         case 2 : cout<<"You entered two"<<endl;
		         break;
		         case 3 : cout<<"You entered three"<<endl;
		         break;
		         case 4 : cout<<"You entered four"<<endl;
		         break;
		         case 5 : cout<<"You entered five"<<endl;
		         break;
		         default : cout<<"you entered "<<n<<endl;
		         break;
	}
	
	return 0;
}
