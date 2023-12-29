using HRPortal.Models;
namespace DAL;
using MySql.Data.MySqlClient;
public static class HRDbmanager
{
    public static List<Employee> GetAllEmployee()
    {
        List<Employee> elist = new List<Employee>();
        elist.Add(new Employee { Id = 1, FirstName = "Harsh", LastName = "Wadavane", UserName = "harsh", Password = "123" });
        elist.Add(new Employee { Id = 2, FirstName = "saurabh", LastName = "Zadtode", UserName = "Phaltode", Password = "9090" });
        return elist;
    }
    public static List<Company> GetAllCompany()
    {
        List<Company> clist = new List<Company>();

        clist.Add(new Company { CompanyName = "Transflower", CompanyContact = "1234567890", Location = "Pune", Cusername = "admin", Cpassword = "admin" });
        clist.Add(new Company { CompanyName = "TransPerfect", CompanyContact = "1234567565", Location = "Mumbai", Cusername = "admin", Cpassword = "admin" });
        clist.Add(new Company { CompanyName = "Cupa", CompanyContact = "1234456677", Location = "Pune", Cusername = "admin", Cpassword = "admin" });

        return clist;
    }
    public static string conString = @"server=localhost;port=3306;user=root;password=1122;database=simple";
    public static List<Company> GetAllCompanyByDB()
    {
        List<Company> clist = new List<Company>();
        MySqlConnection conn = new MySqlConnection();
        conn.ConnectionString = conString;
        string querry = "select name,contact,location,username,password from Ncompany";
        try
        {
            MySqlCommand cmd = new MySqlCommand();
            cmd.Connection = conn;
            conn.Open();
            cmd.CommandText = querry;
            MySqlDataReader reader = cmd.ExecuteReader();
            while (reader.Read())
            {
                string name = reader["name"].ToString();
                string conatct = reader["contact"].ToString();
                string location = reader["location"].ToString();
                string username = reader["username"].ToString();
                string password = reader["password"].ToString();
                Company c = new Company(name, conatct, location, username, password);
                clist.Add(c);
            }

        }
        catch (Exception ee)
        {
            Console.WriteLine(ee.Message);
        }
        finally
        {
            conn.Close();
        }
        return clist;
    }
    public static bool AddUserByDB(string companyName, string contact, string location, string username, string password)
    {
        MySqlConnection conn = new MySqlConnection();
        conn.ConnectionString = conString;
        string querry = "insert into Ncompany values(2,@CompanyName, @Contact, @Location, @Username, @Password)";
        //string querry = "insert into Ncompany values(2,'fvjahf','afvua','gfyua','gfgf','fjdfj')";

        try
        {
        MySqlCommand cmd = new MySqlCommand(querry, conn);
        //cmd.Parameters.AddWithValue("@id", id);
        cmd.Parameters.AddWithValue("@CompanyName", companyName);
        cmd.Parameters.AddWithValue("@Contact", contact);
        cmd.Parameters.AddWithValue("@Location", location);
        cmd.Parameters.AddWithValue("@Username", username);
        cmd.Parameters.AddWithValue("@Password", password); 
        cmd.Connection = conn;
        conn.Open();
        cmd.CommandText = querry;
       // Console.WriteLine(cName);
        cmd.ExecuteNonQuery();
        return true;
        }
        catch (Exception ee)
        {
            Console.WriteLine("/////////////////");
            Console.WriteLine(ee.Message);
            return false;
        }
        finally
        {
            conn.Close();
        }
        return false;
    }
    public static bool ValidateUser(string username, string password)
    {
        MySqlConnection conn = new MySqlConnection();
        conn.ConnectionString = conString;
        Company c = new Company();
        string querry = "SELECT COUNT(*) FROM Ncompany WHERE username = @Username AND password = @Password";
        try
        {
            MySqlCommand cmd = new MySqlCommand();
            cmd.Connection = conn;
            conn.Open();
            cmd.CommandText = querry;
            cmd.Parameters.AddWithValue("@Username", username);
            cmd.Parameters.AddWithValue("@Password", password);

            int count = Convert.ToInt32(cmd.ExecuteScalar());

            return count > 0;

        }
        catch (Exception ee)
        {
            Console.WriteLine(ee.Message);
        }
        finally
        {
            conn.Close();
        }
        return false;
    }
}