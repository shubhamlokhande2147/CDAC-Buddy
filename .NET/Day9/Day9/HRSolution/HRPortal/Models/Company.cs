using System.ComponentModel.DataAnnotations;
namespace HRPortal.Models;
public class Company{
    [Required, MaxLength(80)]
    public string CompanyName{get;set;}
    public string CompanyContact{get;set;}
    public string Location{get;set;}
    public string Cusername{get;set;}
    public string Cpassword{get;set;}
}