using HRPortal.Models;
namespace DAL;
public static class HRDbmanager{
    public static List<Employee> GetAllEmployee()
    {
        List<Employee> elist = new List<Employee>();
        elist.Add(new Employee{Id=1,FirstName="Harsh",LastName="Wadavane",UserName="harsh",Password="123"});
        elist.Add(new Employee{Id=2,FirstName="saurabh",LastName="Zadtode",UserName="Phaltode",Password="9090"});
        return elist;
    }
    public static List<Company> GetAllCompany()
    {
        List<Company> clist = new List<Company>();
        clist.Add(new Company{CompanyName = "Transflower",CompanyContact="1234567890",Location="Pune",Cusername="admin",Cpassword="admin"});
        clist.Add(new Company{CompanyName = "TransPerfect",CompanyContact="1234567565",Location="Mumbai",Cusername="admin",Cpassword="admin"});
        clist.Add(new Company{CompanyName = "Cupa",CompanyContact="1234456677",Location="Pune",Cusername="admin",Cpassword="admin"});

        return clist;
    }
}