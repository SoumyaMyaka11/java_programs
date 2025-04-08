import java.util.Scanner;
import java.util.Arrays;
class StringAnagram
{
     public static void main(String args[])
     {
        Scanner s = new Scanner(System.in);
        System.out.println("enter string 1");
        String str1 = s.nextLine();
        System.out.println("enter string 2");
        String str2 = s.nextLine();
        Anagram obj = new Anagram("xyz");
        obj.isStringAnagram(str1,str2);
        System.out.println(obj);
        
      }
}

class Anagram
{
    void isStringAnagram(String str1, String str2)
    {
       if(str1.length()!=str2.length())
       {
           System.out.println("given strings are not anagrams");
       }
       else
       {
          char s1[] = str1.toCharArray();
          char s2[] = str2.toCharArray();
          Arrays.sort(s1);
          Arrays.sort(s2);
          if(Arrays.equals(s1,s2))
              System.out.println("given strings are anagrams");
          else
              System.out.println("given strings not anagrams");
       }

    }
    
    
}