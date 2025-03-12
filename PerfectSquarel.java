class PerfectSquarel
{
  public static void main(String args[])
  {
    int start=1,end=100;
    while(start<=end)
    {
     double square = Math.sqrt(start);
     int result = (int)(square);
     if(result*result==start)
     {
       System.out.println(start + " is a perfect square");
      
     }
     start++;
     
    }
     System.out.println("________________________________");

     start=20;end=1;
     while(start>=end)
    {
     double square = Math.sqrt(start);
     int result = (int)(square);
     if(result*result==start)
     {
       System.out.println(start + " is a perfect square");
      
     }
     start--;
    }
    
     System.out.println("________________________________");
     
    start=1;end=10;
     while(start<=end)//1<=10t 2<=10t 3<=10t .....10<=10t 11<=10f
    {
     double square = Math.sqrt(start);
     System.out.println("square root of "+start+" is "+square);
     start++;//2 3 4 .....10 11
    }

     
}

}