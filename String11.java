class String11
{
    public static void main(String args[])
    {
         String str ="a bc def ghijk lm nop qrs tuvw";
         String rev ="";
         for(int x=0; x<str.length(); x++)
         {
            char c = str.charAt(x);
            if(c!=' ')
            {
                rev = c + rev;
            }
         }
         System.out.println(rev);
         String str1[] = str.split(" ");
         String str2 ="";
         int y=0;
         for(String t:str1)
         {
            for(int x=0; x<t.length(); x++)
            {
           
               str2 = str2+rev.charAt(y);;
               y++;
            }
            str2 = str2+" ";
         }
         System.out.println(str2);
                

     }
}