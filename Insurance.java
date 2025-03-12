class Insurance
{
  public static void main(String args[])
  {
    int age = 29;
    if(age>=25 && age<=35)
    {
      String condition = "execellent";
      if(condition=="execellent")
      {
         String location = "city";
        String gender = "female";
        if(location=="city" && gender=="male")
        {
          double policy =200000;
          if(policy>=0 && policy<=200000)
          {
           double premium_amount = 4*policy/1000;
           System.out.println("for 200000 policy premiun amount is "+premium_amount);
          }
          else
          System.out.println("your are not eligible since your policy exceeds 200000 lakhs");
         }
        else if(location=="city" && gender=="female")
         {
          double policy = 100000;
          if(policy>=0 && policy>=100000)
          {
            double premium_amount = 3*policy/1000;
            System.out.println("for 100000 policy premium amount is  "+premium_amount);
          }
          else
            System.out.println("your are not eligiblt since your policy exceed 100000"); 
          }
        }
      else if(condition=="poor")
      {
         String location="village";
         String gender = "male";
         if(location=="village" && gender=="male")
         {
           double policy = 10000;
           if(policy>=0 && policy<=10000)
            {
             double premium_amount = 6*policy/1000;
             System.out.println(premium_amount);
            }
            else
             System.out.println("your policy exceeds 10000 hence you are not eligible for premium policy");
         }
          else
            System.out.println("your are not eligible for premium policy since you are female village local");
         
       }
     }
     else
       System.out.println(" you are not eligible for insurance premium");
 }

}

     