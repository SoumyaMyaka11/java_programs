class Largest 
{
  public static void main(String args[])
   {
     int num1= 40,num2=90,num3=60;
     if(num1>num2)//40 > 30
     {
       if(num1>num3)//40>20
           System.out.println(num1+" num1 is greater");
        else
           System.out.println(num3+" num3 is greater");
     }
     else if(num2>num3)
          System.out.println(num2+ " num2 is greater");
     else
          System.out.println(num3+" num3 is greater");
   }

}