using BOL;
namespace activities;
public class DBmanager
{
    public static List<Product> GetAllProduct()
    {
        List<Product> plist = new List<Product>();
        plist.Add(new Product { Id = 5, name = "Moti", description = "Soap", qty = 1, price = 20 });
        plist.Add(new Product { Id = 5, name = "Moti", description = "Soap", qty = 1, price = 20 });
        plist.Add(new Product { Id = 5, name = "Moti", description = "Soap", qty = 1, price = 20 });
        plist.Add(new Product { Id = 5, name = "Moti", description = "Soap", qty = 1, price = 20 });
        plist.Add(new Product { Id = 5, name = "Moti", description = "Soap", qty = 1, price = 20 });

        return plist;
    }
}