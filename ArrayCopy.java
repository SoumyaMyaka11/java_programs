import java.util.Scanner;
import java.util.Random;
class ArrayCopy
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      Random r = new Random();
      System.out.println("enter size of array a");
      int a[] = new int[s.nextInt()];
      int b[] = new int[a.length];
      for(int x=0; x<a.length; x++)
      {
         a[x] = r.nextInt(0,10);
      }
      System.out.println(" a array");
      for(int x=0; x<a.length; x++)
      {
        System.out.println("a["+x+"]="+a[x]);
      }
      System.out.println(" b array");
      for(int x=0; x<b.length; x++)
      {
        System.out.println("b["+x+"]="+b[x]);
      }
      for(int x=0; x<a.length; x++)
      {
         b[x] = a[x] ;
      }
      System.out.println(" a array");
      for(int x=0; x<a.length; x++)
      {
        System.out.println("a["+x+"]="+a[x]);
      }
      System.out.println(" b array");
      for(int x=0; x<b.length; x++)
      {
        System.out.println("b["+x+"]="+b[x]);
      }
  }
}

