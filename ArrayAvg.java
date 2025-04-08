import java.util.Scanner;
class ArrayAvg
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      System.out.println("enter size of array");
      int a[] = new int[s.nextInt()];
      int sum =0;
      System.out.println("enter array a elemnts");
      for(int x=0; x<a.length; x++)
      {
         a[x] = s.nextInt();
         sum = sum + a[x];
      }
      System.out.println("array a average is "+sum/a.length);
   }
}
