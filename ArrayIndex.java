import java.util.Scanner;
class ArrayIndex
{
   public static void main(String args[])
   {
     Scanner s = new Scanner(System.in);
     System.out.println("enter size of array");
     int a[] = new int[s.nextInt()];
     int b[] = new int[(a.length/2)+1];
     System.out.println("enter elements");
     for(int x=0; x<a.length; x++)
     {
       a[x] = s.nextInt();
     }
     int y=0;
     for(int x=0; x<a.length; x++)
     {
        if(x%2==0)
        {
          b[y] = a[x];
          y++;
         }
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
