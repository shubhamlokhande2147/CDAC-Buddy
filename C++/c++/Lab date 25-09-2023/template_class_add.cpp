#include<iostream>
using namespace std;

template<class T>
class A
{
	public:
		T n1=23;
		T n2=45;
		void add()
		{
			cout<<"Addition : "<<n1+n2;
		}
};

int main()
{
	A<int> obj;
	obj.add();
}
