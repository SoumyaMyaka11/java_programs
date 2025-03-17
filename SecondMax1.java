import java.util.Scanner;
class SecondMax1
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter number");
      int num = s.nextInt();
      int max =-1,temp = num, second_max=-1;
      while(num!=0)
      {
         int rem = num%10;//320
         if(rem>max)//1>0 2>1t 3>2t 
         {
            second_max = max;//0 
	    max = rem;//0 2 3
         }
         else if( rem>second_max && rem!=max)//0>0f 2>0
         {
             second_max = rem;
          }
         num = num/10;
      }
      System.out.println("maximum digit in "+temp+" is "+max);
      if(second_max == -1)
          System.out.println("Their is no second maximum digit in "+temp);
      else
           System.out.println("second maximum digit in "+temp+" is "+second_max);
   }  
}
 
