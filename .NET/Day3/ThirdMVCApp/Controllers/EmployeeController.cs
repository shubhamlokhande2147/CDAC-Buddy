using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using ThirdMVCApp.Models;
using HR;

namespace ThirdMVCApp.Controllers;

public class EmployeeController : Controller
{
    private readonly ILogger<EmployeeController> _logger;

    public EmployeeController(ILogger<EmployeeController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index()
    {
         //default constructor
       //Employee emp = new Employee();
       //ViewData["Employee"] = emp;

   //para constructor
    //    Employee emp2 = new Employee(25,"Omkar","HR","Banking");
    //    ViewData["Employee"] = emp2;

        //default constructor
    //    WageEmployee wemp2 = new WageEmployee();
    //    ViewData["Employee"] = wemp2;

   //para constructor
    //    WageEmployee wemp2 = new WageEmployee(25,"Omkar","HR","Banking",100);
    //    ViewData["Employee"] = wemp2;

        //default constructor
        SalesEmployee wemp2 = new SalesEmployee();
        ViewData["Employee"] = wemp2;




        return View();
    }

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
