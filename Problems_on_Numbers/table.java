/*
   Author:Kalpana Baigar
    program to printing table
 */

import java.lang.*;
import java.util.Scanner;   


class Number
{
	public static void main(String args[]) //entry point function
	{
		int num; 
		Scanner s=new Scanner(System.in); 
		System.out.println("enter number :");
		num=s.nextInt();
		System.out.println("multiplication is:");
    	
		for(int i=1;i<=10;i++)
		{ 
        	
        	System.out.println(num+"*"+i+"="+num * i);

	    }	
	}
	
	
	
}
