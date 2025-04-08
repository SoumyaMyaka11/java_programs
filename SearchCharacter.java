import java.util.Scanner;
import java.util.Arrays;
class SearchCharacter
{
   public static void main(String args[])
   {
       Scanner s = new Scanner(System.in);
       System.out.println("enter input string");
       String str = s.nextLine();
       System.out.println("enter character to search");
       char search = s.next().charAt(0);
       char arr[] = str.toCharArray();
       Arrays.sort(arr);
       BinarySearch obj = new BinarySearch();
       obj.isElePresent(arr,search);
    }
}

class BinarySearch
{
    int searchChar(char arr[],int l, int r, char search)
    {
        if(l>r)
        {
           return -1;
        }
        else
        {
            while(l<=r)
            {
               int mid =(l+r)/2;
               if(search == arr[mid])
               {
                   return mid;
               }
               else if(search>arr[mid])
               {
                  l = mid+1;
                  return searchChar( arr,l,r,search);
               }
               else if(search<arr[mid])
               {
                  r = mid-1;
                  return searchChar(arr,l,r,search);
               }
             } 
             return 0;
          }
      }
      
     void isElePresent(char arr[], char search)
     {
       
        int l=0;
        int r=arr.length-1;
        int res = searchChar(arr,l,r,search);
        if(res!=-1)
            System.out.println("character found at index "+res+" and character is "+arr[res]);
        else
            System.out.println("character not found");
     }
}
             
  