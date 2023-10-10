#include<iostream>

using namespace std;

void execute(int x, int y = 200)
{

int temp = x+y;

x+= temp;

if (y != 200)

cout << temp << " "<<x<<" "<<""<<endl;
}

int main()
{

int a = 50, b = 20;

execute(b);

cout << a <<" " << b <<" "<<endl;

execute(a, b);
}