/*
   Author:Kalpana Baigar
    program to check wether number is armstrong or not
 */

import java.lang.*;
import java.util.Scanner;   

interface palindrome
{
	void display();
}
class Number implements palindrome
{
       
        
      int  digit=0;
	    void display(int inum)   
		 {
		 	int temp=inum;
		 	int sum=0;
		 	while(inum!=0)
		 	{
			 
		 	   
		 		digit=inum%10;
				int rev = digit*digit*digit;
				sum=sum+rev;
				inum=inum/10;
            }
             if(temp==sum)
             {
            	 System.out.println("Armstrong number");
			 }
             else
             {
            	 System.out.println("Not a Armstrong number");	
             }
			
		   } 	

   public static void main(String args[]) 
    {
         
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the number:");
      int num= s.nextInt();
      Number x=new Number();
      x.display(num);      
    }
 


 }























