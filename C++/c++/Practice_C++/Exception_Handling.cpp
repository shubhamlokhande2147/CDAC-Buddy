<<<<<<< HEAD
#include<iostream>
using namespace std;

int main()
{
	int age;
	cout<<"\nEnter the age : ";
	cin>>age;
  
   try
   {
 	
	if(age>18)
	{
		cout<<"\nPermited granted";
	}
	else
	{
		throw(age);
	}
   }
   catch(int num)
   {
   	 cout<<"\nPermited Denied";
   	 cout<<"\nAge is : "<<age;
   }
   
	return 0;
}
=======
#include<iostream>
using namespace std;

int main()
{
	int age;
	cout<<"\nEnter the age : ";
	cin>>age;
  
   try
   {
 	
	if(age>18)
	{
		cout<<"\nPermited granted";
	}
	else
	{
		throw(age);
	}
   }
   catch(int num)
   {
   	 cout<<"\nPermited Denied";
   	 cout<<"\nAge is : "<<age;
   }
   
	return 0;
}
>>>>>>> 780e2f0eead5a6b2acfd4a998fcfbbe958e5b35a
