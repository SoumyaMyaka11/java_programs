import java.util.Scanner;
class DigitFactorial
{
  public static void main(String args[])
  {
      Scanner s = new Scanner(System.in);
      System.out.println("enter number");
      int num = s.nextInt();
      while(num!=0)
      { 
         int fact=1;
         int rem = num%10;
         for(int start=1; start<=rem; start++)
         {
             fact = fact*start;
         }
         System.out.println("The factorial of "+rem+" is "+fact);
         num = num/10;
      }
   }
}
         
      