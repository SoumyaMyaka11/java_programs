import java.util.Scanner;
class ArrayRotation
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      System.out.println("enter array size");
      int a[] = new int[s.nextInt()];
      InOut io = new InOut();
      int b[] = io.arrayInput(a,a.length);
      System.out.println("a array is");
      io.printArray(b);
      Rotation obj = new Rotation();
      int res1[] = obj.arrayRightRotation(b);
      System.out.println("a array after RIGHT ROTATION is");
      io.printArray(res1);
      int res2[] = obj.arrayLeftRotation(b);
      System.out.println("a array after LEFT ROTATION is");
      io.printArray(res2);	
    }
}

class Rotation
{
  int[] arrayRightRotation(int a[])
  {
     int temp=a[a.length-1];
     for(int x=a.length-1; x>0; x--)
     {
        a[x] = a[x-1];
     }
     a[0]=temp;
     return a;
  }
  int[] arrayLeftRotation(int a[])
  {
     int temp=a[0];
     for(int x=0; x<a.length-1; x++)
     {
        a[x] = a[x+1];
     }
     a[a.length-1]=temp;
     return a;
   }

}
   