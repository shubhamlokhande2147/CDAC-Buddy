using BOL;

public class DeptService: IDeptService
{

    private IDeptRepositoty idept;
    public DeptService()
    {
        idept= new DeptRepository();
    }

    public List<Department> getAllProduct()
    {

List<Department> li = new List<Department>();
       foreach ( Department d in li)
       {
          Console.WriteLine(d);
       }        
        if(idept != null){
            return idept.getAll();
        }
        return null;
    }
    
}