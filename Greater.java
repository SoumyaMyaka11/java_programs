class Greater
 
{
   public static void main(String args[])
  
   {
    
     int num1 = 27, num2 = 15;
     if(num1 > num2)
     {
      System.out.println("num1 is greater" +num1);
      int last_digit1 = num1%10;
      int last_digit2 = num2%10;
      System.out.println("last digit of "+num1 + " is "+last_digit1 +"\nlast digit of " +num2+ " is " +last_digit2);
     }
     else
     {
     System.out.println("num2 is greater" +num2);
     int sum = num1 + num2;
     System.out.println("sum of "+num1+ "and"+num2+"is"+sum);
     }

   }
}