class Book
{
  public static void main(String args[])
  {
    String course = "b.tech";
    int book_price = 500;
    if(course == "b.tech" || course=="b.sc")
    {  
       int days = 18;
       int perday_charge = 10;
       if(days < 15)
           System.out.println(" No money to be paid");
       else if (days<=30)
       {
          int amount = days*perday_charge;
          System.out.println("Amount to be paid " + amount);
       }
       else
           System.out.println("Amount to be paid " + book_price);
    }
    else
      {
       System.out.println("you are not allowed to library");
      }
 }

}

