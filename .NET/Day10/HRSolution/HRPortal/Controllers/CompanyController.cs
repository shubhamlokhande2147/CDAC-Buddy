using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using HRPortal.Models;
using DAL;

namespace HRPortal.Controllers;

public class CompanyController : Controller
{
    private readonly ILogger<CompanyController> _logger;

    public CompanyController(ILogger<CompanyController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index()
    {

         List<Company> companies=HRDbmanager.GetAllCompanyByDB();
        ViewData["company"]=companies;
        return View();
    }

   
    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}