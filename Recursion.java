class Recursion
{
   public static void main(String args[])
   { 
      NaturalNum obj = new NaturalNum();
      System.out.println("sum is "+obj.sumOfNaturalNum(10,0,1));
   }
}

class NaturalNum
{
  int  sumOfNaturalNum(int n, int sum, int x)
  {
     if(x>n)
     {
         return sum;
     }
     else
     {
         sum = sum+x;
         return sumOfNaturalNum(n, sum, x+1);
     }
  }
}