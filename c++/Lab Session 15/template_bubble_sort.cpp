#include <iostream>  
using namespace std;  
template<class T, int size>  
class A   
{  
    public:  
    T arr[size];  
    void insert()  
    {  
  	
        for (int j=0;j<size;j++)  
        {  
            cin>>arr[j]; 
        }  
    }  
    void bubble_sort()
    {
    	for(int i=1;i<=size;i++)
    	{
    		for(int j=0;j<size-i;j++)
    		{
    			if(arr[j]>arr[j+1])
    			{
    				int temp;
    				temp=arr[j];
    				arr[j]=arr[j+1];
    				arr[j+1]=temp;
				}
			}
		}
	}
      
    void display()  
    {  
        for(int i=0;i<size;i++)  
        {  
         cout << arr[i] << " ";  
        }  
    }  
};  
int main()  
{  
    A<int,5> t1;  
    cout<<"Enter Numbers\n";
    t1.insert(); 
    cout<<"\nBefore sorting :\n";
    t1.display();
    cout<<"\nAfter sorting :\n";
	t1.bubble_sort(); 
    t1.display();  
    return 0;  
} 

 
