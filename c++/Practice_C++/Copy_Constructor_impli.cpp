//implicitly compiler called copy constructor

#include<iostream>
using namespace std;

class Date
{
   int dd,mm,yy;
       public:
	        Date(){ }
			Date(int d,int m,int y)
			{
			   dd=d;
			   mm=m;
			   yy=y;	
			}	
           void show();
};

void Date::show()
{
	cout<<"Date :  "<<dd<<"/"<<mm<<"/"<<yy<<endl;
}

int main()
{
	Date d1(17,04,2000);
	d1.show();
	
	Date d2(d1);
	d2.show();
	
	
	return 0;
}
