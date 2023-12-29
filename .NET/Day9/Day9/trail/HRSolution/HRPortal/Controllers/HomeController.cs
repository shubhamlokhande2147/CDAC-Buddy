using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using HRPortal.Models;

namespace HRPortal.Controllers;
using DAL;
public class HomeController : Controller
{
    private readonly ILogger<HomeController> _logger;

    public HomeController(ILogger<HomeController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index()
    {
        return View();
    }

    public IActionResult Privacy()
    {
        return View();
    }
    [HttpGet]
    public IActionResult Register()
    {

        return View();
    }
    [HttpPost]
//     public IActionResult Register(string companyName, string companyContact)
//     {
//         Console.WriteLine(companyName + " "+companyContact);
//                     return this.RedirectToAction("Login"); 

// //        return View();
//     }
    public IActionResult Register(string cName, string cContact, string cLocation, string cUsername,string cPassword)
    {
        HRDbmanager.AddUserByDB(cName,cContact,cLocation,cUsername,cPassword);

        return View();
    }
    [HttpGet]
    public IActionResult Login()
    {
        return View();
    }
   
    [HttpPost]
    
    // public IActionResult Login(string userName,string password)
    // {
    //     if(userName == "harsh" && password == "shubham")
    //     {
    //         return this.RedirectToAction("Welcome"); 
    //     } 
    //     return View();
    // }
    // public IActionResult Login(string userName,string password)
    // {
    //     if(userName == "harsh" && password == "shubham")
    //     {
    //         return this.RedirectToAction("Welcome"); 
    //     } 
    //     return View();
    // }
    public IActionResult Login(string userName,string password)
    {
        bool status = HRDbmanager.ValidateUser(userName,password);
        if(status)
        {
            return this.RedirectToAction("Welcome");
        }
        return View();
    }
    public IActionResult Welcome()
    {
        return View();
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
