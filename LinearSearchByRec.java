import java.util.Scanner;
class LinearSearchByRec
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter array size");
        int a[] = new int[s.nextInt()];
        InOut io = new InOut();
        int b[] = io.arrayInput(a);
        LinearSearch obj = new LinearSearch();
        System.out.println("enter search element");
        int ele = s.nextInt();
        obj.checkEle(b,0,ele);
     }
}

class LinearSearch
{
   int searchArray(int a[] ,int index, int ele)
   {
       if(index== a.length)
       {
           return -1;
       }
       else
       {
           if(a[index]==ele)
                return index;
           else
               return searchArray(a,index+1,ele);
        }
    } 
    void checkEle(int a[],int index, int ele)
    {
        
        int index_value = searchArray(a,0,ele);
        if(index_value!=-1)
        {
            System.out.println("element found at index "+index_value+" and element is "+a[index_value]);
        }
        else
        {
           System.out.println("element not found");
        }
     }
}