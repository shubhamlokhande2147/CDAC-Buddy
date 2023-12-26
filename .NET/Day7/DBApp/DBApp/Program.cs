using MySql.Data.MySqlClient;
Console.WriteLine("Welcome to Db app");

//define connection string
MySqlConnection connection = new MySqlConnection();
connection.ConnectionString = "server=localhost;port=3306;user=root;password=Shubham@2147;database=dot_net";

do
{
    Console.WriteLine("\r\n1.Print All Products \r\n2.Insert Product \r\n3.Delete Product \r\n4.Update Data \r\n5.Exit");
    Console.WriteLine("Enter the Choice : ");
    int choice = int.Parse(Console.ReadLine());
    connection.Open();
    switch (choice)
    {
        case 1:
            string query = "select * from products1";
            MySqlCommand command = new MySqlCommand(query, connection);

            try
            {
                //connection.Open();
                MySqlDataReader reader = command.ExecuteReader();
                while (reader.Read())
                {
                    int id = int.Parse(reader["id"].ToString());
                    string name = reader["name"].ToString();
                    string desc = reader["description"].ToString();
                    int qty = int.Parse(reader["qty"].ToString());
                    int price = int.Parse(reader["price"].ToString());
                    Console.WriteLine("Id : " + id + " Name : " + name + " Decription :" + desc + " Quantity : " + qty + " Price : " + price);
                }
                reader.Close();

            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            // finally
            // {
            //     connection.Close();
            // }
            break;

        case 2:
            Console.WriteLine("Enter id");
            int id1 = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter name");
            string ename = Console.ReadLine();
            Console.WriteLine("Enter Description");
            string Desc1 = Console.ReadLine();
            Console.WriteLine("Enter Quantity");
            int Qty1 = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter Price");
            int Price1 = int.Parse(Console.ReadLine());
            string query1 = "INSERT INTO products1 VALUES (@value1, @value2, @value3,@value4,@value5)";

            command = new MySqlCommand(query1, connection);

            command.Parameters.AddWithValue("@value1", id1);
            command.Parameters.AddWithValue("@value2", ename);
            command.Parameters.AddWithValue("@value3", Desc1);
            command.Parameters.AddWithValue("@value4", Qty1);
            command.Parameters.AddWithValue("@value5", Price1);

            try
            {
                //connection.Open();
                command.ExecuteNonQuery();


            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            // finally
            // {
            //     connection.Close();
            // }
            break;

        case 3:
            Console.WriteLine("Enter id ");
            int pid = int.Parse(Console.ReadLine());
            string query3 = "delete from products1 where id=@pid";
            command = new MySqlCommand(query3, connection);
            command.Parameters.AddWithValue("@pid", pid);
            try
            {
                //connection.Open();
                command.ExecuteNonQuery();

            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            // finally
            // {
            //     connection.Close();
            // }
            break;

        case 4:
            Console.WriteLine("enter id for update price");
            int eid = int.Parse(Console.ReadLine());
            string query4 = "update products1 set price =100 where id= @eid";

            command = new MySqlCommand(query4, connection);
            command.Parameters.AddWithValue("@eid", eid);
            try
            {

                command.ExecuteNonQuery();

            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }

            break;

        case 5:

            connection.Close();
            System.Environment.Exit(0);
            break;

        default:
            Console.WriteLine("You entered wrong Choice....");
            break;
    }
    connection.Close();
} while (true);

