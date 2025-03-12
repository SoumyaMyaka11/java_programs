class Print
{
  public static void main(String args[])
  {
  int num = 12345,temp=num,count=0,rem=0,rev=0;
  while(num!=0)
  {
   count++;
   rem = num%10;
   rev = rev*10 + rem;
   num/=10;
  }
  int rev2=rev,r_count=0;
  while(rev2!=0)
  {
   r_count++;
   rem = rev2%10;
   switch(rem)
   {
     case 1:
         System.out.print("one ");
         break;
     case 2:
         System.out.print("two ");
         break;
     case 3:
         System.out.print("three ");
         break;
     case 4:
         System.out.print("four ");
         break;
     case 5:
         System.out.print("five ");
         break;
     case 6:
         System.out.print("six ");
         break;
     case 7:
         System.out.print("seven ");
         break;
     case 8:
         System.out.print("eight ");
         break;
     case 9:
         System.out.print("nine ");
         break;
    }
    rev2 = rev2/10;
   }   
   int start=1;
   if(r_count==count)
   {
   }
   else
   {
       while(start<=(count-r_count))
       {
           System.out.print("zero ");
           start++;
        }
    }  
}
}
