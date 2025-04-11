import java.util.Scanner;
class StringRotation
{
    public static void main(String args[])
    {
       Scanner s = new Scanner(System.in);
       System.out.println("enter input string");
       String str = s.nextLine();
       RotationOfString obj = new RotationOfString();
       obj.toRotateString(str);
    }
}

class RotationOfString
{

  void toRotateString(String str)
  {
     char c1[] =  str.toCharArray();
     String str1="";
     for(int y=1; y<=2;y++)
     {
       char c = c1[c1.length-1];
       for(int x=c1.length-2; x>=0; x--)
       {
        
        c1[x+1] =c1[x];
       }
       c1[0] = c;
     }
     for(char t:c1)
          str1 = str1+t;
     System.out.println(str1);
     if(str.equalsIgnoreCase(str1))
            System.out.println("both are equal");
     else
         System.out.println("both are not equal");

  }
}
        