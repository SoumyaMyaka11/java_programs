import java.util.Scanner;
class AlternateSum
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    System.out.println("enter array a size");
    int a[] = new int[s.nextInt()];
    InOut io = new InOut();
    ArrayAltSum obj = new ArrayAltSum();
    int res[] = obj.altSum(io.arrayInput(a,a.length));
    System.out.println("a array elements are");
    io.printArray(a);
    System.out.println("b array elements are");
    io.printArray(res);
  }
}

class ArrayAltSum
{
  int[] altSum(int a[])
  {
    int b[] = new int[a.length];
    for(int x=0; x<a.length; x++)
    {
         if(x==0)
         {
           b[x] = a[x] + a[x+1];
         }
         else if(x>0 && x<a.length-1)
        {
           b[x] = a[x-1] + a[x+1];
        }
        else if(x==a.length-1)
        {
           b[x] = a[x] + a[x-1];
        }
    }
    return b;
  }
}
     
