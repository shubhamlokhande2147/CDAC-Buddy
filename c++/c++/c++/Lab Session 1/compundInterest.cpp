#include <iostream>
#include <cmath>
using namespace std;

float solve( int P, int T, float R, int N) {
   float fa;
   fa = P * pow((1 + ( R / (N * 100) )), ( N * T ));
   return fa - P;
}

int main() {
   int P = 20000;
   int T = 8;
   float R = 7.25;
   int N = 4;
   cout << "Compound interest for 20,000 with ROI 7.25\% for 8 years and calculating interests quarterly, is: ";
   float result;
   result = solve( P, T, R, N);
   cout << result << endl;
   cout << "Total amount is: " << P + result;
   return 0;
}
