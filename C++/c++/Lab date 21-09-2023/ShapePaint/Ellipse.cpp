#include "Ellipse.h"
#include <iostream>
using namespace std;
Ellipse::Ellipse()
{
}
Ellipse::Ellipse(Point p1(int xx,int yy))
{
	this->p=p1;
	this->xx=xx;
	this->yy=yy;
}
void Ellipse :: area()
{
	cout<<"Area of Ellipse: "<<p1.xx*p1.yy*3.142<<endl;
}
