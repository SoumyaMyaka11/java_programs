class HalfSum1
{ 
  public static void main(String args[])
  {
    int num=12345,temp=num,count=0,rev=0,rem=0;
    while(num!=0)
    {
     count++;
     rem = num%10;
     rev = rev*10 + rem;
     num = num/10;
    }
    num = temp;
    if(count%2==0)
    {
      int mid = count/2+1,rem1=0,rem2=0,sum1=0,start=1;
      while(start<mid)
      {
       rem1 = num%10;
       rem2 = rev%10;
       sum1 = sum1 +(rem1*rem2);
       num = num/10;
       rev = rev/10; 
       start++;
      }
      System.out.println(" sum of product of first and last digits of "+temp+" is "+sum1);
    }
    else
    {
      int mid = count/2+1,rem1=0,rem2=0,sum1=0,sum2=0,start=1;
      while(start<mid)
      {
       rem1 = num%10;
       rem2 = rev%10;
       sum1 = sum1 +(rem1*rem2);
       num = num/10;
       rev = rev/10; 
       start++;
      }
      while(start<=mid)
      {
       sum2 = start;
       start++;
      }
      System.out.println("sum of product of first and last digits of "+temp+" is "+(sum1+sum2));
   }
  }
}
        