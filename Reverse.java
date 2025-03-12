class Reverse
{
  public static void main(String args[])
  {
    int num=1200,temp=num,rev=0,rem=0;
    while(num!=0)
    {
     rem = num%10;
     rev = rev*10+rem;
     num = num/10;
    }
    System.out.println("reverse of "+temp+" is "+rev);
    int rev2 =rev ,reverse=0;
    while(rev!=0)
    {
      rem=rev%10;
      reverse = reverse*10+rem;
      rev = rev/10;
    }
    System.out.println("reverse of "+rev2+" is "+reverse); 
  }
}