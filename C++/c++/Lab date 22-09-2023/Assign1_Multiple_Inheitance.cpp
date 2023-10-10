#include<iostream>
using namespace std;

class Student
{
	int roll;
	int sub1,sub2;
	public:

         void getting1()
         {
         				
		   cout<<"\nEnter the roll no. : ";
		   cin>>roll;
		   
		   cout<<"\nEnter the Sub1 marks : ";
		   cin>>sub1;
		   
		   cout<<"\nEnter the Sub2 marks : ";
		   cin>>sub2;

		 }
		 	
	    int get1()
		{
		   return sub1 + sub2;	
		}	

};

class Sport
{
   int sportmark;
        public:
        void getting2()
        {
        
           cout<<"\nEnter the sportmark : ";
		   cin>>sportmark;	
		}
        int get3()
        {
        	return sportmark;
		}

};

class Result:public Student,public Sport
{
	int total;
	float avg;
	      public:
			void Calculate()
			{
				total=Student::get1() + Sport::get3();
				cout<<"\nTotal marks : "<<total;
				avg=(float)total/3;
				cout<<"\nAverage : "<<avg;
			}
			
};
int main()
{
    Result r1;
    r1.getting1();
    r1.getting2();
	r1.Calculate();	
}
