namespace BOL;
public class Product
{
    public Product(){

    }
    public Product(int id, string name, string desc, int qty, int price)
    {
        this.Id = id;
        this.name = name;
        this.description = desc;
        this.qty = qty;
        this.price = price;
    }
    public int Id { get; set; }
    public string name { get; set; }
    public string description { get; set; }
    public int qty { get; set; }
    public int price { get; set; }

}