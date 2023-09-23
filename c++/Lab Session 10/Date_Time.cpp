#include<iostream>
using namespace std;
class Date1
{
    int dd,mm,yy;
    public:
        Date1(int dd,int mm,int yy)
        {
            this->dd=dd;
            this->mm=mm;
            this->yy=yy;
        }
        void show()
        {
            cout<<"Date is : "<<dd<<"/"<<mm<<"/"<<yy<<endl;
        }
           void add(int d,int m,int y)
            {
             cout<<"\nAddition of Date : ";    
             this->dd = this->dd+d;
             this->mm = this->mm+m;
             this->yy = this->yy+y;
            }
            
            void sub(int d,int m,int y)
            {
             cout<<"\nSubstraction of Date : ";
             this->dd = this->dd-d;
             this->mm = this->mm-m;
             this->yy = this->yy-y;
            }
};
class Time
{
    int hh,mm,ss;
    public:
        Time(int hh,int mm,int ss)
        {
            this->hh=hh;
            this->mm=mm;
            this->ss=ss;
        }
        void show()
        {
            cout<<"Time is : "<<hh<<" : "<<mm<<" : "<<ss<<endl;
        }
           void add(int h,int m,int s)
            {
             cout<<"\nAddition of Time : ";    
             this->hh = this->hh+h;
             this->mm = this->mm+m;
             this->ss = this->ss+s;
            }
            
            void sub(int h,int m,int s)
            {
             cout<<"\nSubstraction of Time : ";
            this->hh = this->hh-h;
             this->mm = this->mm-m;
             this->ss = this->ss-s;
            }
};
int main()
{
    Date1 D2(2,5,2007);
    D2.show();
    D2.add(5,1,1);
    D2.show();
    D2.sub(2,3,5);
    D2.show();
    cout<<"--------------------------------------"<<endl;
    Time T2(11,30,28);
    T2.show();
    T2.add(5,1,1);
    T2.show();
    T2.sub(2,3,5);
    T2.show();
    return 0;
    
}
