using BOL;
using IOCWebApp.Contexts;
namespace dept;
public class DeptManager : IDeptManagers{

public DeptManager()
{

}
    public List<Department> getAll()
    {
        using (CollectionContext context = new CollectionContext())
        {
            var dept = from depart in context.Departments select depart;

        
         return dept.ToList<Department>();
        }
      
    }
}