class SecondMax
{
   public static void main(String args[])
   {
    int num=98764,temp=num, rem=0,max=0;
    while(num!=0)
    {
      rem = num%10;
      if(rem>max)
         max = rem;
      num = num/10;
    } 

    num =temp;
    int second_max=0;
    while(num!=0)
    {
      rem = num%10;
      if(rem<max)
        if(rem>second_max)
              second_max=rem;
      num = num/10;
    }
    System.out.println("second maximum digit of "+temp+" is "+second_max);
  }
}