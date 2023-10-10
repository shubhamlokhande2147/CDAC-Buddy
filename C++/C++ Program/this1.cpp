#include<iostream>
using namespace std;
class test{
	int a,b;
	public:
		void show(){
		a=10;
		b=12;
		cout<<"\nobject address "<<this<<endl;
		cout<<"\na : "<<this->a<<endl;
		cout<<"\nb : "<<this->b<<endl;
}
};
int main()
{
	test t;
	cout<<"\nobject address  :"<<&t;
	t.show();
	return 0;
}
