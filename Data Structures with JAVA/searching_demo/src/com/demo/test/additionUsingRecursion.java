package com.demo.test;
import java.util.Scanner;
public class additionUsingRecursion {
	public static int add(int n)
	{
		if(n<1)
		{
			return 0;
		}
		else
		{
			if(n==1)
			{
				return 1;
			}
			return n+add(n-1);
		}
	}
	public static int factorial(int num)
	{
		if(num == 0)
		{
			return 1;
		}
	    else if(num==1)
		{
			return num;
		}
		else
		{
			return num*factorial(num-1);
		}
	}
	public static int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        int left = 0;
        int right = nums.length-1;
        while(left<=right)
        {
            int mid = left+(right-left)/2;
         
            if(nums[mid]==target)
            {
            	System.out.println("...");
                if(ans[0]==0) 
                {
                	ans[0]=mid;
                	//left=mid+1;
                }
                else ans[1]=mid;
            }
            if(nums[mid]<=target)
            {
                left=mid+1;
            }
            if(nums[mid]>=target)
            {
                right =mid+1;
            }
        }
        if(ans[0]==0 && ans[1]==0)
        {
            ans[0]=-1;
            ans[1]=-1;
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number");
//		int num = sc.nextInt();
//		//int sum = add(num);
//		//System.out.println("Sum is "+ sum);
//		int fact = factorial(num);
//		System.out.println("Factorial is "+ fact);
		int nums[] = {5,7,7,8,8,10};
		int target = 8;
		int ans[] = searchRange(nums,target);
		System.out.println(ans[0]);
		System.out.println(ans[1]);
	}

}
