import java.util.Scanner;
class ProductRange
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter start range");
    double x = s.nextDouble();
    System.out.println("Enter end range");   
    double n = s.nextDouble();
    int product=1;
    for(double start=x; start<=n; start++)
    {
      product*=start;
    }
    System.out.println("The product of numbers from "+x+" to "+n+" is "+product);
  }
}