import java.util.*;
public class stringclass {

	public static void main(String[] args) {
		
	
		String s1 = new String("Shubham Kiran Lokhande"       );
		String s2 = new String("abc pqr xyz");
		String s3;
		
		System.out.println(s1.charAt(10));  //char at this position
		System.out.println(s1.codePointAt(10)); //ascii val off this position
		System.out.println(s1.codePointBefore(10)); //ascii of previous char at position
		System.out.println(s1.codePointAt(10));
		
		System.out.println(s1.compareTo(s2));  //display here substraction of ascii
		System.out.println(s1.concat(" ").concat(s2)); //concat two strings
		
		System.out.println(s1.contains(s2)); //check char of sequence
		System.out.println(s1.contentEquals(s2)); //check contents
		
		//s2=s2.copyValueOf(s1,0,5);
		//System.out.println(s1.copyValueOf(s2));
		
		System.out.println(s1.equals(s2)); //compare both strings
		System.out.println(s1.equalsIgnoreCase(s2)); //compare two strings with ignaore case sensitivity
		
		//System.out.println(s1.format(null, s2, args));
		//System.out.println(s1.getChars(0, 1, s1, 5));
		
		System.out.println(s1.hashCode()); //disp hashcode of s1
		System.out.println(s1.indexOf(1));
		System.out.println(s1.lastIndexOf(0));
		
		System.out.println(s1.intern()); //show s1
		System.out.println(s1.isEmpty()); //check string is empty or not
		System.out.println(s1.length()); //show length of string
		
		System.out.println(s1.matches(s1));
		System.out.println(s1.replace('s','p'));//replace char
        System.out.println(s1.substring(7,20)); //substring os s1

		System.out.println(s1.toLowerCase());//lowercase
		System.out.println(s1.toUpperCase());//uppercase

		System.out.println(s1.trim()); //remove whitespaces
		System.out.println(s1.valueOf("shubham")); //show specified String

	}
}
