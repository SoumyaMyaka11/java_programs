class Ternary
{
  public static void main(String args[])
  {
    int num1=70, num2 = 70;
    String result = num1==num2 ? "both are equal" : num1>num2 ? "num1 is greater" : "num2 is greater" ;
    System.out.println(result);
    //System.out.println(num1==num2 ? "both are equal" : num1>num2 ? num1 : num2 );


   System.out.println("_________________________________________");

   int month = 45;
   String result1 = month==1 || month==3 || month==5 || month==7 || month==8 ||month==10 || month==12 ? "30 days" : month==4 || month==6 || month==9 ||month==11 ? "30                                   days" : month==2 ? "28 or 29 days" : "invalid month number" ;
   System.out.println(result1);


  System.out.println("__________________________________________");

   
  }

}
