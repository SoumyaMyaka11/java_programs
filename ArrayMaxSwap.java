import java.util.Scanner;
class ArrayMaxSwap
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
     SwapElement obj = new SwapElement();
     int res[] = obj.swapMaxPos(a);
     System.out.println("array elements after swapping maximun position are");
     io.printArray(res);
   
  }
}

class SwapElement
{
    int[] swapMaxPos(int arr[])
    {     
       int temp=arr[0],y=0;
       int max = Integer.MIN_VALUE;
       for(int x=0; x<arr.length; x++)
       {
          if(arr[x]>max)
          {
            max = arr[x];
            y=x;
          }
       }
       arr[0] = max; arr[y] = temp;
      return arr;
    }
}
      
  