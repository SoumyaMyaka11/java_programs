import java.util.Scanner;
class ArraySearch
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      System.out.println("enter size of array");
      int a[] = new int[s.nextInt()];
      InOut io = new InOut();
      int b[] = io.arrayInput(a,a.length);
      System.out.println("enter the element you wanna search");
      int ele = s.nextInt();
      Search search = new Search();
      boolean res = search.eleSearch(a,ele);
      if(res)
         System.out.println("element found ");
      else 
         System.out.println("element not found ");
      
    }
}

class Search
{
  boolean eleSearch(int a[],int ele)
  {
      boolean b = false;
      for(int x=0; x<a.length; x++)
      {
         if(ele == a[x])
         {
           b = true;
           break;
         } 
      }
      return b;
   }
}

