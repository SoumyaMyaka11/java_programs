import java.util.Scanner;
class ArrrReverseCopy
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      System.out.println("enter size of array");
      int a[] = new int[s.nextInt()];
      int b[] = new int[a.length];
      System.out.println("enter array a elemnts");
      for(int x=0; x<a.length; x++)
      {
         a[x] = s.nextInt();
      }
      for(int x=a.length-1,y=0; x>=0; x--,y++)
      {
         b[y] = a[x];
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


