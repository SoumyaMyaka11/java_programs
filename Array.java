import java.util.Scanner;
class Array
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      System.out.println("enter size of array");
      int size = s.nextInt();
      int arr[] = new int[size];
      int sum=0;
      System.out.println("enter elements");
      for(int x=0; x<=arr.length-1; x++)
      {
           arr[x] = s.nextInt();
            sum+= arr[x];
      }
      System.out.println("array elements are:");
      for(int x=0; x<arr.length; x++)
      {
          System.out.println("arr["+x+"]="+arr[x]); 
      }
      System.out.println("array elements in reverse order are");
      for(int x=arr.length-1; x>=0; x--)
      {
         System.out.println("arr["+x+"]="+arr[x]);
      }
       System.out.println("array sum is: "+sum);
   }
}
