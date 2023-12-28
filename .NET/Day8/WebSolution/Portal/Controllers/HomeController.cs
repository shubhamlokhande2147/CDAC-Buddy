using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Portal.Models;
using Portal.Controllers;

namespace Portal.Controllers;

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

 

    [HttpGet]
    public IActionResult Login()
    {
        return View();
    }

    
    [HttpPost]

    public IActionResult Login(string userName, string password)
    { 
        if(userName == "admin" && password == "admin")
        {
            return this.Redirect("/Product/Product");
        }
          return View();
       
    }

  [HttpGet]
    public IActionResult Register()
    {
        return View();
    }
    
    // [HttpPost]

    // public IActionResult Register()
    // { 
    //       return View();
       
    // }

    public IActionResult Privacy()
    {
        return View();
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
