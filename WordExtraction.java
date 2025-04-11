import java.util.Scanner;
class WordExtraction
{
    public static void main(String args[])
    {
         Scanner s = new Scanner(System.in);
         System.out.println("enter input string");
         String str = s.nextLine();
         StringWord obj = new StringWord();
         System.out.println(obj.printWordOfString(str));
    }
}

class StringWord
{
    String printWordOfString(String str)
    {
          String str1[] = str.split(" ");
          String s1 ="";
          for(String t:str1)
          {
              char c = t.charAt(0);
              s1 = s1+c;
          }
          return s1;
    }
}
    