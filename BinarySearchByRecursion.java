import java.util.Scanner;
class BinarySearchByRecursion
{
    public static void main(String args[])
    {
       Scanner s = new Scanner(System.in);
       System.out.println("enter array size");
       int a[] = new int[s.nextInt()];
       InOut io = new InOut();
       int b[] = io.arrayInput(a);
       System.out.println("enter element to search");
       int ele = s.nextInt();
       BinarySearch obj = new BinarySearch();
       obj.isElePresent(b,ele);
    
    }
}

class BinarySearch
{
   int[] sortArray(int a[], int index)
   {
          if(index==a.length-1)
          {
               return a;
          }
          else
         { 
                 int t = index;
                 for(int x=t+1; x<a.length; x++)
                 {
                     if(a[t]>a[x])
                     {
                         int temp = a[t];
                         a[t] = a[x];
                         a[x] = temp;
                     }
                 }
                return sortArray(a,index+1);
           }
      }
     int searchEle(int a[],int l,int r, int ele)
     {
         if(l>r)
         {
             return -1;
         }
         else
         {
            while(l<=r)
            { 
                  int mid = (l+r)/2;
                  if(ele==a[mid])
                  {
                       return mid;
                  }
                  else if(ele>a[mid])  
                  {
                       l = mid+1;
                       return searchEle(a,l,r,ele);
                  }
                  else if(ele<a[mid])
                 {
                      r = mid-1;
                      return searchEle(a,l,r,ele);
                 }
            }
          
        }
        return 0;  
    }
    
    void isElePresent(int a[] , int ele)
    {
        int arr[] = sortArray(a,0);
        System.out.println("array after sorting");
        for(int t:arr)
             System.out.println(t);
        int l = 0, r = arr.length-1;
        int res = searchEle(arr,l,r,ele);
        if(res!=-1)
           System.out.println("element found at index "+res+" and element is "+arr[res]);
        else
           System.out.println("element not found");
    }
}