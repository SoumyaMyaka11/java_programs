import java.util.Scanner;
class ReverseString
{
    public static void main(String args[])
    {
       Scanner s = new Scanner(System.in);
       System.out.println("enter input string");
       String str = s.nextLine();
       Reverse obj = new  Reverse();
       System.out.println(obj.findReverseString(str));
       
     }
}

class Reverse
{
   String findReverseString(String str)
   {
      String rev1 ="",rev2="";
      for(int x=0; x<str.length(); x++)
      {
         char c = str.charAt(x);
         rev1 = c + rev1;
      }
      for(int x=str.length()-1; x>=0; x--)
      {
         char c = str.charAt(x);
         rev2 = rev2+c;
      }

      return rev1;
   }
}
   