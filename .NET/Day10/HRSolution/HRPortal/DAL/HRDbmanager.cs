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
    public static string conString = @"server=192.168.10.150;port=3306;user=dac52;password=welcome;database=dac52";
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
    // public static void AddUserByDB(string cName, string cContact, string location, string cusername, string cpassword)
    // {
    //     MySqlConnection conn = new MySqlConnection();
    //     conn.ConnectionString = conString;
    //     int id =2;
    //     string querry = "insert into Ncompany values(@id,@cName,@cContact,@location,@cusername,@cpassword)";
    //     //string querry = "insert into Ncompany values(2,'fvjahf','afvua','gfyua','gfgf','fjdfj')";
    //     MySqlCommand cmd = new MySqlCommand(querry, conn);
    //     cmd.Parameters.AddWithValue("@id", id);
    //     cmd.Parameters.AddWithValue("@cName", cName);
    //     cmd.Parameters.AddWithValue("@cContact", cContact);
    //     cmd.Parameters.AddWithValue("@location", location);
    //     cmd.Parameters.AddWithValue("@cusername", cusername);
    //     cmd.Parameters.AddWithValue("@cpassowrd", cpassword);
    //     //cmd.Connection = conn;
    //     conn.Open();
    //     //cmd.CommandText = querry;
    //     Console.WriteLine(cName);
    //     cmd.ExecuteNonQuery();
    //     Console.WriteLine(".................");
    //     conn.Close();
    //     // try
    //     // {

    //     // }
    //     // catch (Exception ee)
    //     // {
    //     //     Console.WriteLine("/////////////////");
    //     //     Console.WriteLine(ee.Message);
    //     // }
    //     // finally
    //     // {
    //     //     conn.Close();
    //     // }
    // }
}