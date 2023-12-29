using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using HRPortal.Models;
using DAL;

namespace HRPortal.Controllers;

public class EmployeeController : Controller
{
    private readonly ILogger<EmployeeController> _logger;

    public EmployeeController(ILogger<EmployeeController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index()
    {

        List<Employee> employees = HRDbmanager.GetAllEmployee();
        ViewData["employees"] = employees;
        return View();
    }
    public IActionResult List(){
      
       List<Employee> employees=HRDbmanager.GetAllEmployee();
       //Attach model object using View inbuilt method
       return View(employees);

    }
    [HttpGet]
    public IActionResult Edit(int id)
    {
        List<Employee> elist = HRDbmanager.GetAllEmployee();
        var e = elist.Find((emp) => emp.Id == id);
        return View(e);
    }
    [HttpPost]
    public IActionResult Edit(Employee emp){   
        Console.WriteLine(emp.Id+ " " + emp.FirstName);
        if (emp != null && ModelState.IsValid) { 
            return RedirectToAction("List");
        } 
        else      
        return View();
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}