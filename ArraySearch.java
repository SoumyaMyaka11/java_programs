import java.util.Scanner;
class ArraySearch
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      System.out.println("enter size of array");
      int a[] = new int[s.nextInt()];
      System.out.println("enter array a elemnts");
      for(int x=0; x<a.length; x++)
      {
         a[x] = s.nextInt();
      }
      System.out.println("enter the element you wanna search");
      int ele = s.nextInt();
      boolean b = false;
      for(int x=0; x<a.length; x++)
      {
         if(ele == a[x])
         {
            b = true;
            break;
         }
      }
      if(b)
         System.out.println("element found "+ele);
      else 
         System.out.println("element not found "+ele);
      
    }
}
