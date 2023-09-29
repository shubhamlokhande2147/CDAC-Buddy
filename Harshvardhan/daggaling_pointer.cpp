/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include<string.h>
using namespace std;
class String1
{
    int len;
    char* ptr;
    public:
        void show()
        {
            cout<<"String is "<<ptr<<endl;
            cout<<"Length of string is "<<len<<endl;
        }
        String1(char * temp)
        {
            len = strlen(temp);
            ptr = new char(len+1);
            strcpy(ptr,temp);
        }
        ~String1()
        {
            cout<<"Delete destructor is called"<<endl;
            if(ptr)
            delete [] ptr;
            ptr = NULL;
        }
        String1(String1 & c)
        {
            this->len = c.len;
            this->ptr = new char[this->len+1];
            strcpy(this->ptr,c.ptr);
        }
};
int main()
{
    String1 s1("Harsh");
    s1.show();
    {
        String1 s2(s1);
        s2.show();
        s2.~String1();
    }
    s1.show();
}


