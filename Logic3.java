class Logic3
{
  public static void main(String args[])
  {
   int num=123,temp=num,sum=0,rev=0,rem=0;
   while(num!=0)
   {
    rem=num%10;
    sum = sum+rem;//6
    num = num/10;
   }
   num = temp;
   while(num!=0)
   {
    rem=num%10;
    rev = rev*10+(sum/rem);//2 2*10+3=23 23*10+6=236
    num = num/10;
   }
   int rev2=rev, reverse = 0;
   while(rev2!=0)
   {
    rem = rev2%10;
    reverse = reverse*10 + rem;
    rev2 = rev2/10;
   }
   System.out.println(temp+" "+reverse);
 
 }

}
