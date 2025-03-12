class Prime
{
  public static void main(String args[])
  {
     int num=23,start=2,end=num-1,count=0;
     if(num<0)
           System.out.println(num+" is negative");
     else if(num>0)
     {
       while(start<=Math.sqrt(num))
       {
         if(num%start==0)
               count++;
         start++;
       }
       if(count==0)
          System.out.println(num+" is prime");
       else
          System.out.println(num+"is not a prime");

     }
     
    System.out.println("_______________________________________");
     
    for(int i=2; i<=20;i++)
    {
      int start1=2,count1=0;
      while(start1<=Math.sqrt(i))
      {
        if(i%start1==0)
            count1++;
        start1++;
      }
      if(count1==0)
           System.out.println(i);
     
    }
      
     
  }

}