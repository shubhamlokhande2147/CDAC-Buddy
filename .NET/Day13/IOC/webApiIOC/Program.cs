using  IOCWebApp.Controllers;
using dept;
using BOL;
var builder = WebApplication.CreateBuilder(args);
builder.Services.AddControllersWithViews();
builder.Services.AddSingleton<IDeptService, DeptService>();
// Add services to the container.
// Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
// builder.Services.AddEndpointsApiExplorer();
// builder.Services.AddSwaggerGen();

var app = builder.Build();

// Configure the HTTP request pipeline.
if (app.Environment.IsDevelopment())
{
    app.UseHsts();
}

app.UseHttpsRedirection();
app.UseStaticFiles();
app.UseRouting();
app.MapControllerRoute(
                     name: "default",
                     pattern:"{contoller}/{action}"
                
);
DeptManager dp = new DeptManager();
Console.WriteLine("Hiiiiiiiiii");
  List<Department> d = dp.getAll();
  foreach (Department item in d)
  {
     Console.WriteLine(item);
  }

// app.UseHttpsRedirection();

// var summaries = new[]
// {
//     "Freezing", "Bracing", "Chilly", "Cool", "Mild", "Warm", "Balmy", "Hot", "Sweltering", "Scorching"
// };

// app.MapGet("/weatherforecast", () =>
// {
//     var forecast =  Enumerable.Range(1, 5).Select(index =>
//         new WeatherForecast
//         (
//             DateOnly.FromDateTime(DateTime.Now.AddDays(index)),
//             Random.Shared.Next(-20, 55),
//             summaries[Random.Shared.Next(summaries.Length)]
//         ))
//         .ToArray();
//     return forecast;
// })
// .WithName("GetWeatherForecast")
// .WithOpenApi();
// app.MapGet("/api/Department",()=>{

//  DepartmentController cc = new DepartmentController();
//   cc.GetProducts();
   
// // });
// app.UseHttpsRedirection();
// app.UseStaticFiles();
// app.UseRouting();
// app.MapControllerRoute(
//     name: "default",
//     pattern: "{controller=Department}/{action=GetProducts}");
app.Run();

record WeatherForecast(DateOnly Date, int TemperatureC, string? Summary)
{
    public int TemperatureF => 32 + (int)(TemperatureC / 0.5556);
}

