class Switch
{
   public static void main(String args[])
   {
    char operator = '/';
    double num1 = 6,num2=7;
    switch(operator)
    {
     case '+':
          System.out.println("sum of "+num1+" and "+num2+ " is "+(num1+num2));
          break;
     case '-':
       	  System.out.println("difference of "+num1+" and"+num2+ " is "+(num1-num2));
          break;
     case '*':
       	  System.out.println("product of "+num1+" and"+num2+ " is "+(num1*num2));
          break;
     case '/':
       	  System.out.println("divison of "+num1+" and"+num2+ " is "+(num1/num2));
          break;
     case '%':
          System.out.println("mod of "+num1+" and"+num2+ " is "+(num1%num2));
          break;
     case '>':
          if(num1>num2)
            System.out.println("num1 is greater");
          else 
            System.out.println("num1 is not greater");
          break;
     case '<':
          if(num1<num2)
           System.out.println("num2 is greater");
          break;
     default:
         System.out.println("Invalid symbol");  
    
     }


     
   }
}

    


