import java.util.Scanner;
class PerfectNumber
{
   public static void main(String args[])
   {
         Scanner s = new Scanner(System.in);
         System.out.println("Enter number");
         int num = s.nextInt();
         int sum=0 ,product=1;
         for(int start=1; start<=(num-1); start++)
         {
            if(num%start==0)
             {
                sum = sum+start;
                product = product*start;
             }

         }
         if(sum == product)
               System.out.println(num+" is perfect number");     
   }
}
         
         
