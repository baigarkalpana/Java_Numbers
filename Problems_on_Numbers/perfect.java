/*
   Author:Kalpana Baigar
    program to check number perfect is not
 */

import java.lang.*;
import java.util.Scanner;   


class Number
{
	public static void main(String args[])
	{
		int num,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number :");
		num=s.nextInt();
		int temp=num;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
				
			}
		}
		
		if(sum==temp)
		{		
			System.out.println("perfect number");
		}	
		
		else
		{		
			System.out.println("Not a perfect number");
		}	
	}
	
	
	
}
