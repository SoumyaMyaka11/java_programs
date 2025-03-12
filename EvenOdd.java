class EvenOdd
{
  public static void main(String args[])
  {
    int start=1,end=10;
    System.out.println("even numbers are:");
    while(start<=end)//1<=10t
    {
      if(start%2==0)//1%2==0f
      {
       System.out.println(start);//
      }
    start++;//2
    }
     
    System.out.println("odd numbers are:");
    start=1;
    while(start<=end)//1<=10t
    {
      if(start%2!=0)//1%2!=0t
      {
       System.out.println(start);//
      }
    start++;//2
    }
  }
}
