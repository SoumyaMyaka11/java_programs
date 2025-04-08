import java.util.Scanner;
class ArrayComb
{
  public static void main(String args[])
  {
     Scanner s = new Scanner(System.in);
     System.out.println("enter array a size");
     int a[] = new int[s.nextInt()];
     System.out.println("enter array b size");
     int b[] = new int[s.nextInt()];
     int c[] = new int[a.length+b.length];
     System.out.println("enter a array elements");
     for(int x=0; x<a.length; x++)
     {
         a[x] = s.nextInt();
     }
     System.out.println("enter b array elements");
     for(int x=0; x<b.length; x++)
     {
         b[x] = s.nextInt();
     }
     int y=0;
     for(int x=0; x<a.length; x++)
     {
         c[x] = a[x];
         y++;
     }
     for(int x=0; x<b.length; x++)
     {
         c[y] = b[x];
         y++;
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
     System.out.println(" c array");
      for(int x=0; x<c.length; x++)
      {
        System.out.println("c["+x+"]="+c[x]);
      }
   }
}




     

