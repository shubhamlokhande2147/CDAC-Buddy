#include<iostream>
using namespace std;
class Complex
{
    int real;
    int img;
    public:
        Complex()
        {
            real =1;
            img =2;
        }
        Complex(int real, int img)
        {
            this->real=real;
            this->img=img;
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
    ptr->display();
    Complex *ptr1 = new Complex(10,50);
    ptr1->display();
    delete ptr1;
    delete ptr;
    ptr->display();
    ptr1->display();
    return 0;
}
