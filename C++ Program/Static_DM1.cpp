#include<iostream>
using namespace std;

class Complex
{
   int real,img;
   static int count;   //static data member
   
   //public : static int count;   //public static data member
   
   public:
        Complex()
		{
		   cout<<"Default is invoked"<<endl;
		   real=5;
		   img=5;
		   count++;	
		}	
		Complex(int real,int img)
		{
			cout<<"Parameterized is invoked"<<endl;
			this->real=real;
			this->img=img;
			count++;
		}
		static int getCount()  //static fun invoke static data member
		{
			return count;
		}
};

     int Complex::count=0;  //memory allocation takes place
     
     int main()
     {
     	Complex c1;
     	Complex c2(10,20);
     	
     	cout<<"no. of object is  :"<<Complex::getCount()<<endl;
     	cout<<"Size of object is : "<<sizeof(c1);
        //cout<<"Size  : "<<Complex::count;  //only if public static data member	     
	 }

