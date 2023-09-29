/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include<string.h>
using namespace std;
class Adhar
{
    int Aid;
    char name[50];
    public:
        void setA(int,char[]);
        void displayA();
};
void Adhar :: setA(int Aid,char name[])
{
    this->Aid =Aid;
    strcpy(this->name,name);
}
void Adhar :: displayA()
{
    cout<<"Aid: "<<Aid<<"\nname: "<<name<<endl;
}
class Pan :private Adhar
{
    int PanId;
    public:
        void setP(int,char[],int);
        void displayP();
};
void Pan::setP(int Aid, char name[],int PanId)
{
    Adhar:setA(Aid,name);
    this->PanId = PanId;
}
void Pan::displayP()
{
    Pan:displayA();
    cout<<"Pan: "<<PanId<<endl;
}
int main()
{
    Pan P1;
    P1.setP(5135235,"Harhvardhan wadavane",1279);
    P1.displayP();
    return 0;
}

