#include<iostream>
using namespace std;

class Date
{ 
  int dd,mm,yy;
    public:
    	void get()
	  	  {
	  	     cout<<"\nEnter the day : ";
			 cin>>dd;
			 cout<<"\nEnter the month : ";
			 cin>>mm;
			 cout<<"\nEnter the year : ";
			 cin>>yy;	 	
		  }
		  
		  void display()
		  { 
		     cout<<endl<<dd<<"/"<<mm<<"/"<<yy<<endl;	
	      }
	      
		  void setterdd(int d)//setter
	      {
	      	dd=d;
		  }
	      
	      int getterdd()//getter
	      {
	      	return dd;
		  }
		  
 	
};

int main()
{
	Date d1;
	d1.get();
	d1.display(); 
	cout<<"\nGet day : "<<d1.getterdd();
	d1.setterdd(12);
	d1.display();

   return 0;
}
