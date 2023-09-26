// C++ Program to overload == operator
#include<iostream>
#include<string>
using namespace std;

class Car{
private:
	string name;
	int cost;
	public:
		Car(string n, int c){
			name=n;
			cost=c;
		}
		bool operator == (const Car &c){
			if (name == c.name && cost == c.cost)
				return true;
			return false;
		}
};
int main(){
	Car car1 ("Santro",500000);
	Car car2 ("Safari",1000000);
	if (car1 == car2)
		cout<<"Equivalent"<<endl;
	else
		cout<<"Not Equivalent"<<endl;
}

