#include<iostream>
using namespace std;
class Complex
{
    int real;
    int img;
    public:
        void get()
        {
            cout<<"enter complex no: ";
            cin>>real;
            cin>>img;
        }
        void display();
};
void Complex::display()
{
    cout<<"Complex no is : "<<real<<"+"<<img<<"i"<<endl;
}
int main()
{
    Complex *ptr=new Complex();
    int n;
    cout<<"accept no of object "<<endl;
    cin>>n;
    for(int i=0;i<n;i++)
    {
    	ptr[i].get();
	}
	for(int i=0;i<n;i++)
	{
		ptr[i].display();
	}
    return 0;
}
