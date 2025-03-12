class Grade
{
  public static void main(String args[])
  {
   int s1=60, s2=60, s3=60;;
   int total_marks = (s1+s2+s3);
   double max_marks = 300;
   double percentage;
   percentage = total_marks/max_marks*100;
   
   if(percentage<35)
   {
     System.out.println("fail");
   }
   else if(percentage<55)
   {
     System.out.println("pass");
   }
   else if(percentage<65)
   {
     System.out.println("B grade");
   }
   else if(percentage<75)
   {
     System.out.println("B+ grade");
   }
   else if(percentage<85)
   {
     System.out.println("A grade");
   }
   else if(percentage<95)
   {
     System.out.println("A+ grade");
   }
   else
   {
     System.out.println(" O grade");
    }
 }
}