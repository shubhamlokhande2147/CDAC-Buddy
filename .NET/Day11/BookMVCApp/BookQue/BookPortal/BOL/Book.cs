namespace BookPortal.BOL;
public class Book{
    public Book(){

    }
    public Book(int id,string Bname,string Author, int price)
    {
        this.Id = id;
        this.Bname = Bname;
        this.Author = Author;
        this.price = price;
    }
    
    public int Id{get;set;}
    public string Bname{get;set;}
    public string Author{get;set;}
    public int price{get;set;}

}