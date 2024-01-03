namespace DAL;

using System.Collections.Generic;
using BOL;

public class DBManager : IDBManager
{
    public List<Product> GetAll()
    {
        using (var Context = new CollectionContext())
        {
            var products = from product1 in Context.products select product1;
            return products.ToList<Product>();
        }
    }

    public Product GetById(int id)
    {
        using (var context = new CollectionContext())
        {
            var product = context.products.Find(id);
            return product;
        }

    }

    public void Insert(Product prod)
    {
        using (var context = new CollectionContext())
        {
            context.products.Add(prod);
            context.SaveChanges();
        }
    }

    public void Delete(int id)
    {
        using (var context = new CollectionContext())
        {
            context.products.Remove(context.products.Find(id));
            context.SaveChanges();
        }

    }

    public void Update(Product prod)
    {
        using (var context = new CollectionContext())
        {
            var product = context.products.Find(prod.Id);
            product.Title = prod.Title;
            product.Description = prod.Description;
            product.Price = prod.Price;
            context.SaveChanges();
        }
    }
}

