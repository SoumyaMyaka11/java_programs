class Alphabet

{

   public static void main(String args[])
   {
  
    int num = 500;
    char ch1 = 's';
    char ch2 = 'S';
    int value1 = ch1;
    if(value1 > num)
    {
   
    System.out.println((char)(value1-32));
    }
    else
    {
    System.out.println((char)(ch2+32));
    }
  }
}