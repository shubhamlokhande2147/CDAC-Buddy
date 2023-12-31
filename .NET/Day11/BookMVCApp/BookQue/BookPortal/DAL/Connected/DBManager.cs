namespace DAL.Connected;
using BookPortal.BOL;
using MySql.Data.MySqlClient;
public static class DBManager
{
    public static string conString = @"server=192.168.10.150;port=3306;user=dac52;password=welcome;database=dac52";
    public static bool AddBookByDB(int id, string bname, string author, int price)
    {
        MySqlConnection conn = new MySqlConnection();
        conn.ConnectionString = conString;
        string query = "insert into book values(@Id,@Bname,@Auhor,@Price)";
        //string query = "insert into book values(2,'abc','xyz',100)";
        try
        {
            Console.WriteLine("try");
            MySqlCommand cmd = new MySqlCommand(query, conn);
            cmd.Parameters.AddWithValue("@Id", id);
            cmd.Parameters.AddWithValue("@Bname", bname);
            cmd.Parameters.AddWithValue("@Auhor", author);
            cmd.Parameters.AddWithValue("@Price", price);
            cmd.Connection = conn;
            conn.Open();
            cmd.CommandText = query;
            cmd.ExecuteNonQuery();
            Console.WriteLine("Error");
            return true;
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
        finally
        {
            conn.Close();
        }
        return false;
    }



    public static bool UpdateBookByID(Book b)
    {
        MySqlConnection conn = new MySqlConnection();
        conn.ConnectionString = conString;
        string query = "update book set bname=@Bname,author=@Auhor,price=@Price where id=@Id";
        // string query = "update book set bname='rt' where id=5";

        try
        {
            Console.WriteLine("try");
            MySqlCommand cmd = new MySqlCommand(query, conn);
            cmd.Parameters.AddWithValue("@Id", b.Id);
            cmd.Parameters.AddWithValue("@Bname", b.Bname);
            cmd.Parameters.AddWithValue("@Auhor", b.Author);
            cmd.Parameters.AddWithValue("@Price", b.price);
            cmd.Connection = conn;
            conn.Open();
            cmd.CommandText = query;
            cmd.ExecuteNonQuery();
            Console.WriteLine("Error");
            return true;
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
        finally
        {
            conn.Close();
        }
        return false;
    }
    public static bool DeleteBookByID(int id)
    {
        MySqlConnection conn = new MySqlConnection();
        conn.ConnectionString = conString;
        string query = "delete from book where id=@Id";
        // string query = "update book set bname='rt' where id=5";

        try
        {
            Console.WriteLine("try");
            MySqlCommand cmd = new MySqlCommand(query, conn);
            cmd.Parameters.AddWithValue("@Id", id);
            cmd.Connection = conn;
            conn.Open();
            cmd.CommandText = query;
            cmd.ExecuteNonQuery();
            return true;
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
        finally
        {
            conn.Close();
        }
        return false;
    }
    public static List<Book> FindBookByID(int id)
    {
        MySqlConnection conn = new MySqlConnection();
        conn.ConnectionString = conString;
        string query = "select id,bname,author,price from book where id=@Id";
        // string query = "update book set bname='rt' where id=5";
        List<Book> list = new List<Book>();
        try
        {
            Console.WriteLine("try");
            MySqlCommand cmd = new MySqlCommand(query, conn);
            cmd.Parameters.AddWithValue("@Id", id);
            cmd.Connection = conn;
            conn.Open();
            cmd.CommandText = query;
            MySqlDataReader reader = cmd.ExecuteReader();
            while (reader.Read())
            {
                int id1 = int.Parse(reader["id"].ToString());
                string bnm = reader["bname"].ToString();
                string auth = reader["author"].ToString();
                int pc = int.Parse(reader["price"].ToString());
                Book b = new Book(id1, bnm, auth, pc);
                if (b != null)
                {
                    list.Add(b);
                }
            }

            return list;
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
        finally
        {
            conn.Close();
        }
        return list;
    }
    public static List<Book> GetAllBook()
    {
        MySqlConnection conn = new MySqlConnection();
        conn.ConnectionString = conString;
        string query = "select id,bname,author,price from book ";
        // string query = "update book set bname='rt' where id=5";
        List<Book> list = new List<Book>();
        try
        {
            Console.WriteLine("try");
            MySqlCommand cmd = new MySqlCommand(query, conn);
            cmd.Connection = conn;
            conn.Open();
            cmd.CommandText = query;
            MySqlDataReader reader = cmd.ExecuteReader();
            while (reader.Read())
            {
                int id1 = int.Parse(reader["id"].ToString());
                string bnm = reader["bname"].ToString();
                string auth = reader["author"].ToString();
                int pc = int.Parse(reader["price"].ToString());
                Book b = new Book(id1, bnm, auth, pc);
                if (b != null)
                {
                    list.Add(b);
                }
            }

            return list;
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
        finally
        {
            conn.Close();
        }
        return list;
    }
}


