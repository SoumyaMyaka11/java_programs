class LeapYearLoop
{
  public static void main(String args[])
  {
   int start=1800,end=2000;
   System.out.println("leap years between 1800 and 2000 are:");
   while(start<=end)//1800<=2000t 1801<=2000t 1802<=2000t  2000<=2000t 2001<=2000f
   {
    if(start%4==0 && start%100!=0 || start%400==0)
    {
      System.out.println(start);
    }
    start++;//1801 1802 1803.........2000 2001
   }


  System.out.println("________________________________________________________");

   System.out.println("leap years between 1800 and 2000 which are divisible by 6 are:");
    start= 1800;
   while(start<=end)//1800<=2000t 1801<=2000t 1802<=2000t  2000<=2000t 2001<=2000f
   {
    if(start%4==0 && start%100!=0 || start%400==0)
    {
      if(start%6==0)
        System.out.println(start);
      
    }
    start++;//1801 1802 1803.........2000 2001
   }


  }
}