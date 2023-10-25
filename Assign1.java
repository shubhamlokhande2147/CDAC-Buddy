
import java.util.*;
class Assign1
{
    public static void mulitpication(int num)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(num*i);
        }
    }
    public static void prime(int num)
    {
        int flag=1;
        for(int i=2;i<Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                flag=0;
            }
            if(flag==0)
            {
                System.out.println("No is not prime");
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("No is Prime");
        }
    }

    public static void pattern(int number)
    {
 
        int m, n;
 
        // Outer loop 1
        // prints the first half diamond
        for (m = 1; m <= number; m++) {
 
            // Inner loop 1 print whitespaces inbetween
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }
 
            // Inner loop 2 prints star
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
 
            // Ending line after each row
            System.out.println();
        }
 
        // Outer loop 2
        // Prints the second half diamond
        for (m = number - 1; m > 0; m--) {
 
            // Inner loop 1 print whitespaces inbetween
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }
 
            // Inner loop 2 print star
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
 
            // Ending line after each row
            System.out.println();
        }
	



    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
  
        while(true){
        System.out.println("\t \t Enter choices \t \t");
        System.out.println("1: Multiplication table \t 2:Check Prime \t 3: Print Diamond Pattern \t 4: exit");
        System.out.println("Enter Choice ");
        int choice=sc.nextInt();
        System.out.println("You Entered ");
        System.out.print(choice);
        if (choice==1)
        {
            System.out.println("Enter number\t");
            int num1=sc.nextInt();
            mulitpication(num1);
        }
        else if(choice==2)
        {
            System.out.println("Enter number");
            int num2=sc.nextInt();
            prime(num2);   
        }
        else if(choice==3)
        {
            System.out.println("Enter number");
            int num3=sc.nextInt();
            pattern(num3);   
        }
        else 
        {
            System.exit(0);
        }
    
        }
    }

}