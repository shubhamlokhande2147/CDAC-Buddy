// See https://aka.ms/new-console-template for more information
using HR;
using Graphic;
Console.WriteLine("Hello, World!");
int cnt = 56;
cnt++;
int[] arr={54,76,67,45};
String fullname="Harshvardhan Wadavane";
Console.WriteLine(fullname);

var fname = "harsh";
var lname = "wadavane";
var x = 45;
Console.WriteLine(fname);
Console.WriteLine(lname);
Console.WriteLine(x);

if(cnt<100)
{
    Console.WriteLine("You are Extra ordinary");
}
else{
    Console.WriteLine("You are ordinary");
}

Boolean status = false;
char u='d';
Console.WriteLine(status);
Console.WriteLine(u);

for(int i=0;i<arr.Length;i++)
{
    Console.WriteLine(arr[i]);
}

Person p = new Person(2,"Shubham","Lokhande");
Console.WriteLine(p.ToString());
String str1=p.getFName();
Console.WriteLine(str1);
p.Lname = "Venky";
String str2 = p.getFName();
Console.WriteLine(p.ToString());
Console.WriteLine("----------------");
Color g = new Color(255,152,255);
Console.WriteLine(g);