#include<iostream>
using namespace std;
#include<string.h>
class Employee{
	protected:
	int id;
	char name[100];
	public:
	Employee(){  //Default employee Constructer
		
	}
	
	Employee(int id,char name[]){ //Parameterized employee Constructer
		this->id=id;
		strcpy(this->name,name);
	}
	virtual int findsalary()=0;  //pure virtual Salary in base
	virtual acceptSalesperson()=0; //pure virtual acceptSales person in base
	virtual void display(){        //virtual in base
		cout<<"Employee Details are:"<<endl;
		cout<<"ID is: "<<id<<endl;
		cout<<"Name is: "<<name<<endl;
	}
};
class Salesperson:public Employee{
	int sales;
	int commission;
	public:
		Salesperson(){   //Default Salesperson Constructer
			
		}
		
		Salesperson(int sales,int comm,int id,char name[]):Employee(id,name){   //Parameterized Salesperson Constructer
			this->sales=sales;
			this->commission=comm;
		}
		
		acceptSalesperson(){     //overrided in derived
		cout<<"Enter Name :"<<endl;
		cin>>name;
		cout<<"Enter ID :"<<endl;
		cin>>id;
		cout<<"Enter sales : "<<endl;
		cin>>sales;
		cout<<"Enter commission: "<<endl;
		cin>>commission;
		}
		
		int findsalary(){   //overrided in derived
			return sales*commission;
		}
		
		void display(){     //overrided in derived
			Employee::display();
			cout<<"Sales Person Details are: "<<endl;
			cout<<"Sales is :"<<sales<<endl;
			cout<<"Commission is :"<<commission<<endl;
		}
};
int main(){
	Employee *ptr=new Salesperson[100];  //generic base pointer created salesperson object dynamically
	ptr->acceptSalesperson(); //called functionn derived from generic pointer
	ptr->display();  //called overided functionn derived from generic pointer
	
	cout<<"Salary of Sales Person is: "<<ptr->findsalary()<<endl; //specific function of derived called from generic pointer
	delete[]ptr; //deleted memory of pointer
}


