namespace BLL;
using pp;

public class CatalogManager{
    public  List<Product> GetAllProduct()
    {
        List<Product> plist = new List<Product>();
        Product p = new Product(6,"gsdg","gfdasujgf",2,38);
        // plist.Add(new Product { Id = 5, name = "Moti", description = "Soap", qty = 1, price = 20 });
        // plist.Add(new Product { Id = 6, name = "Moti", description = "Soap", qty = 1, price = 20 });
        // plist.Add(new Product { Id = 7, name = "Moti", description = "Soap", qty = 1, price = 20 });
        plist.Add(p);
        return plist;
    }
}