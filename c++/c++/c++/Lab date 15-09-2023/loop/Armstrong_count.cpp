#include <iostream>
#include <cmath>
using namespace std;

int main() {

  int num1=0, num2=999, i, num, digit, sum, count,result=0;



  if (num1 > num2) {
    num1 = num1 + num2;
    num2 = num1 - num2;
    num1 = num1 - num2;
  }
  
  cout << "Armstrong numbers between " << num1 << " and " << num2 << " are: " << endl;
  
  for(i = num1; i <= num2; i++) {

    count = 0;

    num = i;

    while(num > 0) {
      ++count;
      num /= 10;
    }
 

    sum = 0;

  
    num = i;
        

    while(num > 0) {
      digit = num % 10;
      sum = sum + pow(digit, count);
      num /= 10;
    }

    if(sum == i) {
      cout << i << ", ";
      result++;
    }
  }
	cout<<"Total Count is "<<result;
  return 0;
}

