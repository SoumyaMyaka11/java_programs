 class Character
{ 
  public static void main(String args[])
  {
    char ch = 'a';
    if(ch>='A' && ch<='Z')
       System.out.println(ch+" uppercase letter");
    else if(ch>='a' && ch<='z')
       System.out.println(ch+" lowercase");
    else if(ch>='0' && ch<='9')
       System.out.println(ch+ " digit");
    else if(ch==' ')
      System.out.println(ch+" space");
    else
      System.out.println(ch+" symbol");
   }
}
 