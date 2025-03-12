class Age 
{
  public static void main(String args[])
  {
   int age = 160;
   if(age<0)
   {
     System.out.println("Provided age is negative" + "\n Please provide valid input");
   }
   else if(age<10)
   {
     System.out.println(age+ " kid ");
   }
   else if (age<18)
   {
     System.out.println(age+ " minor ");
   }
   else if(age<=60)
   {
     System.out.println(age+ " major ");
   }
   else if(age<=100)
   {
     System.out.println(age+ " senior citizen ");
   }
   else
   {
     System.out.println(" age is above 100 " + "\n provide age below 100 and above 0");
   }
 }
 
}