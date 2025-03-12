class Logic2
{
  public static void main(String args[])
  {
   int num=111,temp=num,sum=0,rem=0,num1=0,count=0,start=1;
   while(num!=0)
   {
    count++;
    rem = num%10;
    sum = sum+rem;
    num = num/10;
   }
   while(start<=count)
   {
     num1 = num1*10 + sum ;
     start++;
   }
   System.out.println(temp+" "+num1);
 }
}