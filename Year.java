class Year
{
   public static void main(String args[])
    {
      int days = 700, year = 365, month = 30;
      int year1 = days/year;
      int m1 = days%year;
      int month1 = m1/month;
      int d1 = m1%month;
      System.out.println( year1+" year " +month1+" months "+d1+" days");
    }
}
      