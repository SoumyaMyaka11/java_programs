import java.util.Scanner;
class TwinPrime
{
  public static void main(String args[])
  {
     Scanner s = new Scanner(System.in);
     System.out.println("Enter number");
     //int num = s.nextInt();
     //int temp = num,count=0;
     for(int x=1; x<=10; x++)
     {
          int num = x,temp = num,count=0;
          for(int start=2; start<=num/2; start++)
          {
              if(num%start==0)
              {
                 count++;
                 break;
               }
           }
          if(count==0 && num>=2)
          {
             num = num+2;
             int count1=0;
             for(int start=2; start<=num/2; start++)
             {
                if(num%start==0)
                {
                   count1++;
                   break;
                }
             }
             if(count1==0 && num>=2)
                System.out.println(temp+" and "+num+" is Twin Prime");
             else
               System.out.println(temp+" and "+num+" is not Twin Prime");
          }
       }
  }
}

    