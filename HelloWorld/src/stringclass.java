import java.util.*;
public class stringclass {

	public static void main(String[] args) {
		String str1="Hello";
		String str2="Hello";
		String str3=new String("Hello");
		System.out.println("str1==str2"+(str1==str2));//true
		System.out.println("str1.equals(str2)"+(str1.equals(str2))); //true
		System.out.println("str1==str3"+(str1==str3)); //false
		System.out.println("str1.equals(str3)"+(str1.equals(str3))); //true 
		String str4="Hella";
		String str5="he";
		System.out.println("str1==str4"+(str1==str4));
		System.out.println("str1==str4"+(str1.equals(str4)));
		System.out.println("compare to "+(str1.compareTo(str4))); // +ive
		System.out.println("compare to "+(str1.compareTo(str2)));
		System.out.println("compare to"+(str1.compareTo(str5))); //-ive
		String str6=str1+" World!";
		System.out.println(str6);
		char p[]= {'1','2','3','4','5'}; //converting char array to string
		String str7=new String(p);
		System.out.println(str7);
		System.out.println(str1.charAt(1)); //e
		System.out.println(str1.length()); //return length
		System.out.println(str1.substring(2));
		System.out.println(str1.substring(1,4));
		System.out.println(str6.contains(str1)); // true  find string if got return true else false
		
		
		
		
	}
}
