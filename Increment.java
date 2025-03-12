class Increment
{
   public static void main(String args[])
   {
    //pre-increment
    int i = 1;// first i gets increment by 1 : i = 2
    int j = ++i;// i = 2 is assigned to j
    System.out.println("i is "+i+"\n j is "+j);

    //post-increment
    int x = 1;// 
    int y = x++;
    System.out.println("x is "+x+"\n y is "+y);



   }
}