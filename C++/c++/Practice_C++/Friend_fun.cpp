<<<<<<< HEAD
#include<iostream>
using namespace std;

class Demo
{
	int a;
	 public:
	 	void get()
	 	{
	 	  cout<<"\nEnter value of a"<<endl;
		   cin>>a;	
	    }
	    void show()
	    {
	    	cout<<"\na : "<<a;
		}
		
		friend void edit(Demo&);
};

void edit(Demo& t)
{
	cout<<"\nFriend function calling : ";
	t.a=t.a+5;
}

int main()
{
	Demo d1;
	d1.get();
	d1.show();
	
	edit(d1);
	d1.show();
	
	return 0;
}
=======
#include<iostream>
using namespace std;

class Demo
{
	int a;
	 public:
	 	void get()
	 	{
	 	  cout<<"\nEnter value of a"<<endl;
		   cin>>a;	
	    }
	    void show()
	    {
	    	cout<<"\na : "<<a;
		}
		
		friend void edit(Demo&);
};

void edit(Demo& t)
{
	cout<<"\nFriend function calling : ";
	t.a=t.a+5;
}

int main()
{
	Demo d1;
	d1.get();
	d1.show();
	
	edit(d1);
	d1.show();
	
	return 0;
}
>>>>>>> 780e2f0eead5a6b2acfd4a998fcfbbe958e5b35a
