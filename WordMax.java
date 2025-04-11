import java.util.Scanner;
class WordMax
{
    public static void main(String args[])
    {
         Scanner s = new Scanner(System.in);
         System.out.println("enter input string");
         String str = s.nextLine();
         LengthOfWord obj = new LengthOfWord();
         obj. toFindMaxLength(str);
     }
}

class LengthOfWord
{
     void toFindMaxLength(String str)
     {
         String s1[] = str.split(" ");
         int max_length=0;
         String s2="";
         for(String t:s1)
         {
            int length = t.length();
            if(length>=max_length)
            {
                if(length>max_length)
                {
                   max_length=length;
                   s2 = t;
                }
                else if(length>=max_length)
                {
                   max_length=length;
                   s2 = s2+" "+t;
                }
             }
         }
         System.out.println("maximum length of word "+max_length);
         System.out.println("word(s) with maximum length "+"\n"+s2);
 
      }
  }    