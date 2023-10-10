#include<iostream>
using namespace std;

template<class T1,class T2>
class A
{
	public:
		T1 n1=23;
		T2 n2=45.44;
		void add()
		{
			cout<<"Addition : "<<n1+n2;
		}
};

int main()
{
	A<int,float> obj;
	obj.add();
}
