using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using ThirdMVCApp.Models;
using Catlog;

namespace ThirdMVCApp.Controllers;

public class ProductController : Controller
{
    private readonly ILogger<ProductController> _logger;

    public ProductController(ILogger<ProductController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index()
    {
        Product p1 = new Product();
        p1.ID = 1;
        p1.Pro_name = "Shubham";
        p1.Description = "Creative";
        p1.Price = 1212.11;
        p1.Quantity = 7999;
        p1.Imageurl = "/Images/img.jpg";

        ViewData["flower"] = p1;

        return View();
    }


}
