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
        List<string>Student = new List<string>();
        Student.Add("shubham");
        Student.Add("harsh");
        ViewData["Students"]=Student;
        return View();
    }

    public IActionResult Privacy()
    {
        List<string>Student = new List<string>();
        Student.Add("shubham");
        Student.Add("harsh");
        TempData["Students"] = Student;
        return View();
    }
    [HttpGet]
    public IActionResult Register()
    {

        return View();
    }
    [HttpPost]
    public IActionResult Register(string companyName, string companyContact)
    {
        Console.WriteLine(companyName + " "+companyContact);
                    return this.RedirectToAction("Login"); 

//        return View();
    }
    // public async IActionResult Register(string cName, string cContact, string cLocation, string cUsername,string cPassword)
    // {
    //     HRDbmanager.AddUserByDB(cName,cContact,cLocation,cUsername,cPassword);

    //     return View();
    // }
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
    public IActionResult Login(string userName,string password)
    {
        if(userName == "harsh" && password == "shubham")
        {
            return this.RedirectToAction("Welcome"); 
        } 
        return View();
    }
    public IActionResult Welcome()
    {
        List<string>Student = new List<string>();
        Student.Add("shubham");
        Student.Add("harsh");
        ViewBag.Students = Student;

        return View();
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
