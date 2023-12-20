using HR;

//Employee obj
Employee emp = new Employee();
Console.WriteLine(emp);


//WageEmployee obj
WageEmployee wg = new WageEmployee();
Console.WriteLine(wg);


//SalEmployee obj
SalEmployee se = new SalEmployee();
Console.WriteLine(se);

//salary of salEmployee
float sal = se.calculatesal();
Console.WriteLine("Total Salary : " + sal);

List<Employee> elist = new List<Employee>();
elist.Add(emp);
elist.Add(wg);
elist.Add(se);
foreach (Employee e in elist)
{
    Console.WriteLine(e);
    Console.WriteLine(e.calculatesal());
}

//Explicit TypeCast
int amount = 67;
float t =amount;
Console.WriteLine(t);

float t1 = 1.5f;
int t2 = (int)t1;
Console.WriteLine(t2);

WageEmployee nwg = se;
Console.WriteLine(nwg);

//SalEmployee nse = (SalEmployee) nwg;
SalEmployee nse = nwg as SalEmployee;
Console.WriteLine(nse);

