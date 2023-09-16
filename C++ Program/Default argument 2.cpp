#include <iostream>
using namespace std;
void display(char='*',int=3);
int main(){
	cout<<"no arguments passed"<<endl;
	display();
	cout<<"one arguments passed"<<endl;
	display('@');
	cout<<"two arguments passed"<<endl;
	display('!',7);
}
void display(char c,int a){
	for(int i=1;i<=a;i++){
		cout<<c;
	}
	cout<<endl;
}
