/*
   Author:Kalpana Baigar
    program to find factorial of a number
 */

import java.lang.*;
import java.util.Scanner;   


class Number
{
	public static void main(String args[])
	{
		int num,mult=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number :");
		num=s.nextInt();
		for(int i=num;i>=1;i--)
		{
			mult=mult*i;
		}
		
		System.out.println("factorial is :"+mult);
	}
	
	
	
}
