import java.util.Scanner;
class Strong
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter number");
      int num = s.nextInt();
      int temp = num,count=0;
      while(num!=0)
      {
          count++;
          num = num/10;
      }
      num = temp;
      if(count%2==0)
      {  
         
         while(num!=0)
         {
             int sum=0;
             int rem = num%100;//68
             int temp1 = rem;
             while(rem!=0)
             {
             	int fact = 1;
             	int rem1 = rem%10;//8
             	for(int start=1; start<=rem1; start++)
                {
                  fact = fact*start;
                }
                sum = sum + fact;
                rem = rem/10;// 6
             }
             if(sum == temp1)
                   System.out.println(temp1+" is strong number");
             else
                   System.out.println(temp1+" is not a strong number");
             num = num/100;
         }
      }
   }
}

