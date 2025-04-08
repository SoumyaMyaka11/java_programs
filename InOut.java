import java.util.Scanner;
class InOut 
{
  int[] arrayInput(int a[])
  {
     Scanner s = new Scanner(System.in);
     System.out.println("enter array elements");
     for(int x=0; x<a.length; x++)
     {
      a[x] = s.nextInt();
     }
     return a;
  }
  void printArray(int arr[])
  {
    for(int x=0; x<arr.length; x++)
    {
      System.out.println(arr[x]);
    }
  }

}

 
