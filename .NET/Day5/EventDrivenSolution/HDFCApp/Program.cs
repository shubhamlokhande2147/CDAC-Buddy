using banking;
using Notification;
using Taxation;

// See https://aka.ms/new-console-template for more information
Console.WriteLine("Hello, World!");


Account acct = new Account();
acct.Balance = 20000;
float CurrentBalance = acct.Balance;
Console.WriteLine("Latest Balance : " + CurrentBalance);
acct.Deposit(4500);
CurrentBalance = acct.Balance;
Console.WriteLine("Latest Balance : " + CurrentBalance);
acct.Withdraw(100);
CurrentBalance = acct.Balance;
Console.WriteLine("Latest Balance : " + CurrentBalance);


Console.WriteLine("----------------------------- Direct Call --------------------------");
//Direct call
NotificationService.SendEmail("Sourabh","Our Project is Done and You are Selected in Cupa with 15LPA");
NotificationService.SendSMS("Sourabh","Our Project is Done and You are Selected in Cupa with 15LPA");

TaxationService.PayIncomeTax(40000);
Console.WriteLine("Latest Balance : " + CurrentBalance);


Console.WriteLine("----------------------------- InDirect Call --------------------------");
//Indirect call
//proxyIncomeTax object of delegate TaxOperation
//here,pass address of function in TaxOperation delegate
TaxOperation proxyIncomeTax = new TaxOperation(TaxationService.PayIncomeTax);
proxyIncomeTax(50000);

NotificationOperation proxySendEmail = new NotificationOperation(NotificationService.SendEmail); 
proxySendEmail("Sourabh","Our Project is Done and You are Selected in Cupa with 15LPA");

NotificationOperation proxySendSMS = new NotificationOperation(NotificationService.SendSMS); 
proxySendSMS("Sourabh","Our Project is Done and You are Selected in Cupa with 15LPA");



Console.WriteLine("----------------------------- Fire Event --------------------------");

Account ac = new Account();
ac.OverBalance += Taxation.TaxationService.PayIncomeTax;
ac.OverBalance += Taxation.TaxationService.PayServiceTax;
ac.OverBalance += Taxation.TaxationService.PayGSTTax;


ac.UnderBalance += Notification.NotificationService.SendEmail;
ac.UnderBalance += Notification.NotificationService.SendSMS;
ac.UnderBalance += Notification.NotificationService.SendWhatsApp;

ac.Balance = 150000;
Console.WriteLine("Current Balance : " + ac.Balance);

ac.Deposit(250000);
float CurBal = ac.Balance;
Console.WriteLine("Latest Balance : " + CurBal);

ac.Withdraw(386000);
CurBal = ac.Balance;
Console.WriteLine("Latest Balance : " + CurBal);







