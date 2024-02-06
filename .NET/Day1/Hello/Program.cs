using bank; 

// See https://aka.ms/new-console-template for more information
Console.WriteLine("Hello, World!");


Account acc = new Account(50000,"Om");
Console.WriteLine(acc);
acc.nam = " vivek";
Console.WriteLine(acc);

Console.WriteLine(acc.getbalance());

acc.Withdraw(10001);
Console.WriteLine(acc.getbalance());

acc.Deposit(122323);
Console.WriteLine(acc.getbalance());


