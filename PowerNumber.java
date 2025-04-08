import java.util.Scanner;
class PowerNumber
{
   public static void main(String args[])
   {
       Scanner s = new Scanner(System.in);
       powNum obj = new powNum();
       System.out.println("enter number");
       int num = s.nextInt();
       int sum = obj.sumDigits(num);
       int product = obj.proDigits(num);
       if( sum == product)
          System.out.println(num+" Power Number");
       else
          System.out.println(num+" Not a Power Number");
   }
}
  
class powNum
{
   int sumDigits(int num)
   {
     int sum=0;
     while(num!=0)
     {
       int rem = num%10;
       sum = sum + rem;
       num = num/10;
     }
    return sum;
   }
   int proDigits(int num)
   {
     int pro = 1;
     while(num!=0)
     {
       int rem = num%10;
       pro = pro*rem;
       num = num/10;
     }
     return pro;
   }
}

