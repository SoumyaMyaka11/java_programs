import java.util.Scanner;
class ArrayPerfectSquare
{
   public static void main(String args[])
   {
     Scanner s = new Scanner(System.in);
     System.out.println("enter size of array");
     int a[] = new int[s.nextInt()];
     int b[] = new int[a.length];
     int c[] = new int[a.length];
     System.out.println("enter elements");
     for(int x=0; x<a.length; x++)
     {
       a[x] = s.nextInt();
       
     }
     int y=0,z=0;
     for(int x=0; x<a.length; x++)
     {
         int square = (int)Math.sqrt(a[x]);
         if(square*square == a[x])
         {
            b[y] = a[x];
            y++;
         }
         else
         {
           c[z] = a[x];
           z++;
         }
      }
      System.out.println(" b array(perfect squares)");
      for(int x=0; x<b.length; x++)
      {
        System.out.println("b["+x+"]="+b[x]);
      }
      System.out.println(" c array(not perfect squares");
      for(int x=0; x<c.length; x++)
      {
        System.out.println("c["+x+"]="+c[x]);
      }

  }
}

