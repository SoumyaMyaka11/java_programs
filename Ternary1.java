class Ternary1
{
   public static void main(String args[])
    {
     int age = 35;
     String gender = "female";
     String deg = "UG";
     String result = age<0 ? "age is negative" : age<18 ? "your are not eligible for scholarship and retirement policy" :  age<=60 ?  deg=="UG" ? "scholarship is 30000" : deg=="PG" ? "scholarship is 40000" : "scholarship is 20000" : age<=100 ?   gender=="f" ? "scholarship is 30000" : "scholarship is 35000"  : " invalid input since age is above 100 " ;
     System.out.println(result);
   
    }
}