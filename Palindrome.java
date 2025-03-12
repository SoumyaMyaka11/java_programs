class Palindrome
{
  public static void main(String args[])
  {
   int num=222,temp=num,rem=0,rev=0;
     while(num!=0)
     {
       rem = num%10;
       rev = rev*10 + rem;
       num= num/10;
     }
    if(rev == temp)
        System.out.println(temp+" is palindrome");
    else
        System.out.println(temp+" is not a palindrome");
   }
}