import java.util.Scanner;
class ArrayZeroEnd
{
   public static void main(String aargs[])
   {
     	Scanner s = new Scanner(System.in);
     	System.out.println("enter array size");
     	int a[] = new int[s.nextInt()];
     	InOut io = new InOut();
     	int b[] = io.arrayInput(a);
        System.out.println(" array a");
        io.printArray(b);
        Zero obj = new Zero();
        int res[] = obj.positionZero(b);
        System.out.println(" array after moving zeros to end");
        io.printArray(res);

   }
}

class Zero
{
   int[] positionZero(int a[])
    {
       int y=0;
       for(int x=0; x<a.length; x++)
       {
          if(a[x]!=0)
          {
             a[y] = a[x];
             y++;
          }
       }
       for(int x=y; x<a.length; x++)
       {
          a[x] = 0;
       }
       return a;
    }
}