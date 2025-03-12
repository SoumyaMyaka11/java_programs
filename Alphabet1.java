class Alphabet1

{

   public static void main(String args[])
   {
  
    
    char ch1 = 's';
    char ch2 = 'g';
    int value1 =ch1;
    if(value1 == (ch2+32))
    {
   
    System.out.println("Both are same");
    }
    else
    {
    System.out.println("Both are not same");
    }
    
    String result = (value1 == (ch2+32)) ? "both are same" : "both are not same" ;
    System.out.println(result);
  }
}