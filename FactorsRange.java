import java.util.Scanner;
class FactorsRange
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter start range of factors:");
    int x = s.nextInt();
    System.out.println("Enter end range of factors:");
    int n = s.nextInt();
   for(int i=x; i<=n; i++)
   {
     	int num =i,e_sum=0,o_product=1;
     	System.out.println("The factors of "+num+" are ");
       	for(int start=1; start<=num; start++)
       	 {
             if(num%start==0)  
             {    
      		System.out.println(start+" ");
                if(start%2==0)
		      e_sum+=start;
    	         else
		      o_product*=start;
     	     }
           		
       	}
      System.out.println("The even factors sum is "+e_sum);
      System.out.println("The odd factors product is "+o_product);
    }
  }
}
         