class Product1
{
  public static void main(String args[])
  {
   String pname = "earbuds";
   char pcode = 'a';
   int price = 3000;
   int quantity = 2;
   double total = price*quantity ;
   double discount = 0;
   if(total>=1000 && total < 2000)
   {  
      discount = 10*total/100 ;
      
   }
   else if(total>=2000 && total<3000)
   {
      discount = 5*total/100 ;
   }
   else if(total>=3000 && total<4000)
   {
     discount = 2*total/100 ;
   }
   else if(total >=4000)
   { 
     double discount1;
     discount1 = 30*total/100 ;
     if(discount1<1400)
        discount = discount1;
     else
        discount = 1400;
   }
  double final_total;
  final_total = total - discount;
  double tax = 18*final_total/100 ;
  double bill = final_total - tax;
  System.out.println("product name      : "+pname);
  System.out.println("product code      : "+pcode);
  System.out.println("product price     : "+price);
  System.out.println("product quantity  : "+quantity);
  System.out.println("total amount      : "+total);
  System.out.println("discount amount   : "+discount);
  System.out.println("final amount      : "+final_total);
  System.out.println("tax amount        : "+tax);
  System.out.println("total bill amount : "+bill);
 }

}