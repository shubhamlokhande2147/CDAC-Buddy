using BOL;
using dept;
public class DeptRepository : IDeptRepositoty{

IDeptManagers idept;
public DeptRepository()
{
    idept = new DeptManager();
}
    public  List<Department> getAll()
    {
       return idept.getAll();
    }
}