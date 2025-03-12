class Fibonacci
{
  public static void main(String args[])
  {
    int a=0,b=1,c=2,d=0,start=1,end=10;
    while(start<=end)
    {
      System.out.println(a);
      d=a+b+c;
      a=b;
      b=c;
      c=d;
      start++;
    }
 }
}