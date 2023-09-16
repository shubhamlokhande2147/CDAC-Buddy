#include<iostream>
using namespace std;
int main()
{ 
    cout<<"\nPattern 1 :"<<endl;
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            cout<<"*";
        }
        cout<<"\n";
    }

    cout<<"\n---------------------------------------------------------------\n";
    
    cout<<"\nPattern 2 :"<<endl;
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            cout<<"*";
        }
        cout<<"\n";
    }

   cout<<"\n---------------------------------------------------------------\n";
    
    cout<<"\nPattern 3 :"<<endl;
    for(int i=5;i>=0;i--)
    {
        for(int j=1;j<=i;j++)
        {
            cout<<"*";
        }
        cout<<"\n";
    }

 cout<<"\n---------------------------------------------------------------\n";
    
    cout<<"\nPattern 4 :"<<endl;
    for (int i = 5; i > 0; i--) {
        for (int j = 1; j <= 5; j++) // looping columns
        {
            if (j >= i) {
                cout << "* ";
            }
            else {
                cout << "  ";
            }
        }
        cout<<endl;
    }

 cout<<"\n---------------------------------------------------------------\n";
    
    cout<<"\nPattern 5 :"<<endl;
    int k = 5;
    for (int i = 1; i <= 5; i++) {
 
        // Inner loop for columns
        for (int j = 1; j <= 5; j++) {
 
            // Condition to print star pattern
            if (j >= k)
                cout << "* ";
            else
                cout << " ";
        }
        k--;
        cout << "\n";
    }

    
     return 0;
}