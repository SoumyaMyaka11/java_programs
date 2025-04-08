import java.util.Scanner;
class PalindromeByRecursion
{
   public static void main(String args[])
   {
       Scanner s = new Scanner(System.in);
       System.out.println("enter array size");
       int a[] = new int[s.nextInt()];
       InOut io = new InOut();
       int b[] = io.arrayInput(a,a.length);
       MethodByRecursion obj = new MethodByRecursion();
       System.out.println("palindromes in array are");
       obj.printPalin(b);
       System.out.println("prime numbers in array are");
       obj.primeNum(b);
       System.out.println("armstrong numbers in array are");
       obj.armstrongNum(b);
    }
}

class MethodByRecursion
{
    int rev(int num,int rev)
    {
        if(num==0)
        { 
           return rev;
        }
        else
        {
          int rem = num%10;
          rev = rev*10 + rem;
          return rev(num/10,rev);
        }
     }
     void printPalin(int a[])
     {
       for(int t:a)
       {
          if(rev(t,0)==t)
             System.out.println(t);
       }
    }


    int primeArray(int num, int count,int start)
    {
       if(start>num/2)
       {
          return count;
       }
       else
       {
          if(num%start==0)
              count++;
          return primeArray(num, count, start+1);
       }
    }
    void primeNum(int a[])
    {
       for(int t:a)
       {
         if(primeArray(t,0,2)==0 && t>=2)  
                System.out.println(t);
       }
    }


   int calCount(int num,int count)
   {
      if(num==0)
      {
          return count;
      }
      else
      {
         count++;
         return calCount(num/10,count);
      }
   }
   int calPower(int num,int count,int sum)
   {
      
       if(num==0)
       {
         return sum;
       }
       else
       {
             int rem = num%10;
             int power = (int)Math.pow(rem,count);
             sum = sum + power;
             return calPower(num/10,count,sum);
       }
   }
    void armstrongNum(int a[])
    {
       for(int t:a)
       {
           int count = calCount(t,0);
           if(calPower(t,count,0)==t)
           {
              System.out.println(t);
           }
        }
    }


}  