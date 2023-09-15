#include <iostream>
using namespace std;
class date1{
	int dd,mm,yy;
	public:
		date1(int=5,int=6,int=2000);
			void show(){
				cout<<"\n"<<dd<<" "<<mm<<" "<<yy;
			}
};
date1::date1(int a,int b,int c){
	dd=a;
	mm=b;
	yy=c;
}
int main(){
	date1 d(2,3,2001);
	d.show();
	date1 d2;
	d2.show();
	return 0;
	}
