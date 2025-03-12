class Product
 {
    public static void main(String[] args) 
  {
         
      String product_name = "laptop";
      char pcode = 'A';
      int p_price = 40000;
      byte p_quantity = 4;
      double total_price = p_price*p_quantity;
      double tax = 4*18*p_price/100;
      float discount = 17.0f; 
      double discount1;

      if(total_price > 100000)
      { 
         discount1 = (float)(discount/total_price *100);
      }
      else
      {
        discount1 = 0;
      }
      
      short delivary_charges = 75;
      double coupon =  5*(double)(total_price)/100;
      double final_price = total_price + tax + delivary_charges - discount1 - coupon;
      System.out.println(final_price);
    }




    
}