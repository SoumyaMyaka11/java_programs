import java.util.Scanner;
class EvenArray
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      System.out.println("enter size of array");
      int a[] = new int[s.nextInt()];
      System.out.println("enter array elements");
      for(int x=0; x<a.length; x++)
      {
         a[x] = s.nextInt();
      }
      System.out.println("even array elements");
      for(int x=0; x<a.length; x++)
      {
          if(a[x]%2==0)
             System.out.println("a["+x+"]="+a[x]);
      }
      System.out.println("even index array elements");
      for(int x=0; x<a.length; x++)
      {
          if(x%2==0)
             System.out.println("a["+x+"]="+a[x]);
      }
  }
}
