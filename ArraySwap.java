import java.util.Scanner;
class ArraySwap
{
   public static void main(String args[])
   {
     Scanner s = new Scanner(System.in);
     System.out.println("enter size of array a ");
     int a[] = new int[s.nextInt()];
     int b[] = new int[a.length];
     int c[] = new int[a.length];
     System.out.println("enter array a elements");
     for(int x=0; x<a.length; x++)
     {
         a[x] = s.nextInt();
     }
     System.out.println("enter array b elements");
     for(int x=0; x<b.length; x++)
     {
         b[x] = s.nextInt();
     }

     for(int x=0; x<a.length; x++)
     {
         c[x] = b[x];
         b[x] = a[x];
         a[x] = c[x];
     }
      System.out.println("after swapping");
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


     
