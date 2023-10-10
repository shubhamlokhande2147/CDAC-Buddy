#include<iostream>
using namespace std;
#include<string.h>

class Demo
{
	int len;
	char *ptr;
	
	    public:
	    	Demo(char *sptr)
	    	{
	    		len=strlen(sptr);
	    		ptr=new char[len+1];
	    		strcpy(ptr,sptr);
			}
       
	        void show()
			{
	          cout<<"\nString : "<<ptr;			
	 		}	    	
};

int main()
{
	Demo d1("Ram");
	d1.show();
	Demo d2("Luxman");
	d2.show();
	
	d2=d1;
	d2.show();
	
	
	return 0;
}
