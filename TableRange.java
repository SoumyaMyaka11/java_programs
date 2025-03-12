import java.util.Scanner;
class TableRange
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter start range oftable ");
    int x = s.nextInt();
    System.out.println("Enter end range oftable ");
    int n = s.nextInt();
    for(int i=x; i<=n; i++)
    {
    	int table =i, product=1;
        System.out.println("Multiplication table of "+table+" is:");
    	for(int start=1; start<=10; start++)
    	{
            product = table*start;
      	    System.out.println(table+" X "+start+" = "+product);
    	}
    }
  }
}