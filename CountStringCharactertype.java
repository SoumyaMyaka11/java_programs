import java.util.Scanner;
class CountStringCharactertype
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter input string");
        String str = s.nextLine();
        LetterDigitSymbol obj = new  LetterDigitSymbol();
        obj.countCharType(str);
    }
}

class LetterDigitSymbol
{
   void countCharType(String str)
   {
     int digit_count=0,vowel_count=0,cons_count=0,caps_count=0,small_count=0,symbol_count=0,space_count=0;  
     for(int x=0; x<str.length(); x++)
     {
        char c = str.charAt(x);
        if(c>='0' && c<='9')
             digit_count++;
        else if(c>='A' && c<='Z')
        {
            caps_count++;
            if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
                  vowel_count++;
            else
                cons_count++;
        } 
        else if(c>='a' && c<='z')
        {
            small_count++;
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                  vowel_count++;
            else
                cons_count++;
        } 
        else if(c==' ')
                space_count++;
        else
             symbol_count++;
      }
      System.out.println(str.length());
      System.out.println("digits count is "+digit_count);
      System.out.println("caps count is "+caps_count);
      System.out.println("small letter count is "+small_count);
      System.out.println("vowel count is "+vowel_count);
      System.out.println("consonant count is "+cons_count);
      System.out.println("spaces count is "+space_count);
      System.out.println("symbol count is "+symbol_count);
  }
}


