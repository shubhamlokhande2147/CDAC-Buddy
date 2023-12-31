using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using BookPortal.Models;
using DAL.Connected;
using BookPortal.BOL;
namespace BookPortal.Controllers;

public class StoreController : Controller
{
    private readonly ILogger<StoreController> _logger;

    public StoreController(ILogger<StoreController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index()
    {
        return View();
    }
    [HttpGet]
    public IActionResult AddBook()
    {
        return View();
    }
    [HttpPost]
    public IActionResult AddBook(int name1, string name2, string name3, int name4)
    {
        bool status = DBManager.AddBookByDB(name1, name2, name3, name4);
        if (status)
        {
            return Redirect("Index");
        }
        return View();
    }

    [HttpGet]
    public IActionResult UpdateBook()
    {
        return View();
    }

    [HttpPost]
    public IActionResult UpdateBook(int uname1, string uname2, string uname3, int uname4)
    {
        Book b = new Book(uname1, uname2, uname3, uname4);
        bool status = DBManager.UpdateBookByID(b);

        if (status)
        {
            return Redirect("Index");
        }

        return View();
    }
    [HttpGet]
    public IActionResult DeleteBook()
    {
        return View();
    }

    [HttpPost]
    public IActionResult DeleteBook(int dname1)
    {
        bool status = DBManager.DeleteBookByID(dname1);

        if (status)
        {
            Console.WriteLine("Successfully deleted");
            return Redirect("Index");
        }

        return View();
    }



    public IActionResult GetBook(int Gname1)
    {
        List<Book> b1 = DBManager.FindBookByID(Gname1);
        ViewData["b"] = b1;
        // if (b != null)
        // {
        //     Console.WriteLine("Successfully Finded");
        //     ViewData["b"] = b;
        //     return View();
        // }

        return View();
    }
    public IActionResult GettAll()
    {
        List<Book> b1 = DBManager.GetAllBook();
        ViewData["b"] = b1;

        return View();
    }
}
