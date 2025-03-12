class DigitPlace
{
   public static void main(String args[])
    {
       int num = 96;
       if(num>=0 && num<=9)
           System.out.println(num);
       else if(num>=10 && num<100)
           System.out.println(num%10);
       else if(num>=100 && num<1000)
           System.out.println(num%100);
       else 
           System.out.println("num is not a 3 digit ");
    }
}
             