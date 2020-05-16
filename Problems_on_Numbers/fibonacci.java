/*
   Author:Kalpana Baigar
    program to printing fibonacci series
 */

import java.lang.*;
import java.util.Scanner;   


class Number
{
	public static void main(String args[])
	{
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number :");
		num=s.nextInt();
		int first=0,second=1,i,sum=0;
		 System.out.print(first+" "+second);
		
		for(i=2;i<num;i++)
		{
		
		  sum=first+second;
		  System.out.print(" "+sum); 
		  first=second;
		  second=sum;
		  
	    }	
	}
	
	
	
}
