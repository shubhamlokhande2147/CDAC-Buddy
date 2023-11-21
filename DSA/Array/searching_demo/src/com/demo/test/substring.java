package com.demo.test;

public class substring {

	public static void main(String[] args) {
		
		public class Main
		{
			public static void main(String[] args) {
				System.out.println("Hello World");
			
			    int i =0;
		        int j= i+1;
		        String str ="111";
		        String s1 = "";
		        while(i < str.length()-1)
		        {
		            s1 = str.substring(i,j+1);
		            if(s1.length()>1)
		            {
		                System.out.println(s1);    
		            }

		            j++;
		        
		            if(j == str.length())
		            {   
		                j=i+1;
		                i++;
		            }
		        }
			}
		}

	}
	 
	
}
