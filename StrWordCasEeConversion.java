import java.util.Scanner;
class StrWordCasEeConversion
{
    public static void main(String args[])
    {
       Scanner s = new Scanner(System.in);
       System.out.println("enter input string");
       String str = s.nextLine();
       WordCaseConversion obj = new WordCaseConversion();
       System.out.println(obj.conversion(str));
       System.out.println(obj.conversion1(str));
    }
}

class WordCaseConversion
{
    String conversion(String str)
    {
         String str1[] = str.split(" ");
         if(str1.length == 1)
               return str1[0].toUpperCase();
         else
         {
            str1[0] = str1[0].toUpperCase();
            str1[str1.length-1]=str1[str1.length-1].toUpperCase();
            String str2 = "";
            for(int x=0; x<str1.length; x++)
            {
               str2 = str2.concat(str1[x]+" ");
            }
            return str2;
         }
         /*else
         {
           str1[0]=str1[0].toUpperCase();
           str1[str1.length-1]=str1[str1.length-1].toUpperCase();
           StringBuffer sb = new StringBuffer();
           for(int x=0; x<str1.length; x++)
           {
             sb.append(str1[x]+ " ");
           }
           return sb.toString();
         }*/
    }
    String conversion1(String str)
    {
       str = str.toLowerCase();
       String str1[] =str.split(" ");
       String str2="";
       for(String t:str1)
       {
          char c = (char)(t.charAt(0)-32);
           str2 =str2+c;
          for(int x=1; x<t.length(); x++)
          {
            str2 = str2+t.charAt(x);
          }
          str2 = str2+" ";
       }
       return str2;
    }
}