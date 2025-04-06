import java.util.Scanner;
class SelectionSort
{
   public static void main(String args[])
   {
     Scanner s = new Scanner(System.in);
     System.out.println("enter array size");
     int a[] = new int[s.nextInt()]; 
     InOut io = new InOut();
     int b[] = io.arrayInput(a,a.length);
     SortBySelection obj = new SortBySelection();
     int res[] =obj.arraySelection(b);
     System.out.println("array after selection sort");
     io.printArray(res);
    }                                                                                                                                       
}

class SortBySelection
{
   int[] arraySelection(int a[])
   {
      for(int x=0; x<a.length-1; x++)
      {
         int min=x;                                                  
         for(int y=min+1; y<a.length; y++)
         {
              if(a[y]<a[min])
              {
                min=y;
              }
         }
         int temp = a[x];
         a[x] = a[min];
         a[min] = temp;
      }
      return a;
    }
}
