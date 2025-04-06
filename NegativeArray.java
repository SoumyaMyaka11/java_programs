import java.util.Scanner;
class NegativeArray
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    System.out.println("enter array a size");
    int a[] = new int[s.nextInt()];
    System.out.println("enter array elements");
    for(int x=0; x<a.length; x++)
    {
       a[x] = s.nextInt();
    }
    ArrayNeg obj = new ArrayNeg();
    int res[] = obj.storeNegEle(a);
    System.out.println(" b array elements are");
    for(int x=0; x<res.length; x++)
    {
      System.out.println(res[x]);
    }
  
   }
}

class ArrayNeg
{
  int[] storeNegEle(int a[])
  {
     int count=0;
     for(int x=0; x<a.length;x++)
     {
         if(a[x]<0)
            count++;
     }
     int b[] = new int[count];
     for(int x=a.length-1,y=0; x>=0; x--)
     {
         if(a[x]<0)
         {
           b[y] = a[x];
           y++;
         }
      }
      return b;
   }
}