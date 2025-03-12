class Count
{
  public static void main(String args[])
  {
    int num = 145644, e_count=0 ,e_sum=0,o_sum=0, o_count=0,rem=0,temp=num;
    while(num!=0)
    {
      rem = num%10;
      if(rem%2==0)
       {
         e_count++;
         e_sum+=rem;
       }
      else
       {
         o_count++;
         o_sum+=rem;
       }
     num=num/10;
    }
    System.out.println("count of even digits of "+temp+" is "+e_count+" their sum is "+e_sum);
    System.out.println("count of odd digits of  "+temp+" is "+o_count+" their sum is "+o_sum);
  }
}  

    