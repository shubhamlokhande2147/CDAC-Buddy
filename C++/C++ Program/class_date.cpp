#include<iostream>
using namespace std;


class date1
{ 
   int dd,mm,yy;
   public:
   	void getdata()
		{		
			cout<<"\nEnter the date : "<<endl;
			cin>>dd>>mm>>yy;
		}
		void display()  //inside fun defination
	    {
	  	  cout<<"\nDate is : "<<dd<<"/"<<mm<<"/"<<yy<<endl;
	    }
	    
	    void setdd(int d)
        {
        	dd=d;
		}
		
		int getdd()
		{  
			return dd;
		}
		
		void setmm(int m)
        {
        	mm=m;
		}
		
		int getmm()
		{  
			return mm;
		}
		
		void setyy(int y)
        {
        	yy=y;
		}
		
		int getyy()
		{  
			return yy;
		}



};
    int main()
	{
	date1 c1;
	c1.getdata();
	c1.display();
	cout<<"\nSizeof class : "<<sizeof(c1);
	
	date1 c2;
	c2.getdata();
	c2.display();

	c2.setdd(31);
	cout<<"Modified dd : "<<c2.getdd()<<endl;
	c2.setmm(12);
	cout<<"Modified mm : "<<c2.getmm()<<endl;
	c2.setyy(2024);
	cout<<"Modified yy : "<<c2.getyy()<<endl;
	c2.display();
	cout<<"\nSizeof class : "<<sizeof(date1);
}
