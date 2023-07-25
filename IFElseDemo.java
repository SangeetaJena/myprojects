/*      if(test condition)
        {
          block of code;
        }
        else
        {
          block of code;
        }                         */

//WAP to check the entered number is positive or negative.

import java.util.Scanner;

class IFElseDemo
{
   public static void main(String args[])
   {
     int num;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a number:=");
     num=sc.nextInt();
     if(num>0)
     {
       System.out.println("You have entered positive integer:"+num);
     }
     else
     {
        System.out.println("You have entered negative integer:"+num);
     }
   }
}


