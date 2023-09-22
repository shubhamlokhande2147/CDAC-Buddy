#include <iostream>
#include "Point.h"
#include "Line.h"
#include "Rectangle.h"
#include "Square.h"
#include "Ellipse.h"


using namespace std;

int main(int argc, char** argv) {
	
	cout<<"welcome to Paintbrush";
	Point pt1;
	pt1.Display();
	
	Point startPoint(23,43);
	Point endPoint(55,55);
	int thickness=3;
	Line l1(startPoint, endPoint, thickness);

	
	
	Point startPoint2(12,10);
	Point endPoint2(56,155);
	int thickness2=4;
	Line l2(startPoint2, endPoint2, thickness2);
	
	l1.Display();
	l2.Display();
	
	Rectangle R;
	R.set(10,12);
	R.area();
	
	Square S;
	S.set(5);
	S.area();
	Point P3;
	Ellipse E1;
	E1(5,8);
	E1.area();
	
	return 0;
}

