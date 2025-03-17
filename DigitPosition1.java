import java.util.Scanner;
class DigitPosition1
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the number");
      int num = s.nextInt();
      int temp = num,count=0;
      System.out.println("Enter the position of number");
      int position = s.nextInt();
      int power = (int)Math.pow(10,(position-1));
      int quotient = num/power;
      int digit = quotient%10;
      System.out.println("The digit in "+position+" position of "+temp+" is "+digit);
      while(num!=0)
      {
         int rem = num%10;
         if(rem == digit)
         {
            count++;
         }
         num = num/10;
      }
      System.out.println("The count of "+digit+" in "+temp+" is "+count);
   }
}