class HalfSum
{
  public static void main(String args[])
  {
    int num=12345,temp=num,count=0,first_half=0,second_half=0,sum=0;
    while(num!=0)
    { 
     count++;
     num = num/10;
    }
    num=temp;
    if(count%2==0)
    {
      int c =count/2;
      int power = (int)Math.pow(10,c);
      first_half = num/power;
      second_half = num%power;
      sum = first_half + second_half;
      System.out.println("sum of first_half and second_half of "+temp+" is "+sum);
    }
   else
    {
      first_half = num/10;
      second_half = num%10;
      sum = first_half + second_half;
      System.out.println("sum of first_half and second_half of "+temp+" is "+sum);
    }
  }
}

     