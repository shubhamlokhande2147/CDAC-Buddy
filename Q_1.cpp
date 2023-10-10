#include<iostream>
using namespace std;

class Complex
{
	int real,img;
	
	public:
		 Complex()
		 {
		 	real=img=1;
		 }
		 
		 Complex(int real,int img)
		 {
		 	this->real = real;
		 	this->img = img;
		 }
		 
		  void display()
		  {
		  	if(img>0)
		  	{
		       cout<<"\nComplex No. : "<<real<<"+"<<img<<"i";
			}
			else
			{
			   cout<<"\nComplex No. : "<<real<<img<<"i";
			}
		  }
		  
		  Complex operator=(Complex & c)   //assignment op
		  { 
		    cout<<"\n\nAssignment op: ";
		  	//Complex temp;
		  	real=c.real;
		  	img=c.img;
		  	return c;
		  }
	
	
	    Complex operator+(int n)//op ovrloding diff adding int
		{
			cout<<"\n\nAdd integer op: ";
			Complex c1;
			c1.real = this->real + n;
			c1.img = this->img + n; 
			return c1;
		}
		  
	   Complex operator-(int n)//op ovrloding diff adding int
		{
			cout<<"\n\nSub integer op: ";
			Complex c2;
			c2.real = this->real - n;
			c2.img = this->img - n; 
			return c2;
		}
		
		Complex operator-(Complex & c)
         {	
		    cout<<"\n\nSub : ";
			Complex temp;
			temp.real=this->real - c.real;
			temp.img=this->img -c.img;
			return temp;
		}
		
        Complex operator++()//pre
        { 
  		  cout<<"\n\nIncrement : ";
          //++this->real;//
	      this->real=this->real + 1;
	      //++this->img;
          this->img=this->img + 1;
	      return (*this);
        }
              
	 
		  Complex operator+(Complex & c)   //c1+c2 op
		  {
		  	cout<<"\n\nAdd two obj: ";	
		  	Complex temp;
		  	temp.real=this->real+c.real;
		  	temp.img=this->img+c.img;
		  	return temp;
		  }
		  		  
};

int main()
{
	Complex c1(2,3);
	c1.display();
	
	
	Complex c2(1,2);
	c2.display();
	
	
	c1=c2;  //assignment op
	c1.display();
	
	Complex c3 = c1+5;//c3.operator+5
    c3.display();
	
	Complex c4 = c1-3;//c3.operator-3
    c4.display();
		
	Complex c5=c2-c1;//c1.operator-(c2)
	c5.display();

    Complex c7=++c1;//c2=c1.operator++()
	c7.display();
	
	Complex c8 = c1 +c2; //add two obj
	c8.display();
	return 0;
}
