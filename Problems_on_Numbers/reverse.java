/*
   Author:Kalpana Baigar
    program to reverse number
 */

import java.util.Scanner;       // Import the Scanner class


public class Number      
{
   public static void main(String[] args)
	{
		int inum;
		Scanner sobj=new Scanner(System.in);     // Create a Scanner object
		System.out.println("entered number:");
		inum=sobj.nextInt();
		System.out.println("entered number is:"+inum);
		int  digit=0,rev=0;
		
		 		while(inum!=0)
				{
					digit=inum%10;
					rev=rev*10+digit;
					inum=inum/10;
				}
				
		 		System.out.println("reverse number is:"+rev);
			
    }	
}
		
	  
