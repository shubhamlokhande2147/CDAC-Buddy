var builder = WebApplication.CreateBuilder(args);

builder.Services.AddControllersWithViews();

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
    pattern: "{controller}/{action=Index}/{id?}");

// ----or------
// app.MapControllerRoute(
//     name: "default",
//     pattern: "{controller=Product}/{action=Index}");


// app.MapControllerRoute(
//     name: "default",
//     pattern: "{controller=Product}/action=post/{id}");
app.Run();
