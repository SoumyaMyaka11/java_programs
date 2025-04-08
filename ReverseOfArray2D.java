import java.util.Scanner;
class ReverseOfArray2D
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
       ReverseArray obj = new ReverseArray();
       System.out.println("1D array after adding each row elements is");
       int res[] = obj.sumOfArray(a);
       for(int t:res)
            System.out.print(t+" ");
       System.out.println();
       System.out.println("array after reversing each row");
       obj.printRevArray(a); 
       obj.printPrimeEle(a);
       obj.arrayTranspose(a);
       
    }
}

class ReverseArray
{
   void printRevArray(int a[][])
   {
      for(int r=0; r<a.length; r++)
      {
          for(int c=a[r].length-1; c>=0; c--)
          {
             System.out.print(a[r][c]+" ");
          }
         System.out.println();
      }
   }
   int prime(int num,int count,int start)
   {
      if(start>num/2)
      {
          return count;
      }
      else
      {
          if(num%start==0)
              count++;
          return prime(num,count,start+1);
       }
   }

   void printPrimeEle(int a[][])
   {
      for(int r=0; r<a.length; r++)
      {
          System.out.println("prime elements in row "+r+" are ");
          for(int c=0; c<a[r].length; c++)
          {
             if(prime(a[r][c],0,2)==0 && a[r][c]>=2)
             {
                System.out.print(a[r][c]+" ");
             }
             
          }
         System.out.println();
      }
   }

   int[] sumOfArray(int a[][])
   {
       int b[] = new int[a.length];
       for(int r=0; r<a.length; r++)
       {
          int sum =0;
          for(int c=0; c<a[r].length; c++)
          {
             sum = sum + a[r][c];
          }
          b[r] = sum;
       }
       return b;  
   }
   void  arrayTranspose(int a[][])
   {
        int b[][] = new int[a.length][a.length];
        for(int r=0; r<a.length; r++)
        {
            for(int c=0; c<a[r].length; c++)
            {
                 b[c][r]=a[r][c];
               
            }
          
        }
       System.out.println("transpose of array a is ");
        for(int t[]:b)
       {
          for(int t1:t)
          {
              System.out.print(t1+" ");
          }
          System.out.println();
       }

     }
 
}
