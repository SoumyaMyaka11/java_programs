import java.util.Scanner;
class AutomaticNumber
{
   public static void main(String args[])
   {
       Scanner s = new Scanner(System.in);
       NumAtuomatic obj = new NumAtuomatic();
       System.out.println("enter number");
       int num = s.nextInt();
       int lastdigits_square = obj.numSquare(num);
       if( num == lastdigits_square )
          System.out.println(num+" AutomaticNumber ");
       else
          System.out.println(num+" Not a AutomaticNumber");
   }
}

class NumAtuomatic
{
   int numSquare(int num)
   {
       int square = num*num;
       int power = (int)Math.pow(10, count(num));
       return  square%power;
  }
  int count(int num)
  {
     int count=0;
     while(num!=0)
     {
       count++;
       num = num/10;
     }
     return count;
  }
}