#include <iostream>     // std::cout, std::endl  
#include <iomanip>      // std::setfill, std::setw  
using namespace std;  
  
int main () {  
  cout << setfill ('$') << setw (10);  
  cout << 24 << endl;  
  return 0;  
}  
