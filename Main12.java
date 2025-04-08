class Main12
{
   static public void main(String args[])
   {
      Sub s = new Sub();
      s.display();
      
    }
    public static void main(int x)
   {
      System.out.println("main method with int");
   }
}

class Super 
{
  static int x;
  Super()
  {
    this.x=11;
  }
  static void display()
  {
    System.out.println("this is super display method ");
  }
  /*public static void main(String args[])
  {
     System.out.println("overriden main method");
   }*/
}
class Sub extends Super
{
  int x;
  Sub()
  {
    this.x=100;
  }
   void display()
  {
    //static int y=12;
    System.out.println("this is sub display method "+super.x);
  }
  static void display(int x)
  {
    System.out.println("this is sub display method with int ");
  }

}
