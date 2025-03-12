class Month
{
   public static void main(String args[])
    
   {
     // 31 days = 1,3,5,7,8,10,12  30 days = 4,6,9,11 28 days = 2
      
      int month = 15;
      if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
      {
        System.out.println(" This month has 31 days");
      }
      else if(month==4 || month==6 ||month==9 || month==11)
      {
        System.out.println("This month has 30 days");
      }
      else if(month==2)
      {
        System.out.println("This month has 28 or 29 days");
      }
      else
      {
        System.out.println("Invalid input"+ "\nProvide valid value of month");
      }
  }

}