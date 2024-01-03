using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Runtime.CompilerServices;
using BOL;
using DAL;
using Org.BouncyCastle.Asn1.Misc;

IDBManager dbm = new DBManager();

bool status = true;
// Console based Menu driven User Interface
while (status)
{
    Console.WriteLine("Choose Option :");
    Console.WriteLine("1. Display  records");
    Console.WriteLine("2. Insert  new record");
    Console.WriteLine("3. Update existing record");
    Console.WriteLine("4. Delete existing record");
    Console.WriteLine("5. Exit");

    switch (int.Parse(Console.ReadLine()))
    {
        case 1:
            {
                List<Product> products = dbm.GetAll();

                foreach (var prod in products)
                {
                    Console.WriteLine(" Id: {0}, Title: {1}, Description: {2},Price:{3}",
                                        prod.Id, prod.Title, prod.Description, prod.Price);
                }
            }
            break;
        case 2:
            var newProd = new Product();
            Console.WriteLine("Enter Id: ");
            newProd.Id = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter Title: ");
            newProd.Title = Console.ReadLine();
            Console.WriteLine("Enter Description: ");
            newProd.Description = Console.ReadLine();
            Console.WriteLine("Enter Price: ");
            newProd.Price = double.Parse(Console.ReadLine());
            dbm.Insert(newProd);
            break;

        case 3:

            // {
            //     var updateProd = new Product()
            //     {
            //         Id = 2,
            //         Title = "Chicken Wings",
            //         Description = "Wingz are the best!",
            //         Price = 90
            //     };
            //     dbm.Update(updateProd);
            // }
            // break;

            var updtProd = new Product();
            Console.WriteLine("Enter Id: ");
            updtProd.Id = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter Title: ");
            updtProd.Title = Console.ReadLine();
            Console.WriteLine("Enter Description: ");
            updtProd.Description = Console.ReadLine();
            Console.WriteLine("Enter Price: ");
            updtProd.Price = double.Parse(Console.ReadLine());
            dbm.Update(updtProd);
            break;



        case 4:
            Console.WriteLine("Enter Id:");
            int id = int.Parse(Console.ReadLine());
            dbm.Delete(id);
            break;



        case 5:
            status = false;
            break;
    }
}


