import java.util.Scanner; 
class PerfectRange
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    System.out.println("enter start number");
    int x = s.nextInt();
    System.out.println("enter last number");
    int n = s.nextInt();
    System.out.println("The perfect squares between "+x+" and "+n+" are: ");
    for(int start=1; start<=n; start++)
    {
      int result = (int)Math.sqrt(start);
      if(result*result == start)
          System.out.println(start);

    }
  }
}