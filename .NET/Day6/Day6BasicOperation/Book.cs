namespace Book;
public class BookStore{
    private string[] sarr;
    public BookStore()
    {
        sarr = new string[5];
        this.sarr[0] = "Rich Dad, Poor Dad";
        this.sarr[1] = "Hello buddy";
        this.sarr[2] = "AgniPankha";
        this.sarr[3] = "Java-maven";
        this.sarr[4] = "Let is C";
    }

    public string this[int index]{
        get{return sarr[index];}
        set{sarr[index]=value;}
    }
}