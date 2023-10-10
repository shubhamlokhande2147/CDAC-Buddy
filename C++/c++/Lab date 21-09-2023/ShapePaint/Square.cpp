#include<iostream>
using namespace std;
#include "Square.h"

Square::Square()
{
	this->side=0;	
}
void Square::set(int sd)
{
	this->side=sd;
}
void Square::area()
{
	cout<<"\nArea of Square : "<<side*side;
}

