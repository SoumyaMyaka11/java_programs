import java.util.Scanner;
class StringMaxVowelCount
{
    public static void main(String args[])
    {
         Scanner s = new Scanner(System.in);
         System.out.println("enter input string");
         String str = s.nextLine();
         CharacterCount obj = new CharacterCount();
         obj.vowelCount(str);
     }
}

class CharacterCount
{
     void vowelCount(String str)
     {
         String str1 = str.toLowerCase();
         int a_count=0,e_count=0,i_count=0,o_count=0,u_count=0;
         String str2 =""; 
         int max = Integer.MIN_VALUE;
         for(int x=0; x<str1.length(); x++)
         {
            char c = str1.charAt(x);
            if(c=='A' || c=='a')
                  a_count++;
            else if(c=='E' || c=='e')
                    e_count++;
            else if(c=='I' || c=='i')
                    i_count++;
            else if(c=='O' || c=='o')
                    o_count++;  
            else if(c=='U' || c=='u')
                   u_count++;   
         }
         System.out.println(" vowel a count is "+a_count);
         System.out.println(" vowel e count is "+e_count);
         System.out.println(" vowel i count is "+i_count);
         System.out.println(" vowel o count is "+o_count);
         System.out.println(" vowel u count is "+u_count);
         str2 = str2+a_count+e_count+i_count+o_count+u_count;
         int num = Integer.parseInt(str2);
         while(num!=0)
         {
            int rem = num%10;
               if(rem>max)
               {
                   max = rem;
               }
             num = num/10;
          }
          if(max==a_count)
              	System.out.println("most repeated vowel is ==> a and count is "+a_count);
          if(max==e_count)
              	System.out.println("most repeated vowel is ==> e and count is "+e_count);
          if(max==i_count)
              	System.out.println("most repeated vowel is ==> i and count is "+i_count);
          if(max==o_count)
              	System.out.println("most repeated vowel is ==> o and count is "+o_count);
          if(max==u_count)
              	System.out.println("most repeated vowel is ==> u and count is "+u_count);
          

         
     }
}  