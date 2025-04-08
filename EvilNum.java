import java.util.Scanner;
class EvilNumber
{
   public static void main(String args[])
   {
       Scanner s = new Scanner(System.in);
       NumEv obj = new NumEv();
       System.out.println("enter number");
       int num = s.nextInt();
       int res = obj.numSquare(num);
       int sum1 = obj.sumSquare(res);
       if( sum1 == num)
          System.out.println(num+" is Evil Number");
       else
          System.out.println(num+" is not Evil Number");
   }
}

class NumEv
{
   int numSquare(int num)
   {
      return (num*num);
   }
   int sumSquare(int square)
   {
     int sum =0;
     while(square!=0)
     {
       int rem = square%10;
       sum = sum + rem;
       square = square/10;
     }
     return sum;
   }
}