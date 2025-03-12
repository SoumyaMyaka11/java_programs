class Loop
{
   public static void main(String args[])
   {
     int start=1,end=20;
     while(start<=end)
     {
        if(start%3==0 && start%5==0)
            System.out.println("FIZZBUZZ");
        else if(start%3==0)
            System.out.println("FIZZ");
        else if(start%5==0)
            System.out.println("BuZZ");
        else
            System.out.println(start);
      
        start++;
      }
   }
}