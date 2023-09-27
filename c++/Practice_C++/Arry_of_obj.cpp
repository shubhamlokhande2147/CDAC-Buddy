#include<iostream>
using namespace std;

class Student
{
	int roll;
	char nm[20];
	      public:
	        void get()
	        {
	        	cout<<"\nEnter the roll :";
	        	cin>>roll;
	        	cout<<"\nEnter name :";
	        	cin>>nm;
			}
			void display()
			{
			    cout<<"\nRoll no. :"<<roll;
	        	cout<<"\nName :"<<nm;	
			}
			
			int getroll()
			{
				return roll;
			}
};

int main()
{  
    int n;
       cout<<"\nEnter the no. student : ";
       cin>>n;
       
	Student s1[n],temp;
	
	   
	    for(int i=0;i<n;i++)      //for loop for get data
	    {
          	s1[i].get();	    	
		}
		for(int i=0;i<n;i++)      //for loop for display data
		{
	      s1[i].display();		
	    }
	  
	 cout<<"\n\n************************** SORT INFO *************************\n";
	           for(int i=0;i<n;i++)    //sorting stud info by roll no.
	              {
	              	 for(int j=i;j<n;j++)
	              	   {
	              	        	if(s1[i].getroll() > s1[j].getroll())
	              	        	  {
									  temp=s1[i];
									  s1[i]=s1[j];
									  s1[j]=temp;	
								  }
					   }
				  }
	         
			       	for(int i=0;i<n;i++)      //for loop for display data
	                 {
	                    s1[i].display();		
	                 }
    return 0;
}
