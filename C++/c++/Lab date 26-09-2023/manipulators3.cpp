

#include <iostream>  
#include <iomanip>  
using namespace std;  
  
int main()  
{  
    cout << "default fill: " << setw(10) << 42 << '\n'  
              << "setfill('*'): " << setfill('*')  
                                  << setw(10) << 42 << '\n';  
}  
