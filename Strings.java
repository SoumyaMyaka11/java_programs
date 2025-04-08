class Strings
{
   public static void main(String args[])
   {
      String s1 = "soumya",s2="soumya";
      /*String s3 = new String("Keerthi");
      String s4 = new String("harshu");
      System.out.println("s1 "+s1+" "+System.identityHashCode(s1));
      System.out.println("s2 "+s2+" "+System.identityHashCode(s2));
      System.out.println("s3 "+s3+" "+System.identityHashCode(s3));
      System.out.println("s4 "+s4+" "+System.identityHashCode(s4));
      System.out.println();
      s3.concat(" harshika");
      System.out.println("s3 "+s3+" "+System.identityHashCode(s3));
      System.out.println(s1==s2);  
      System.out.println(s1.equals(s2));
      System.out.println(s1.concat(s3));
      System.out.println(s1+s3);*/
      StringLength obj = new StringLength();
      System.out.println("length is "+obj.calStringLength(s1));
      obj.sortString(s1); 
   }
}

class StringLength
{
   int calStringLength(String str)
   {
      int length=0;
      for(int x=0; x<str.length(); x++)
      {
          length++;
       }
       return length;
    }
    void sortString(String str)
    {
        String s1 ="";
        for(int x=0; x<str.length(); x++)
        {
           for(int y=x+1; y<str.length(); y++)
           {
              if(str.charAt(x)>str.charAt(y))
              {
                 char c = str.charAt(x); 
                 str.charAt(x) = str.charAt(y);
                 str.charAt(y) = c;
              }
           }
        }
        System.out.println(s1);
    }
}