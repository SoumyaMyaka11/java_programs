class Privilage
{
  public static void main(String args[])
  {
    int age = 45;
    if(age<0)
        System.out.println("Given age is negative");
    else if(age<18)
        System.out.println("you are not applicable for scholarship and retirement policy because you are minor");
    else if(age<=60)
      {
       String degree = "G";
       if(degree == "UG")
           System.out.println("your scholarship amount is 30000 per year");
       else if(degree == "PG")
           System.out.println("your scholarship amount is 40000 per year");
       else
           System.out.println("your scholarship amount is 20000 per year because you are neither UG or PG");
      }
    else if(age<=100)
       {
         String gender = "male";
         if(gender == "female")
            System.out.println("your scholarship amount is 30000 per year");
         else
            System.out.println("your scholarship amouny is 35000 per year");
       }
     else
         System.out.println(" invalid input since age is above 100");



    


    
 
  }

}
