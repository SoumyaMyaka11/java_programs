import java.util.Scanner;
class ArrayDupplicateEle
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      System.out.println("enter array size");
      int a[] = new int[s.nextInt()];
      InOut io = new InOut();
      int b[] = io.arrayInput(a,a.length);
      ArrayUnique au = new ArrayUnique();
      System.out.println("only duplicate elements");
      au.duplicateEle(b);
      System.out.println("frequency of duplicate elements");
      au.frequencyEle(b);
      au.firstDupEle(b);
      au.lastDupEle(b);
      au.maxDupEle(b);
 
   }
}

class ArrayUnique
{
   void duplicateEle(int a[])
   { 
      int b[] = new int[a.length];
      boolean s =false;
      for(int x=0; x<a.length; x++)
      {
          int count=1;
          if(b[x]==1)
            continue;
          for(int y=x+1; y<a.length; y++)
          {
             if(a[x] == a[y])
             {
                 count++;
                 s = true;
                 b[y] =1;
             }
          }
          if(count>1)
             System.out.println(a[x]);
        }
       if(s==false)
            System.out.println("no duplicate element");
    }

   void frequencyEle(int a[])
   { 
      int b[] = new int[a.length];
      for(int x=0; x<a.length; x++)
      {
          int count=1;
          if(b[x]==1)
            continue;
          for(int y=x+1; y<a.length; y++)
          {
             if(a[x] == a[y])
             {
                 count++;
                 b[y] =1;
             }
          }
          if(count>1)
            System.out.println("count of "+a[x]+" ==> "+count);
       }
   }
   
   void firstDupEle(int a[])
   { 
      int b[] = new int[a.length];
      for(int x=0; x<a.length; x++)
      {
          int count=1;
          if(b[x]==1)
            continue;
          for(int y=x+1; y<a.length; y++)
          {
             if(a[x] == a[y])
             {
                 count++;
                 b[y] =1;
             }
          }
          if(count>1)
          {
            System.out.println("first duplicate element is "+a[x]);
            break;
          }
      }
   }
   
  void lastDupEle(int a[])
   { 
      int b[] = new int[a.length];
      int z=-1;
      for(int x=0; x<a.length; x++)
      {
          int count=1;
          if(b[x]==1)
            continue;
          for(int y=x+1; y<a.length; y++)
          {
             if(a[x] == a[y])
             {
                 count++;
                 b[y] =1;
                 z=x;
             }
          }
      }
      System.out.println("last duplicate element is "+a[z]);

    }

   void maxDupEle(int a[])
   { 
      int b[] = new int[a.length];
      int max = Integer.MIN_VALUE;
      for(int x=0; x<a.length; x++)
      {
          int count=1;
          if(b[x]==1)
            continue;
          for(int y=x+1; y<a.length; y++)
          {
             if(a[x] == a[y])
             {
                 count++;
                 b[y] =1;
                 if(a[x]>max)
                 {
                    max = a[x];
                 }
             }
          }
      }
      System.out.println("max duplicate element is "+max);

    }

}
              
                  
