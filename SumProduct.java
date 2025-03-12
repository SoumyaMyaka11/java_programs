class SumProduct
{
  public static void main(String args[])
  {
   int n=1 ,end=5,sum=0;
   long product=1l;
   int start=n;// start=1
   while(start<=end)//1<=10t 2<=10t
   {
    sum+=start;// sum=sum+start=0+1=1 1+2=3
    product*=start;//product=product*start=1*1=1 1*2=2
    start++;//2 3
   }
   System.out.println("The sum of numbers between "+n+" and "+end+" is  "+sum);
  System.out.println("The product of numbers between "+n+" and "+end+" is  "+product);
}

}
   
