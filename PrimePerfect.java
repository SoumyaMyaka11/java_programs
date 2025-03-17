import java.util.Scanner;
class PrimePerfect
{
  public static void main(String args[])
  {
  Scanner s = new Scanner(System.in);
  System.out.println("Enter number");
  int num = s.nextInt();
   while(num!=0)
   {
     	int rem = num%10,count=0;
     	for(int start=2; start<=rem/2; start++)
     	{
            if(rem%start==0)
            {
               count++;
               break;
            }
        }
        if(count==0 && rem>=2)
                System.out.println(rem+" is a prime");
        else
        {
           int square = (int)Math.sqrt(rem);
           if(square*square == rem)
                    System.out.println(rem+" is perfect square");
        }
        num = num/10;
   }
 }
}
      
  