#include<iostream>
using namespace std;
#include "Rectangle.h"

Rectangle::Rectangle()
{
	this->length=0;
	this->breadth=0;
}

void Rectangle::set(int len,int bre)
{
	this->length=len;
	this->breadth=bre;
}
void Rectangle::area()
{
	cout<<"\nArea of Rectangle : "<<length*breadth;
}


