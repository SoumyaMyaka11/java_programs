import java.util.Scanner;
class BinarySearch
{
    public static void main(String args[])
    {
       Scanner s = new Scanner(System.in);
       System.out.println("enter array size");
       int a[] = new int[s.nextInt()];
       InOut io = new InOut();
       int b[] = io.arrayInput(a,a.length);
       System.out.println("array before sorting");
       io.printArray(b);
       Binary binary = new Binary();
       int res[] = binary.arraySort(b);
       System.out.println("array after sorting");
       io.printArray(res);
       System.out.println("enter element to search");
       int target = s.nextInt();
       int index = binary.searchElement(res,target);
       int result[] = binary.modifyArray(res,index,target);
       System.out.println("array after modifying");
       io.printArray(result);


    }
}

class Binary
{
   int[] arraySort(int a[])
   {
      for(int x=0; x<a.length-1; x++)
      {
         for(int y=x+1; y<a.length; y++)
         {
            if(a[x]>a[y])
             {
                int temp = a[x];
                  a[x] = a[y];
                  a[y] = temp;
              }
          }
       }
       return a;
    }
   int searchElement(int res[], int target)//{10,20,30,40,50}  40 {50,40,30,20,10}
   {
      int l = 0;//0 3
      int r = res.length-1;//4
      boolean b = false;
      while(l<=r)//0<=4 
      {
       	   int mid = (l+r)/2; //0+4/2 = 2 3+4/2 = 3
           if(target == res[mid])//30==40f
           {
             System.out.println("element "+target+" found at index "+mid);
             b = true;
             return mid;
           }
           else if(target>res[mid])//40>30t
           {
               l = mid+1;// l=2+1 = 3
           }
           else if(target<res[mid])
           {
               r = mid-1;
           }
      
      }
      if(b==false)
      {
         System.out.println("element "+target+" not found");
      }
     return -1;

   }
   int[] modifyArray(int arr[] , int index, int target)
   {
      if(index!=-1)
      {
         arr[index] = 0;
         for(int x=index; x<arr.length-1; x++)
         {
            arr[x] = arr[x+1];
         }

      }
      else
      {
          Scanner s = new Scanner(System.in);
          System.out.println("enter the positon for insertion");
          int position = s.nextInt();
          for(int x=arr.length-1; x>position; x--)
          {
             arr[x] = arr[x-1];
          }
          arr[position] = target;
      }
       return arr;
   }

}