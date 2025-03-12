class LeapYear
{
   public static void main(String args[])
   {
     int year = 1904;
     if(year<0)
       System.out.println("Given year is negative which is invalid");
     else if(year>0)
     {
       if(year%4==0 && year%100!=0 || year%400==0)
          System.out.println("Given year "+year+" is leap year");
       else
          System.out.println("Given year "+year+"  is not a leap year");
     }
     else
       System.out.println("Invalid input");
   }
}
