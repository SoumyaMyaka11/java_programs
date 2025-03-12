class Nested 
{
  public static void main(String args[])
  {
    int num = 31;
    if(num%2 == 0)
     {
        int result = (int)(Math.sqrt(num));
        if(result*result == num)
             System.out.println("Given num is even and it is a perfect square");
        else
             System.out.println("Given num is even and it is not a perfect square");
     }
    else
    {
       int last_digit = num%10;
       if(last_digit%5 == 0)
            System.out.println("Given num is odd and is divisible by 5");
       else
            System.out.println("Given num is odd and is not divisible by 5");
    }
  }

}
 