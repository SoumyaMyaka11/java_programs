class Swap
{ 

  public static void main(String args[])
   

   {
      int num1 = 30;
      int num2 = 20;
      int num3 = 0;
      System.out.println("before swapping num1= "+num1 + "\n and num2 = " +num2);
      num3 = num1;
      num2 = num1;
      num1 = num3;
      System.out.println("after swapping num1= "+num1 + "\n and num2 = " +num2);
   }

}