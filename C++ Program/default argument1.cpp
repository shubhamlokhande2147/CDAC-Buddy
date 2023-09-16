#include <iostream>
using namespace std;
void add(int=1,int=2,int=3,int=4);
int main(){
	add();
	add(10);
	add(10,20,30);
	add(10,20,30,40);
}
void add(int a,int b,int c,int d){
	cout<<a+b+c+d<<endl;
}
