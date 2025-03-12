class IsPerfect
{

   public static void main(String args[])
   
  {
    
    int num = 36;
    int result = (int)Math.sqrt(num);
    if(result*result == num)
    {
     System.out.println("square root of "+num+" is " +result);
     System.out.println("The given number "+num +" is a  perfect square");
    }
    else 
    {
     System.out.println("square root of "+num+" is " +result);
     System.out.println("The given number "+num+" is not a perfect square");
    }
  
  }

}