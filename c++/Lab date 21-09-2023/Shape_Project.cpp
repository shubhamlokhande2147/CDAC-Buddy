#include<iostream>
#define PI 3.142
using namespace std;

class Shape
{
	double thickness;
	public:

	void get()
	{
		cout<<"\nEnter Thickness: ";
		cin>>thickness;
	}
	
	void display()
	{
		cout<<"\nThickness: "<<thickness<<endl;
			
	}	
};
class Rectangle:public Shape
{
	double length, breadth;
	public:
	/*	Rectangle(double length,double breadth)
		{ 
			this->length = length;
			this->breadth = breadth;
		}
   */
		void get()
		{
			Shape::get();
			cout<<"Enter Length: ";
			cin>>length;
			cout<<"Enter Breadth : ";
			cin>>breadth;
		}
		void display()
		{
			Shape::display();
			cout<<"Length : "<<length<<"\n Breadth: "<<breadth<<endl;
		}
		void area()
		{
			cout<<"Area of Rectangle : "<<length*breadth<<endl;
		}
		
};

class Square:public Shape
{
	double side;
	public:
	/*	Rectangle(double length,double breadth)
		{ 
			this->length = length;
			this->breadth = breadth;
		}
   */
		void get()
		{
			Shape::get();
			cout<<"Enter Side: ";
			cin>>side;
		}
		void display()
		{
			Shape::display();
			cout<<"Side : "<<side<<endl;
		}
		void area()
		{
			cout<<"Area of Square : "<<side*side<<endl;
		}
		
};
class Point
{
	public:
		double x,y;
		void get()
		{
			cout<<"\nEnter X Co-ordinate: ";
			cin>>x;
			cout<<"\nEnter Y Co-Ordinate : ";
			cin>>y;
		}
		double temp()
		{
			return x*y;
		}
		void display()
		{
			cout<<"\nPoint(x,y) = P("<<x<<","<<y<<")";
		}
};

class Line:public Point,public Shape
{
	public:
		void getLine()
		{
			cout<<"\nEnter Starting Point:"<<endl;
			Point::get();
			Point::display();
		
			cout<<"\nEnter Ending Point:"<<endl;
			Point::get();
            Point::display();
			//Shape::get();
		}
		//void display()
		//{
		//	Point::display();
		    //Shape::display();
		//}
};

class Elipse: public Point, public Shape
{
	public:
		void get()
		{
			Shape::get();
			Point::get();	
		}	
		void display()
		{	    
			Shape::display();
			Point::display();
			
		}
		void area()
		{
			cout<<"\nArea of Elipse :"<<Point::temp()*PI;
		}
};


int main()
{
	/*

	switch:
		case a=1:
		*/
		
		cout<<"-------------------------SDM MINI PROJECT----------------------"<<endl<<endl;
		
		
		
		int UserInput;
	    
		do {
		cout<<"\n1.Rectangle\n2.Square\n3.Line\n4.Elipse\n0.Exit"<<endl;
		cout<<"\nEnter user input : ";
       	cin>>UserInput;
		   
		   switch(UserInput)
		   {
		   	 case 1 : 
					   Rectangle R1;
					   R1.get();
					   R1.display();
					   R1.area();
					   break;
         
		     case 2 :
			           Square s1;
					   s1.get();
					   s1.display();
					   s1.area();
					   break;
					    	
			 case 3:
			 			Line l1;
						l1.getLine();
						//l1.display();
			            break;
			 
			 case 4:
			 			 Elipse E1;
						 E1.get();
						 E1.display();
						 E1.area();
	                     break;	     	
	 		
		   }	
	
   }while(UserInput!=0);
	
	return 0;		
}
