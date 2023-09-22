#ifndef ELLIPSE_H
#define ELLIPSE_H

#include "Point.h"

class Ellipse : public Point
{
	
	public:
		Ellipse();
		Ellipse(Point p1(int xx,int yy));
		void area();
	
			
		
	protected:
		Point p;
};

#endif
