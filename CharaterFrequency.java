import java.util.Scanner;
class CharaterFrequency
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter input string");
        String str = s.nextLine();
        char c_arr[] = str.toCharArray();
        ElementFrequency obj = new ElementFrequency();
        obj.findEleFrequency(c_arr);
        System.out.println();
        System.out.println("unique characters in a string are ");
        obj.findUniqueChar(c_arr);
        System.out.println("\n"+"duplicate characters in a string are ");
        obj.findDuplicateChar(c_arr);
        obj.findMostRepeatedChar(c_arr);

     }
}

class ElementFrequency
{
    void findEleFrequency(char c_arr[])
    {
       int a[] = new int[c_arr.length];
       for(int x=0; x<c_arr.length; x++)
       {
            int count=1;
            if(a[x]==1)
              continue;
            for(int y=x+1; y<c_arr.length; y++)
            {
               if(c_arr[x]==c_arr[y])
               {
                 count++;
                 a[y]=1;
               }
            }
            System.out.println("frequency of "+c_arr[x]+" is "+count);

        }
    }
     void findUniqueChar(char c_arr[])
     {
           int a[] = new int[c_arr.length];
           for(int x=0; x<c_arr.length; x++)
           {
                int count=1;
                if(a[x]==1)
                   continue;
                for(int y=x+1; y<c_arr.length; y++)
                {
                   if(c_arr[x]==c_arr[y])
                   {
                      count++;
                      a[y]=1;
                  }
               }
               if(count==1)
                  System.out.println(c_arr[x]);
          }
     }
     void findDuplicateChar(char c_arr[])
     {
           int a[] = new int[c_arr.length];
           for(int x=0; x<c_arr.length; x++)
           {
                int count=1;
                if(a[x]==1)
                   continue;
                for(int y=x+1; y<c_arr.length; y++)
                {
                   if(c_arr[x]==c_arr[y])
                   {
                      count++;
                      a[y]=1;
                  }
               }
               if(count>1)
                  System.out.println(c_arr[x]);
          }
     }
     void findMostRepeatedChar(char c_arr[])
     {
           int a[] = new int[c_arr.length];
           int max = Integer.MIN_VALUE, second_max=Integer.MIN_VALUE,z=-1,s=-1;
           for(int x=0; x<c_arr.length; x++)
           {
                int count=1;
                if(a[x]==1)
                   continue;
                for(int y=x+1; y<c_arr.length; y++)
                {
                   if(c_arr[x]==c_arr[y])
                   {
                      count++;
                      a[y]=1;
                   }
               }
               if(count>max)
               {
                  second_max = max;
                  max=count;
                  s=z;
                  z=x;
               }       
          }
          System.out.println("most repeated character is "+c_arr[z]);
          System.out.println("second most repeated character is "+c_arr[s]);
     }



    
}
          