import java.util.Scanner;
class DigitPerfect1
{
  public static void main(String args[])
  {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the number");
      int num = s.nextInt();
      int temp=num,max_perfect=0;
      while(num!=0)
      {
         int rem = num%10;
         int square = (int)Math.sqrt(rem);
         if(square*square == rem)
              if(rem>max_perfect)
                   max_perfect = rem;
         num = num/10;
      }
      System.out.println("maximum perfect square in "+temp+" is "+max_perfect);
      num = temp;
      int min_perfect=max_perfect;
      while(num!=0)
      {
        
         int rem = num%10;
         int square = (int)Math.sqrt(rem);
         if(square*square == rem)
               if(rem<min_perfect)
                      min_perfect = rem;
         num = num/10;
       }
        System.out.println("minimum perfect square in "+temp+" is "+min_perfect);
                    
  }    
} 