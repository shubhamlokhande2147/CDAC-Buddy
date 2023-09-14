#include<iostream>
using namespace std;
class test{
	int a,b;
	public:
		void show(int a,int b){
			this->a=a;
			(*this).b=b;	
		}
		void display(){
			cout<<"a "<<a<<endl<<"b "<<b;
		}
	};
	
	int main(){
		test t;
		t.show(10,20);
		t.display();
	}
