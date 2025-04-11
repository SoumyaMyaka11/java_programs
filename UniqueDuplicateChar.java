import java.util.Scanner;
class UniqueDuplicateChar
{
    public static void main(String args[])
    {
         Scanner s = new Scanner(System.in);
         System.out.println("enter input string");
         String str = s.nextLine();
         StringDupUnqiue obj = new  StringDupUnqiue();
         System.out.println("unique characters are");
         obj.toFindUniqueChar(str);
         System.out.println("duplicate characters are");
         obj.toFindDupChar(str);

    }
}

class StringDupUnqiue
{
    void toFindUniqueChar(String str)
    {
       for(int x=0; x<str.length(); x++)
       {
          char c = str.charAt(x);
          if(str.indexOf(c)==str.lastIndexOf(c))
          {
             System.out.println(c);
          }
       }
    }
    void toFindDupChar(String str)
    {
       String s1 ="";
       for(int x=0; x<str.length(); x++)
       {
          char c = str.charAt(x);
          if(str.indexOf(c)!=str.lastIndexOf(c))
          {
             if(s1.indexOf(c)==-1)
             {
                 s1=s1+c;
              }
           }
       }
       System.out.println(s1); 
    }
}