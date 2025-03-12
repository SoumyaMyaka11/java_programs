class Table
{
  public static void main(String args[])
  {
   int n=8,start =1,end=10,product=1;
   /*while(start<=end)
   {
      product = n*start;
      System.out.println(n+" x "+start+" = "+product);
      start++;
   }

   System.out.println("__________________________________");

    start=10 ; end=1;
   while(start>=end)//10>=1t
   {
      product = n*start;
      System.out.println(n+" x "+start+" = "+product);
      start--;
   }

   System.out.println("______________________________________");
   start = 1;*/

   while(start<=end)
   {
      product = n*start;
      double square = Math.sqrt(product); 
      int result = (int)square;
      if(result*result == product)
      {
        System.out.println(product+" is multiple of 8 and "+product+"  is also a                                                                                                                                                                                                                                                                                                                                      perfect square");
      }
      start++;
   }


 }

}