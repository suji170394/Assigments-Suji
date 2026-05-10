package org.testleaf.week1.day1;

public class palindrome 
{
    public static void main(String[] args) 
    {
      int input = 1771;
      int output =0;
      int rem;
      for (int i=input;i>0;i=i/10) 
        {
         rem= i%10;
         output=(output*10)+rem;
         System.out.println("output"+output); 
        } 
      {
        if(input==output)
            System.out.println("NUmber is palindrome");
        else
            System.out.println("Number is not palindrome");
        
      } 
    }
}
