import java.util.Scanner;
class StrongNumber
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      System.out.println("enter number");
      int num = s.nextInt();
      int temp = num;
      while(num!=0)
      {
         int rem = num%10;
         int fact=1;
          for(int start=1; start<=rem; start++)
          {
            fact = fact*start;
           }
          if(fact == rem)
                 System.out.println(rem+" is strong number");
          num = num/10;
       }
                
    }
}