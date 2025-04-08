import java.util.Scanner;
class PrimeRange11
{
   public static void main(String args[])
   {
       Scanner s = new Scanner(System.in);
       PrimeNum obj = new PrimeNum();
       System.out.println("enter start value");
       int x = s.nextInt();
       System.out.println("enter end value");
       int n = s.nextInt();
       for(int i =x; i<=n; i++)
       {
          if(obj.calCount(i)==0 && i>=2)
                 System.out.println(i);
       }     
   }
}
  
class PrimeNum
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
}
