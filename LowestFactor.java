class LowestFactor
{
   public static void main(String args[])
   {
     int num1=12,num2=6 ,end=2 , min=0;
     int start = (num1<num2) ? num1 : num2 ; //start =6
     System.out.println("The common factors of "+num1+" ,"+num2+" are:");
     while(start>=end)//6>=2t
     {
       if(num1%start==0 && num2%start==0)//3%6==0f
       {
         System.out.println(start);
         min = start;
       }
       start--;
     }
     System.out.println("least common factor is: "+min);

    
    /* System.out.println("_______________________________");

     int num1=33,num2=3, num3=6,end=2 , min=0;
     int start = num1<num2 ? num1<num3 ? num1 : num3 : num2<num3 ? num2 : num3;
     System.out.println("The factors of "+num1+" ,"+num2+" ,"+num3+" are:");
     while(start>=end)//6>=2t
     {
       if(num1%start==0 && num2%start==0)//3%6==0f
       {
         System.out.println(start);
         min = start;
       }
       start--;
     }
     System.out.println("least common factor is: "+min); */
    
    
   }

}