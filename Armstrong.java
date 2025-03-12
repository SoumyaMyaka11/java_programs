class Armstrong
{
  public static void main(String args[])
  {
    int num=153,count=0,rem=0,sum=0,temp=num;
    while(num!=0)
    {
      num=num/10; 
      count++;
    }
    num = temp;
    while(num!=0)
    {
     rem = num%10;
     int res = (int)Math.pow(rem,count);
     sum= sum+res;
     num = num/10;
    }
    System.out.println("sum of power of digit and num count is :"+sum);
    System.out.println(sum==temp ? " Armstrong number" : "Not a Armstrong number");

 
 }
}

