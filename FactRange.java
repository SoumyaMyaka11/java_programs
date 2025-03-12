import java.util.Scanner;
class FactRange
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the range of factorial:");
    int n = s.nextInt();
    for(int i=1;i<=n; i++)
    {
    	int num=i,fact=1;
     	for(int start=num;start>=1;start--)
    	{
      	   fact = fact*start;
    	}
   	System.out.println("The factorial of "+num+" is "+fact);
    }  
  }
} 