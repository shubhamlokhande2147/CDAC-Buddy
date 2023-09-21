//object createion on stack with virtaul keyword
#include<iostream>
using namespace std;

class Emp
{
  int id;
  public:
        Emp();
		Emp(int);
		virtual void display();
		virtual int findsalary()
		{
		  return 0;	
		}	
};

Emp::Emp()
{
	cout<<"\nDefault of Emp";
	id=0;
}
Emp::Emp(int i)
{
	cout<<"\nPara of Emp";
	id=i;
}
void Emp::display()
{
	cout<<"\nId of emp : "<<id;
}

class Wagemp:public Emp
{
	int hrs;
	int rate;
	public:
		Wagemp();
		Wagemp(int,int,int);
		void display();
		int findsalary();
};

Wagemp::Wagemp()
{
	cout<<"\nDefault of Wagemp";
	hrs=0;
	rate=0;
}

Wagemp::Wagemp(int i,int h,int r):Emp(i)
{
	cout<<"\nPara of Wagemp";
	hrs=h;
	rate=r;
}
int Wagemp::findsalary()
{
	return hrs * rate;
}
void Wagemp::display()
{
	Emp::display();
	cout<<"Hrs : "<<hrs<<"Rate : "<<rate;
}

class Salesmanager:public Wagemp
{
	int sale;
	int comm;
	public:
		Salesmanager();
		Salesmanager(int,int,int,int,int);
		void display();
		int findsalary();
};
Salesmanager::Salesmanager()
{
	cout<<"\nDefault of Salesmanager";
	sale=0;
	comm=0;
}

Salesmanager::Salesmanager(int i,int h,int r,int s,int c):Wagemp(i,h,r)
{
	cout<<"\nPara of Salesmanager";
	sale=s;
	comm=c;
}

void Salesmanager::display()
{
	Wagemp::display();
	cout<<"\nSales : "<<sale;
    cout<<"\nComm : "<<comm;
}

int Salesmanager::findsalary()
{
	return (Wagemp::findsalary()) + sale * comm;
}

int main()
{
    Emp *ptr;
	Emp emp1;
	ptr = &emp1;
	Wagemp Weg1;
	ptr = &Weg1;
	Salesmanager Sm1(101,10,500,10,10);
	ptr = & Sm1;
	
	cout<<"\nSalary : "<<ptr->findsalary();//o/p is 0
	return 0;
	
}
