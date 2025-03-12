import java.util.Scanner;
class ArmstrongRange
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number");
    int num = s.nextInt();
    int count=0,temp=num,rem=0,rev=0;
    do{
       count++;
       num = num/10;
      }while(num!=0);
    System.out.println(count);
    num=temp;
    do{
       rem = num%10;
       int power = (int)(Math.pow(rem,count));
       rev = rev + power;
       num = num/10;
     }while(num!=0);

     if(rev==temp)
         System.out.println(temp+" is a armstrong number");
     else
         System.out.println(temp+" is not a armstrong number");
  }

}
   
       