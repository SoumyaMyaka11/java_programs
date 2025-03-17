import java.util.Scanner;
class PrimeAlt
{
  public static void main(String args[])
  {
     Scanner s = new Scanner(System.in);
     System.out.println("enter number");
     int num = s.nextInt();
     while(num!=0)
     {
        int rem = num%10;
        int count =0;
        for(int start=2; start<=rem/2; start++)
        {
           if(rem%2==0)
           {
              count++;
              break;
           }
        }
        if(count==0 && rem>=2)
              System.out.println(rem+" is prime");
        num = num/10;
        num = num/10;
     }
  }
}