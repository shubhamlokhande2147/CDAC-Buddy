using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Portal.Models;
using System.Collections.Generic;
using BOL;
using DAL;
using BLL;


namespace Portal.Controllers;

public class ProductController : Controller
{
    private readonly ILogger<ProductController> _logger;

    public ProductController(ILogger<ProductController> logger)
    {
        _logger = logger;
    }

    public IActionResult Product()
    {

        ProductManager mgr=new ProductManager();
        List<Product> allProducts=mgr.GetAllProducts();
        //View Data is a Dictionary Object
        //data is maintained inside dictionary using key - Value pair
        this.ViewData["prod1"]=allProducts;
        return View();
    }
        [HttpGet]

    public IActionResult AddProduct()
    {

       // Product p = new Product();

        // ProductManager mgr=new ProductManager();
        // List<Product> allProducts=mgr.GetAllProducts();
        // //View Data is a Dictionary Object
        // //data is maintained inside dictionary using key - Value pair
        // this.ViewData["prod1"]=allProducts;
        return View();
    }

     [HttpPost]

    public IActionResult AddProduct(string id,string name,string desc,string qty,string price)
    {

        Product p = new Product();
        p.Id = int.Parse(id);
        p.Name = name;
        p.Description = desc;
        p.Qty = int.Parse(qty);
        p.Price = int.Parse(price);
       
       // ViewData["prod2"] = p;
       ProductDBManager.InsertData(p);
       
       Console.WriteLine(id + " " + name);
        //return View();
        return this.Redirect("/Product/Product");
    }


    // public IActionResult Privacy()
    // {
    //     return View();
    // }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
