class LastdigitLoop
{
  public static void main(String args[])
  {
    int start=100,end=200;
    while(start<=end)//1<=10t 2<=10t ....10<=10t 11<=10f
    {
     int last_digit = start%10;//1%10=1 2%10=2 ...10%10=0
     System.out.println("last digit of "+start+" is "+last_digit);
     start++;//2 3 .....10 11
    }
  }
}