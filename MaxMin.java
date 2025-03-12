class MaxMin
{
   public static void main(String args[])
   {
    int num=123,temp=num, rem=0,max=0;
    while(num!=0)
    {
      rem = num%10;
      if(rem>max)
         max = rem;
      num = num/10;
    } 

    num =temp;
    int second_max=0;
    while(num!=0)
    {
      rem = num%10;
      if(rem<max)
        if(rem>second_max)
              second_max=rem;
      num = num/10;
    }
    System.out.println("second maximum digit of "+temp+" is "+second_max);
   
    /*System.out.println("______________________________________");

   int num1 = 3452678 , temp1=num1, rem1=0;
   int min = num1%10;//3
   while(num1!=0)// 12!=0t 1!=0t 0!=0t
   {    
     rem1 = num1%10;//2 1
     if(rem1<min)// 2<3 1<2
        min = rem1;// 2  1
     num1 = num1/10;// 1 0
   } 
  System.out.println("minimum digit of "+temp1+" is "+min);*/
}

}