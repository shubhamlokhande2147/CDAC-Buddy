using BOL;
using Microsoft.EntityFrameworkCore;

namespace IOCWebApp.Contexts
{
    public class CollectionContext:DbContext{
    public DbSet<Department> Departments {get;set;}
    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        // string conString="server=192.168.10.150;user=dac54;password=welcome;database=dac54";
       string conString= @"server=192.168.10.150;uid=dac54;" +  "pwd=welcome;database=dac54";
        optionsBuilder.UseMySQL(conString);
    }

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        base.OnModelCreating(modelBuilder);
        modelBuilder.Entity<Department>(entity => 
        {
            Console.WriteLine(entity);
          entity.HasNoKey();
          entity.Property(e => e.dname).IsRequired();
          entity.Property(e => e.location).IsRequired();
        });
    }
    }
}