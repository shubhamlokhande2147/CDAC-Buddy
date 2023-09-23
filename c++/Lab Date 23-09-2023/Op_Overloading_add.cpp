#include<iostream>
using namespace std;

class Complex
{
	int real,img;
	 public:
	 	Complex()
	 	{
	 		
		}
	 	Complex(int real,int img) //parameterised constructor
	 	{
	 	  this->real=real;
		  this->img=img;	
		}
		
		void Display()//display fun
		{ 
		    cout<<"Complex no. : ";
		    if(img>=0)
		    {
			 cout<<real<<"+"<<img<<"i"<<endl;
            }
            else
            {
            	cout<<real<<img<<"i"<<endl;
			}
		}
		Complex operator+(int);
		//friend Complex operator+(int n,Complex& temp);
};
Complex Complex :: operator+(int n)//op ovrloding diff adding int
		{
			Complex c1;
			c1.real = real + n;
			c1.img = this->img + n; 
			return c1;
		}
//Complex operator+(int n,Complex& temp)
//{
//     		Complex c1;
//			c1.real =temp.real + n;
//			c1.img = temp.img + n; 
//			return c1;
//}

int main()
{

	Complex c2(2,3);
	Complex c3 = c2+5;//c3.operator+5
	c3.Display();

//if we are add no. + obj, then use friend fun	
//	Complex c2(2,3);
//	Complex c3 = 5+c2;//c3.operator+5
//	c3.Display();
	
	
	
	return 0;
}
