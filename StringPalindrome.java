import java.util.Scanner;
class StringPalindrome
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter input string");
        String str = s.nextLine();
        PalinString obj = new PalinString();
        //obj.printPalinString(str);
        obj.digitString(str);

    }
}

class PalinString
{
     String calReverse(String str)
     {
        String rev = "";
        for(int x=0; x<str.length(); x++)
        {
           rev = str.charAt(x) + rev;
        }
        return rev;
     }
    void printPalinString(String str)
    {
       String rev = calReverse(str);
       if(rev.equals(str))
            System.out.println(str+" is palindrome");
       else if(rev.equalsIgnoreCase(str))
            System.out.println(str+" is palindrome");
       else 
           System.out.println(str+" is not a palindrome");
    }
    void digitString(String str)
    {
         String digits = "";
         for(int x=0; x<str.length(); x++)
         {
            char c = str.charAt(x);
            if(c>='0' && c<='9')
            {
                digits = digits + c;
            }
         }
         System.out.println(digits);
         String rev="";
         for(int x=0; x<digits.length(); x++)
         {
            char c = digits.charAt(x);
            rev = c + rev;
         }
         if(digits.equals(rev))
              System.out.println(rev+" palindrome");
         else
             System.out.println(rev+"  not palindrome");
    }

}  
