import java.util.Scanner;
class DigitTable
{
  public static void main(String args[])
  {
    	Scanner s = new Scanner(System.in);
    	System.out.println("enter number");
   	int num = s.nextInt();
    	while(num!=0)
    	{
             int rem = num%10;
             System.out.println("Multiplication table of "+rem+" is:");
             for(int start=1; start<=10; start++)
             {
	         int product = rem*start;
                 System.out.println(rem+" X "+start+" = "+product);
             }
             num = num/10;
        } 
    }
}

   