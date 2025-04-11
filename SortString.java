class SortString
{
   public static void main(String args[])
   {
      String s = "hello";
      char ch[] = s.toCharArray();
      for(int x=0; x<ch.length-1; x++)
      {
          for(int y=x+1; y<ch.length; y++)
          {
             if(ch[x]>ch[y])
             {
                char temp = ch[x];
                ch[x] = ch[y];
                ch[y] = temp;
             }
          }
       }
        for(char t:ch)
              System.out.println(t);
    }
}
     

            