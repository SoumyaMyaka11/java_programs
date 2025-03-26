import java.util.Scanner;
class ArrayMaxMin
{
   public static void main(String args[])
   {
     Scanner s = new Scanner(System.in);
     System.out.println("enter size of array");
     int a[] = new int[s.nextInt()];
     int max=0;
     System.out.println("enter elements");
     for(int x=0; x<a.length; x++)
     {
       a[x] = s.nextInt();
       if(a[x] > max)
       {
         max = a[x];
       }
     }
     int min = a[0];
     for(int x=0; x<a.length; x++)
     {
         if(a[x] < min)
             min = a[x];
      }
     System.out.println("maximum element in array a is "+max);
     System.out.println("minimum element in array a is "+min);

   }
}
        