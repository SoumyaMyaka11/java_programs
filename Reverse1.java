class Reverse1
{
  public static void main(String args[])
  {
    int num=12000,temp=num,count=0,rem=0,rev=0;
    while(num!=0)
    {
     count++;
     rem = num%10;
     rev = rev*10+rem;//21
     num = num/10;
    }
    System.out.println("reverse of "+temp+" is "+rev);
    int rev2=rev,reverse=0,r_count=0;
    while(rev2!=0)
    {
     rem=rev2%10;
     reverse = reverse*10+rem;//12
     rev2 = rev2/10;
     r_count++;
    }
    if(r_count==count)
       System.out.println("reverse of "+rev+" is "+reverse);
    else if(r_count!=count)
       {
         int start=1;
         while(start<=(count-r_count))
         {
           reverse = reverse*10;
           start++;
         }
         System.out.println("reverse of "+rev+" is "+reverse);
       }
 }

}
