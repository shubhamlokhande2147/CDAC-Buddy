#include<iostream>
using namespace std;
class A
{
    int a;
    public:
        A()
        {
            cout<<"A default constructor"<<endl;
        }
        A(int a)
        {
            cout<<"A para cons"<<endl;
            this->a=a;
        }
        void display()
        {
            cout<<"A class display func"<<endl;
            cout<<"value of a is "<<a<<endl;
        }
};
class B: public A
{
    int b;
    public:
    B()
    {
        cout<<"B default constructor"<<endl;
    }
    B(int a,int b):A(a)
    {
        this->b=b; 
        cout<<"B para constructor"<<endl;       
    }

    void display()
    {
        A::display();
        cout<<"B class display func"<<endl;
        cout<<"value of B is "<<b;
    }
};
int main()
{
    A obj1(60);
    obj1.display();
    B Bobj(70,50);
    Bobj.display();
}
