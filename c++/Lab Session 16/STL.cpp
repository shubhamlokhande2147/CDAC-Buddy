#include <algorithm>
#include <iostream>
using namespace std;  
int main()
{
    int arr[] = {3, 5, 1, 2, 4,23,34,112,22,23};
  
    sort(arr, arr+10);
  
    for (int i=0; i<10; i++)
    {
        cout << arr[i] << " ";
    }
  
     
  
    return 0;
}
