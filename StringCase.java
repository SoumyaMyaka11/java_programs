import java.util.Scanner;
class StringCase
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter input string");
        String str = s.nextLine();
        CaseConversion obj = new CaseConversion();
        System.out.println(obj.convertString(str));
    }
}

class CaseConversion
{
    String convertString(String str)
    {
       String res ="";
       for(int x=0; x<str.length(); x++)
       {
          char c = str.charAt(x);
          if(c>='A' && c<='Z')
          {
             res = res + (char)(c+32);
          }
          else if(c>='a' && c<='z')
          {
             res = res + (char)(c-32);
          }
          else
             res = res + c;
        } 
        return res;
     }
}


