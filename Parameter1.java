import java.util.Scanner;
class P1arameter1
{
  public static void main(String args[])
  {
     Scanner s = new Scanner(System.in);
     Prime p = new Prime();
     System.out.println("enter number");
     int num = s.nextInt();
     int res = p.calCount(num);
     System.out.println(p.isPrime(res,num));;
  }
}
 
class Prime
{
    int calCount(int num)
    {
         int count=0;
         for(int start=2; start<=num/2; start++)
         {
              if(num%start==0)
              {
                count++;
                break;
              }
         }
         return count;
      }
     String isPrime(int count, int num)
     {
          if(count==0 && num>=2)
                  return "PRIME";
          else
                 return "NOT PRIME";
     }
}