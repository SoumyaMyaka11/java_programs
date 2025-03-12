class Profit
{ 
   public static void main(String args[])
   {
     double costprice = 300 ,sellingprice = 300;
     if(sellingprice>costprice)
     {
       double profit = (sellingprice-costprice)/costprice*100 ;
       System.out.println("percentage profit is "+profit);
     }
     else if(sellingprice<costprice)
     {
      double loss = (costprice-sellingprice)/costprice*100 ;
      System.out.println("percentage loss is "+loss);
      }
     else if(sellingprice == costprice)
       System.out.println(" Neither profit nor loss");
   }
}