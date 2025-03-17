import java.util.Scanner;
class DigitPrime
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      System.out.println("enter number");
      int num = s.nextInt();
      System.out.println("the prime numbers in "+num+" are ");
      while(num!=0)
      {  
         int count=0;
         int rem = num%10;
         for(int start=2; start<=rem/2; start++)
         {
	     if(rem%start==0)
                   count++;
                   break;
         }
         if(count==0 && rem>=2)
                 System.out.println(rem);
         num = num/10;
       }

    }
}
 
      