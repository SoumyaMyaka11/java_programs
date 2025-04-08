import java.util.Scanner;
class InavNumber
{
   public static void main(String args[])
   {
       Scanner s = new Scanner(System.in);
       NumInav obj = new NumInav();
       System.out.println("enter number");
       int num = s.nextInt();
       int res = obj.sumDigits(num);      
       if(res == 1)
       {
           System.out.println(num+" is InavNumber");
       }
       else
       {
         int s_count = obj.sumCount(res);//2
         if(s_count>1)//2
         {
               for(int start=1; start<=s_count; start++)
                { 
                  res = obj.sumDigits(res);//19 10
                }
               if(res == 1)
                  System.out.println("Inav Number");
               else 
                  System.out.println("Not an Inav Number");
          }
         else
         {
             System.out.println("Not an Inav Number");
         }

       }
    }        
}

class NumInav
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
  int sumCount( int sum)
  {
    int count=0;
    while(sum!=0)
    {
      count++;
      sum = sum/10;
    }
    return count;//3
   }
}
