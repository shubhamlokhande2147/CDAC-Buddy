#include<iostream>
using namespace std;
class complex   //class declare
{
	public:
		int real;
		int img;
	complex(){
		
	}
	complex(int real,int img){
		this->real=real;
		this->img=img;
	}
	void display(){
		if(img>0){
			cout<<real<<"+"<<img<<"i"<<endl;
		}
		else{
			cout<<real<<img<<"i"<<endl;
		}
	}
	
};
template<class complex> //template of complex type 
swap2(complex &a,complex &b){ //function in template
	int real;
	int img;
	    complex temp;
		temp.real=a.real;
		temp.img=a.img;
		a.real=b.real;
		a.img=b.img;
		b.real=temp.real;
		b.img=temp.img;
		
	}
int main(){
	complex c1(5,6);  // create complex objects
	complex c2(1,2);
	cout<<"Before Swapping"<<endl; //display before swapping values
	c1.display();
	c2.display();
	swap2(c1,c2);
	cout<<"After Swapping: "<<endl; //display after swapping values
	c1.display();
	c2.display();
}
