import java.util.Scanner;
class PalindromeWordInString
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter input string");
        String str = s.nextLine();
        WordPalin obj = new WordPalin();
        obj.isWordPalindrome(str);
        obj.palinWithoutMethod(str);
        obj.reverseWordInString(str);
    }
}

class WordPalin
{
   void isWordPalindrome(String str)
   {
       String str1[] = str.split(" ");
       for(String t:str1)
       {
           String s2 = t;
           StringBuffer sb = new StringBuffer(s2);
           //or sb.reverse(); 
           //if(s2.contentEquals(sb))
           String str2=sb.reverse().toString();
           if(s2.equalsIgnoreCase(str2))
                  System.out.println(s2+" is palindrome");
       }
   }
   void palinWithoutMethod(String str)
   {
       String str1[] = str.split(" ");
       for(String t:str1)
       {
          String str2=t,rev="";
          for(int x=0; x<str2.length(); x++)
          {
             char c = str2.charAt(x);
             rev = c + rev;
          }
          if(str2.equalsIgnoreCase(rev))
               System.out.println(str2+" is palindrome");
       }
   }

   void reverseWordInString(String str)
   {
        String str1[] = str.split(" ");
        String str3="";
        for(String t:str1)
        {
           String str2 = t;
           StringBuffer sb = new StringBuffer(str2);
           sb.reverse();
           str3 = str3+sb+" ";
           //str3 = str3.concat(sb+" ");
        }
        System.out.println(str3);
   }
}