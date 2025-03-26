import java.util.Scanner;
class ArraySecondMax
{
   public static void main(String args[])
   {
     Scanner s = new Scanner(System.in);
     System.out.println("enter size of array");
     int a[] = new int[s.nextInt()];
     int max= Integer.MIN_VALUE;
     System.out.println("enter elements");
     for(int x=0; x<a.length; x++)
     {
       a[x] = s.nextInt();
     }
     int second_max=Integer.MIN_VALUE,third_max=Integer.MIN_VALUE;
     for(int x=0; x<a.length; x++)
     {
        if(a[x] > max)
        {
           third_max = second_max;
           second_max = max;
            max = a[x];
         }
     }
     System.out.println("maximun element in array a is "+max);
     System.out.println("second maximum element in array a is "+second_max);
     System.out.println("third maximum element in array a is "+third_max);
  }
}
