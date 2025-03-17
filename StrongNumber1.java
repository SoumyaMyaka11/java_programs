import java.util.Scanner;
class StrongNumber1
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      System.out.println("enter number");
      int num = s.nextInt();
      int sum=0,temp = num;
      while(num!=0)
      {
         int rem = num%10;
         int fact=1;
          for(int start=1; start<=rem; start++)
          {
            fact = fact*start;
            
           }
          sum = sum + fact;
          num = num/10;    
      }
      if(sum == temp)
          System.out.println(temp+" is a strong number");
      else
          System.out.println(temp+" is not a strong number"); 
    }
}