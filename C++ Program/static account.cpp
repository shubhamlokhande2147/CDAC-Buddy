#include<iostream>
using namespace std;

class Account
{
   char name[20];
   int age;
   static float interest;   //static data member
      
   public:
      
		void getdata()
		{
			cout<<"Enter the name: "<<endl;
			cin>>name;
			cout<<"enter your age: "<<endl;
			cin>>age;
		}
		void display(){
			cout<<"name is "<<name<<"age is "<<age<<"interest is "<<interest;
		}
};

     float Account::interest=6.5f;  //memory allocation takes place
     
     int main()
     {
     	Account c2;
     	c2.getdata();
     	c2.display();
     	return 0;
	     
	 }

