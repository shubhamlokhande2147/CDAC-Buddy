#include <iostream>
#include <fstream>
using namespace std;
class Employee {
public:
   string Name;
   int Employee_ID;
   int Salary;
};
int main(){
   Employee Emp_1;
   Emp_1.Name="John";
   Emp_1.Employee_ID=2121;
   Emp_1.Salary=11000;
   
   ofstream file1;
   file1.open("Employee.txt", ios::app);
   file1.write((char*)&Emp_1,sizeof(Emp_1));
   file1.close();
  
   ifstream file2;
   file2.open("Employee.txt",ios::in);
   file2.read((char*)&Emp_1,sizeof(Emp_1));

cout<<"Name : "<<Emp_1.Name<<endl;
cout<<"Employee Id: "<<Emp_1.Employee_ID<<endl;
cout<<"Salary: "<<Emp_1.Salary<<endl;

   file2.close();
   return 0;
}
