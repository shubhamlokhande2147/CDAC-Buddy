namespace util;
using System.Threading;

public static class Helper{
    //non blocking class
    public static async Task StoreDate()
    {
        await Task.Run(()=>{
            Console.WriteLine("Storing Data into JSON file");
            Console.WriteLine(Thread.CurrentThread.ManagedThreadId);
        });
    }
    public static async Task GetRemoteData()
    {
        await Task.Run(()=>{
            Console.WriteLine("Get Data from external world");
            Console.WriteLine(Thread.CurrentThread.ManagedThreadId);
        });
    } 
}