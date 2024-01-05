// using System.Diagnostics;
// using Microsoft.AspNetCore.Mvc;
// using HRPortal.Models;
// using BLL;
// namespace ReactWithWebAPIApp.Controllers;
// [ApiController]
// [Route("[controller]")]
// public class ProductController : ControllerBase
// {
//     private readonly ILogger<ProductController> _logger;

//     public ProductController(ILogger<ProductController> logger)
//     {
//         _logger = logger;
//     }

//     [HttpGet]
//     public IEnumerable<Product> func()
//     {
//         CatalogManager cd = new CatalogManager();
//         List<Product> list = cd.GetAllProduct();
//         return list.ToArray();
    
//     }
//     //[HttpGet("{Id}")]
//     // public Product GetById(int id)
//     // {

//     // }
// }

using Microsoft.AspNetCore.Mvc;
//using BOL;
using BLL;
using pp;
namespace ReactWithWebAPIApp.Controllers;

[ApiController]
[Route("[controller]")]
public class ProductsController : ControllerBase
{ 
    private readonly ILogger<ProductsController> _logger;
    public ProductsController(ILogger<ProductsController> logger)
    {
        _logger = logger;
    }

    [HttpGet]
    public IEnumerable<Product> Get()
    {
        CatalogManager cd = new CatalogManager();
        List<Product> list = cd.GetAllProduct();
        return list.ToArray();
    }

    // [HttpGet("{id}")]        
    // public Product GetById(int id)
    // {
      
      
    // }
}