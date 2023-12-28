namespace DAL;
using BOL;
using MySql.Data.MySqlClient;

using System.Collections.Generic;

public class ProductDBManager
{
        public static string conString="server=localhost;port=3306;user=root; password=Shubham@2147;database=dot_net";       

        public static List<Product> GetAllProducts()
        {

              List<Product> allProducts=new List<Product>();
            //database connectivity code
            //Connected Data Access Mode
            //MySqlConnection  : establishing connection
            //MySqlCommand      : query execution
            //MySqlDataReader   : result of query to be catured after processing query
            MySqlConnection con=new MySqlConnection();
            con.ConnectionString=conString;
            try{
                con.Open();
                //fire query to database
                MySqlCommand cmd=new MySqlCommand();
                cmd.Connection=con;
                string query="SELECT * FROM products1";
                cmd.CommandText=query;
                MySqlDataReader reader=cmd.ExecuteReader();
                while(reader.Read()){
                    int id = int.Parse(reader["id"].ToString());
                    string name = reader["name"].ToString();
                    string description = reader["description"].ToString();
                    int qty = int.Parse(reader["qty"].ToString());
                    int price = int.Parse(reader["price"].ToString());


                    Product prod = new Product();
                    prod.Id =id;
                    prod.Name = name;
                    prod.Description = description;
                    prod.Qty = qty;
                    prod.Price = price;
                                        
                
                    allProducts.Add(prod);
                }
                reader.Close();
            }
            catch(Exception ee){
                Console.WriteLine(ee.Message);
            }
            finally{
                    con.Close();
            }

            return allProducts;  
        }    

        public static void InsertData(Product p)
        {
            // int id=p.Id;
            // string name=p.Name;    
            // string desc=p.Description;
            // int qty=p.Qty; 
            // int price=p.Price;
            //        Console.WriteLine(id + " " + name);

            // string query="insert into table products1 values(id,name,desc,qty,price)";
            // MySqlConnection con=new MySqlConnection();
            // con.Open();
            // con.ConnectionString=conString;
            
            // MySqlCommand command = new MySqlCommand(query, con);
            // command.Connection=con;
            // command.ExecuteNonQuery();
            // con.Close();

             //Employee Operations CRUD
    //public static bool Insert(Department dept){
        // bool status=false;
        // string query = "INSERT INTO departments(name,location)" +
        //                     "VALUES('" + dept.Name + "','" + dept.Location + "')";

   string query = "INSERT INTO products1(id,name,description,qty,price)" +
                             "VALUES('" + p.Id + "','" + p.Name + "','" + p.Description + "','" + p.Qty + "','" + p.Price + "')";
         //string query="insert into table products1 values(id,name,desc,qty,price)";

        MySqlConnection con = new MySqlConnection();
        con.ConnectionString = conString;
        try{
            con.Open();
            MySqlCommand command = new MySqlCommand(query, con);
            command.ExecuteNonQuery();  //DML
            // status = true;
        } 
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
        finally
        {
            con.Close();
        }               
     //   return status;
              // this.Redirect("Product");
        }   
}     