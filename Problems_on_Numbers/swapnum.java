/*
   Author:Kalpana Baigar
    program to swap two number using Interface
 */

import java.util.Scanner;       // Import the Scanner class

interface swap
{
	void sdisplay();
}
class Number implements swap    
{    
	int x,y;
  public void sdisplay(int x,int y)  //function defination
	{
		int temp=x;
		x=y;
		y=temp;
		System.out.println("after swapping no1 is: " + x +", no2 is: "+y);
	}
	
	
	
   public static void main(String[] args)
	{
		int no1,no2;
		Scanner sobj=new Scanner(System.in);     // Create a Scanner object
		System.out.println("enter two number:");
		no1=sobj.nextInt();
		no2=sobj.nextInt();
		System.out.println("entered number is:" + no1 +",and" +no2);
		Number obj=new Number();
		obj.sdisplay(no1,no2);
		     
		//System.out.println("after swapping no1 is: " + no1 +", no2 is: "+no2);  //printing digits
					        
			
		      
	   
	}
}
