class Divisible1
{
   public static void main(String args[])
   {
    int num = 25;
    if(num%3==0 && num%5==0)
       System.out.println("FIZZBUZZ");
    else if(num%3==0)
       System.out.println("FIZZ"); 
    else if(num%5==0)
       System.out.println("BUZZ");
    else 
      System.out.println("neither divisible by 3 or 5");
  }
}