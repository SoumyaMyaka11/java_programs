import java.util.Scanner;
class ArrayEvenOddCopy
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
      int count =0;
      for(int x=0; x<a.length; x++)
      {
          if(a[x]%2==0)
          {
              b[y] = a[x];
              count++;
          }
      }
      System.out.println("count "+count);
      for(int x=0; x<a.length; x++)
      {
          if(a[x]%2!=0)
          {
              b[count] = a[x];
              count++;
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

      
