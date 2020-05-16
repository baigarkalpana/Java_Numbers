/*
   Author:Kalpana Baigar
   program accepting one number and displaying wether the number is positive 
   or negative or zero
 */

import java.util.*;

public class Number 
{
   public static void main(String[] args)
	{
		int no1;
		Scanner sobj =new Scanner(System.in);
		System.out.println("enter number");
        no1=sobj.nextInt();
        System.out.println("your entered number is:"+no1);
        
        if(no1>0)
        {
        	System.out.println("\nnumber is positive");
        	
        }
       
        else if(no1==0)
        {
        	System.out.println("\nnumber is zero");
        	
        }
        
        else
        {
        	System.out.println("\nnumber is negative");
        	
        }
        	
	}
}
