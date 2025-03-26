import java.util.Scanner;
class ArraySecondMin
{
   public static void main(String args[])
   {
     Scanner s = new Scanner(System.in);
     System.out.println("enter size of array");
     int a[] = new int[s.nextInt()];
     System.out.println("enter elements");
     for(int x=0; x<a.length; x++)
     {
       a[x] = s.nextInt();
       
     }
     int min = Integer.MAX_VALUE,second_min = Integer.MAX_VALUE;
     for(int x=0; x<a.length; x++)
     {
        if(a[x]<min )
        {
           min = a[x];
        }
        else if(a[x]>min && a[x]<second_min)
        {
           second_min = a[x];
        }
     }

     System.out.println("minimum element in array a is "+min);
     System.out.println("second minimum element in array a is "+second_min);
  }
}
