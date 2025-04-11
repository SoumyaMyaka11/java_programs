import java.util.Scanner;
class MissingAlphabet
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter input string");
        String str = s.nextLine();
        StringAlphabet obj = new StringAlphabet();
        System.out.println("missing characters are");
        obj.findMissingAlphabet(str);
     }
}

class StringAlphabet
{
    void findMissingAlphabet(String str)
    {
       
        String str1 =str.toLowerCase();
        for(char x='a'; x<='z'; x++)
        {
           int count=0;
           for(int y=0; y<str1.length(); y++)
           {
              char c = str1.charAt(y);
              if(c==x )
               {
                   count++;
               }
            }
            if(count==0)
                 System.out.println(x);
         }
     }
}
                  
  