/*
   Author:Kalpana Baigar
    program to break integer into digits
 */

import java.util.Scanner;       // Import the Scanner class


public class Number      
{
   public static void main(String[] args)
	{
		int no1;
		Scanner sobj=new Scanner(System.in);     // Create a Scanner object
		System.out.println("entered number:");
		no1=sobj.nextInt();
		System.out.println("entered number is:"+no1);
		    int digit=0;           
			int cnt=1;    
			while(no1!=0)       
			{
				digit=no1%10;
				System.out.println("digit at place " +cnt +" is "+digit);  //printing digits
		        cnt++;            //incremented by 1
		        no1=no1/10;
			}
		
	   
	}
}
