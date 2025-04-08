import java.util.Scanner;
class ArrayReverse1
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      System.out.println("enter array size");
      int a[] = new int[s.nextInt()];
      InOut io = new InOut();
      int b[] = io.arrayInput(a,a.length);
      System.out.println(" array before reverse");
      io.printArray(b);
      Reverse obj = new Reverse();
      int res[] = obj.revArray(b);
      System.out.println(" array after reverse");
      io.printArray(res);

    }
}
class Reverse
{
   int[] revArray(int a[])
   {
       for(int x=0; x<a.length/2; x++)
       {
         int temp   = a[x];
         a[x]  = a[a.length-1-x];
         a[a.length-1-x] = temp;
       }
       return a;
   }
}
