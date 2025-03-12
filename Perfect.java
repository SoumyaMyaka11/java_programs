class Perfect
{
  public static void main(String args[])
  {
   int num = 26;
   double result = Math.sqrt(num);
   int result1 = (int)(result);
   String result2 = (result == result1) ? "It is a perfect square" : "It is not a perfect square" ;
   System.out.println(result2);
   
   
  }
}