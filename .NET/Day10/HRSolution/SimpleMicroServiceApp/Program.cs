using activities;
using BOL;
var builder = WebApplication.CreateBuilder(args);
var app = builder.Build();

app.MapGet("/", () => "Hello World!");
app.MapGet("/api/harsh", () => "This is harsh's page");
app.MapGet("/api/object", () => new{ID=1,Title="sarwah",Description="IT Company",UnitPrice="20"});
app.MapGet("/api/activity", () => {
    List<Product> list = DBmanager.GetAllProduct();
    return list;
});

app.MapGet("/api/shubham",()=> "Shubham Lokhande");
app.MapGet("/api/activity/{id}",   (int id) =>{

});
app.MapPost("/api/post", async (Product Product) =>
{
    return Results.Created($"/srs/{Product.Id}", Product);
});

// app.MapGet("/api/shubham/{Id}",(int id) => { Product q = new Product();
//                                       q.name;});
app.Run();
