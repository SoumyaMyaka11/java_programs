class Divisible 
{
  public static void main(String args[])
   {
    int num = 15;
    if(num%3==0 && num%5==0)
       System.out.println("FIZZBUZZ");
    else if(num%7==0 || num%9 ==0)
    {
      int last_digit = num%10;
       System.out.println(last_digit);
    }
   else
     System.out.println("invalid input");
  }
}