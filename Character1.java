class Character1
{
  public static void main(String args[])
  {
    char ch = 'S';
    if(ch>='A' && ch<='Z')
       System.out.println((char)(ch+32));
    else if(ch>='a' && ch<='z')
        System.out.println((char)(ch-32));
    else
       System.out.println(" given character is not an upper and lower case alphabet");
   }
}