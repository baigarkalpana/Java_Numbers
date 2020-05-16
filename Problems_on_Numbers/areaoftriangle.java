/*
   Author:Kalpana Baigar
    program to calculating Area of Triangle
 */

import java.util.Scanner;

class math
{
	long area;
	 math(long base,long height)
	 {
		 area=(base*height)/2;
	 }
}


class Number
{
	public static void main(String args[]) //entry point function
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter width of a triangle");
		long b=s.nextLong();
		
		System.out.println("enter height of a triangle");
		long h=s.nextLong();
		math m=new math(b,h);
		
		System.out.println("area of triangle is:"+ m.area);
	}
	 
	
	
}
