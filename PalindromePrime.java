class PalindromePrime
{
  public static void main(String args[])
  {
    int num = 11,count=0,start=1,end=num,rem=0,rev=0;
    while(start<=end)
    {
      if(num%start==0)
         count++;
      start++;
    }
    if(count==2)
    {
      while(num!=0)
      {
        rem = num%10;
        rev = rev*10+rem;
        num = num/10;
      }
     if(end == rev)
        System.out.println(end+" is palindrome prime");
     else
        System.out.println(end+" is prime but not palindrome");
    }
    else
       System.out.println(end+" is not a palindrome prime");
  }

}
    