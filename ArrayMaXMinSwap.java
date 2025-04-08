import java.util.Scanner;
class ArrayMaXMinSwap
{
   public static void main(String args[])
   {
     Scanner s = new Scanner(System.in);
     System.out.println("enter array a size");
     int a[] = new int[s.nextInt()];
     InOut io = new InOut();
     int b[] = io.arrayInput(a,a.length);
     System.out.println("array a elements are");
     io.printArray(a);
     PositionSwap obj = new PositionSwap();
     int res[] = obj.maxMin(a);
     System.out.println("array elements after swapping maximum & minimum position are");
     io.printArray(res);
   
  }
}

class PositionSwap
{
   int[] maxMin(int arr[])
   {
      int temp1=arr[0],y=0,z=0;
      int max = Integer.MIN_VALUE,min=Integer.MAX_VALUE;
      for(int x=0; x<arr.length; x++)
      {
         
         if(arr[x]>max)
         {
            max = arr[x];
            arr[0] = max;
            y=x;
          }
       }
      arr[y] = temp1;
      int temp2=arr[arr.length-1];
      for(int x=0; x<arr.length; x++)
      {
          if(arr[x]<min)
         {
            min = arr[x];
            z = x;
          }
       }
      arr[arr.length-1]=min;
      arr[z]=temp2;
      return arr;
    }
}
