import java.util.Scanner;
class ArrayDup1
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      System.out.println("enter array size");
      int a[] = new int[s.nextInt()];
      InOut io = new InOut();
      int b[] = io.arrayInput(a,a.length);
      ArrayQue obj = new  ArrayQue();
      System.out.println("frequency of elements ");
      obj.arrayFreq(b);
      obj.firstUniqueEle(b);
      obj.lastUniqueEle(b);
      obj.mostRepeatedEle(b);
      System.out.println("elements with even frequency");
      obj.evenFreqEle(b);
   }
}

class ArrayQue
{
      void arrayFreq(int a[])
      {
          int b[] = new int[a.length];
          boolean s = false;
          int sum = 0;
          for(int x=0; x<a.length; x++)
          {
             int count=1;
             if(b[x]==1)
               continue;
             for(int y=x+1; y<a.length; y++)
             {
                  if(a[x]==a[y])
                  {
                     count++;
                     s = true;
                     b[y]=1;
                   }
              }
              if(count>1)
              {
                sum = sum+a[x];
              }
              System.out.println("count of "+a[x]+" ==> "+count);
          }
          System.out.println("sum of duplicate elements is "+sum);
          if(s==false)
             System.out.println("no duplicate elements");
     }
      
      void firstUniqueEle(int a[])
      {
          int b[] = new int[a.length];
          for(int x=0; x<a.length; x++)
          {
               int count=1;
               if(b[x]==1)
                  continue;
               for(int y=x+1; y<a.length; y++)
               {
                  if(a[x]==a[y])
                  {
                     count++;
                     b[y]=1;
                   }
               }
               if(count==1)
               {
                  System.out.println("first unique element is "+a[x]);
                  break;
               }
          }
      }
       
      void lastUniqueEle(int a[])
      {
          int b[] = new int[a.length];
          int z=-1 ,max = Integer.MIN_VALUE;
          for(int x=0; x<a.length; x++)
          {
               int count=1;
               if(b[x]==1)
                  continue;
               for(int y=x+1; y<a.length; y++)
               {
                  if(a[x]==a[y])
                  {
                     count++;
                     b[y]=1;
                   }
               }
               if(count==1)
               {
                  z=x;
                  if(a[x]>max)
                     max = a[x];
               }
          }
          System.out.println("last unique element is "+a[z]);
          System.out.println("max unique element is "+max);
     }
      void mostRepeatedEle(int a[])
      {
          int b[] = new int[a.length];
          int max_count = Integer.MIN_VALUE,min_count=Integer.MAX_VALUE,z=-1,q=-1;
          for(int x=0; x<a.length; x++)
          {
             int count=1;
             if(b[x]==1)
               continue;
             for(int y=x+1; y<a.length; y++)
             {
                  if(a[x]==a[y])
                  {
                     count++;
                     b[y]=1;
                   }
              }
              if(count>max_count)
              {
                  max_count = count;
                   z=x;
              }
              if(count<min_count)
              {
                  min_count = count;
                   q=x;
              }

          }
          System.out.println("most repeated element is "+a[z]);
          System.out.println("least repeated element is "+a[q]);

     }

     void evenFreqEle(int a[])
      {
          int b[] = new int[a.length];
          for(int x=0; x<a.length; x++)
          {
               int count=1;
               if(b[x]==1)
                  continue;
               for(int y=x+1; y<a.length; y++)
               {
                  if(a[x]==a[y])
                  {
                     count++;
                     b[y]=1;
                   }
               }
               if(count>1 && count%2==0)
               {
                  System.out.println("count of "+a[x]+" is "+count);
                  
               }
          }
      }
       




}