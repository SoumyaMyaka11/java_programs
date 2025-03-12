class Logic4
{
  public static void main(String args[])
  {
   int num=786,temp=num,sum=0,rev=0,rem=0;
   while(num!=0)
   {
    rem=num%10;
    sum = sum+rem;
    num = num/10;
   }
   num = temp;
   while(num!=0)
   {
    rem=num%10;
    rev = rev*10+(sum/rem);
    num = num/10;
   }
   int rev2=rev,reverse = 0;
   while(rev2!=0)
   {
    rem = rev2%10;
    reverse = reverse*10 + rem;
    rev2 = rev2/10;
   }
   System.out.println(temp+" "+reverse);
 
 }

}

