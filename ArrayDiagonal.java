import java.util.Scanner;
class ArrayDiagonal
{
   public static void main(String args[])
   {
       Scanner s = new Scanner(System.in);
       System.out.println("enter no of rows ");
       int a[][] = new int[s.nextInt()][];
       for(int r=0; r<a.length; r++)
       {
          System.out.println("enter row "+r+" column size");
          a[r] = new int[s.nextInt()];
          System.out.println("enter row "+r+" elements");
          for(int c=0; c<a[r].length; c++)
          {
             a[r][c] = s.nextInt();
          }
       }
       System.out.println("array elements are ");
       for(int t[]:a)
       {
          for(int t1:t)
          {
              System.out.print(t1+" ");
          }
          System.out.println();
       } 
       Array2D obj = new Array2D();
       System.out.println("diagonal elements are");
       obj.printLeftDiagonal(a);
       System.out.println("maximum element in array is "+obj.maxArray(a));
       obj.maxEleRow(a);
    }
}

class Array2D
{
   void printLeftDiagonal(int a[][])
   {
      int b[][] = new int[a.length][a.length];
      for(int r=0; r<a.length; r++)
      {
         for(int c=0; c<a[r].length; c++)
         {
            if(r==c || r+c==a.length-1)
              System.out.print(a[r][c]+" ");
            else
              System.out.print(" ");
          }
          System.out.println();
       }   
   }
   
  int maxArray(int a[][])
  {
      int max=Integer.MIN_VALUE, second_max=Integer.MIN_VALUE;
      for(int r=0; r<a.length; r++)
      {
         for(int c=0; c<a[r].length; c++)
         {
            if(a[r][c]>max)
            {
               second_max = max;
               max = a[r][c];
            }
          }
      } 
      return max; 
   } 

   void maxEleRow(int a[][])
  {
     
      for(int r=0; r<a.length; r++)
      {
         int max=Integer.MIN_VALUE;
         for(int c=0; c<a[r].length; c++)
         { 
               System.out.print(a[r][c]+" ");
               if(a[r][c]>max)
               {
                  max = a[r][c];
               }
         }
         System.out.print("max element is "+max+"\n");
          
      } 
      
   } 


}

     