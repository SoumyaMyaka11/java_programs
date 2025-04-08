import java.util.Scanner;
class Array2D
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter no of rows");
        int a[][] = new int[s.nextInt()][];
        for(int r=0;r<a.length; r++)
        {
          System.out.println("enter row "+r+" column size");
           a[r] = new int[s.nextInt()];
        }
        for( int r=0;r<a.length; r++)
        {
           System.out.println("enter row "+r+" elements");
           for(int c=0; c<a[r].length; c++)
           {
              a[r][c] = s.nextInt();
            }
        }
        System.out.println(" array elements are");
        for( int r=0;r<a.length; r++)
        {
           for(int c=0; c<a[r].length; c++)
           {
              System.out.print(a[r][c]+" ");
            }
            System.out.println();
        }
        Array2DSum  obj = new Array2DSum();
        obj.sumOfArray(a);
     } 
}

class Array2DSum
{
   void sumOfArray(int a[][])
   {
      int sum=0;
      for(int r=0; r<a.length; r++)
      {
          int sum_of_rows=0;
          for(int c=0; c<a[r].length; c++)
          {
             System.out.print(a[r][c]+" ");
             sum_of_rows+=a[r][c];
             sum+=a[r][c];
          }
          System.out.print("sum is "+sum_of_rows+"\n");
      }
      System.out.println("sum of array elements is "+sum);
   }
   
}
