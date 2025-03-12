class HighestFactor
{
   public static void main(String args[])
   {
     int num1=32, num2=24, num3=6,start=1 ,max=0;
     System.out.println("The factors of "+num1+","+num2+","+num3" are: ");
     while(start<=num1 && start<=num2 && start<=num3)
     {
       if(num1%start==0 && num2%start==0 && num3%start==0)
       {
         System.out.println(start);
         max = start;
       }
       start++;
     }
     System.out.println("Highest common factor is: "+max);

    
   }

}