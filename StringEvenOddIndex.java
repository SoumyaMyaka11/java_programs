import java.util.Scanner;
class StringEvenOddIndex
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter input string");
        String str = s.nextLine();
        StringIndex obj = new StringIndex();
        obj.evenOddIndex(str);

    }
}

class StringIndex
{
   void evenOddIndex(String str)
   {
        String even_str ="";
        String odd_str ="";
        String str1 = "";
        for(int x=0; x<str.length(); x++)
        {
             if(x%2==0)
             {
                even_str = even_str + str.charAt(x);
             }
             else
             {
                odd_str = odd_str + str.charAt(x);
             }
       } 
       String str2 ="";
       for(int x=0; x<even_str.length(); x++)
       {
          char c = even_str.charAt(x);
          str2 = c + str2;
       }
       System.out.println("even index string is "+even_str);
       System.out.println("odd index string is "+odd_str);
       System.out.println(str2+odd_str);
   }
}