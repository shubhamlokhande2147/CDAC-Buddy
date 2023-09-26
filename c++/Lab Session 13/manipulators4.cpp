#include <iostream>     // std::cout, std::fixed  
#include <iomanip>      // std::setprecision  
using namespace std;  
  
int main () {  
  double f =3.14159;  
  cout << setprecision(4) << f << '\n';  
  cout << setprecision(2) << f << '\n';  
  cout << fixed;  
  cout << setprecision(5) << f << '\n';  
  cout << setprecision(9) << f << '\n';  
  return 0;  
} 
