using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using HRPortal.Models;

namespace HRPortal.Controllers;

public class StateMgmtController : Controller
{
    private readonly ILogger<StateMgmtController> _logger;

    public StateMgmtController(ILogger<StateMgmtController> logger)
    {
        _logger = logger;
    }
    private const string SessionName = "_Name";
    private const string SessionAge = "_Age";
    public IActionResult Index()
    {
        HttpContext.Session.SetString(SessionName, "Cdac");
        HttpContext.Session.SetInt32(SessionAge, 20);

        return View();
    }
    public IActionResult About()
    {
        ViewBag.Name = HttpContext.Session.GetString(SessionName);
        ViewBag.Age = HttpContext.Session.GetInt32(SessionAge);
        ViewData["Message"] = "ASP.NET Core!";
        return View();
    }
    public IActionResult Contact()
    {
        ViewData["Message"] = "Your contact page..";
        return View();
    }
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}