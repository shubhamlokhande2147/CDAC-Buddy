using System.ComponentModel.DataAnnotations;
namespace HRPortal.Models;
public class Company
{
    public Company()
    {

    }
    public Company(string CompanyName, string CompanyContact, string Location, string Cusername, string Cpassword)
    {
        this.CompanyName = CompanyName;
        this.CompanyContact = CompanyContact;
        this.Location = Location;
        this.Cusername = Cusername;
        this.Cpassword = Cpassword;
    }
    [Required, MaxLength(80)]
    public string CompanyName { get; set; }
    public string CompanyContact { get; set; }
    public string Location { get; set; }
    public string Cusername { get; set; }
    public string Cpassword { get; set; }
}