namespace Notification;

public static class NotificationService
{

    public static void SendEmail(string To, string content)
    {
        Console.WriteLine("Send Email.....");
    }
    
    public static void SendSMS(string To, string content)
    {
        Console.WriteLine("Send SMS.....");
    }
    
    public static void SendWhatsApp(string To, string content)
    {
        Console.WriteLine("Send WhatsApp.....");
    }
}