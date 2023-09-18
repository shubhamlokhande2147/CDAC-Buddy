
#include<iostream>
#include <ctime>
using namespace std;
class date
{
	int dd, mm,yy;
	public:
		void show();
		date(int,int,int);
		date(date&); //create copy constructor by reference
};
date :: date(int d, int m, int y)
{
	dd=d;
	mm=m;
	yy=y;
}

date :: date(date &d_new)
{
   this->dd = d_new.dd;
   this->mm = d_new.mm;
   this->yy = 2023;	
}

void date :: show()
{
	cout<<"date is "<<dd<<"/"<<mm<<"/"<<yy<<endl;
}

int main()
{	time_t now = time(0);
	tm *ltm = localtime(&now);
	date d ((ltm->tm_mday),(1 + ltm->tm_mon),(1900 + ltm->tm_year)); // real time date fetched
	date d1(d);
	d.show();
	d1.show();
	return 0;
}
