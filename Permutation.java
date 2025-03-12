class Permutation
{
  public static void main(String args[])
  {
     int n=5, r=3, nr= n-r;
     int nproduct = 1 ;
     int start = n, end = 1;
     while(start>=end)//5>=1t 4>=1t 3>=1t 2>=1t 1>=1t 0>=1f
     {
      nproduct = nproduct*start;//1*5=5 5*4=20 20*3=60 60*2=120 120*1=120
      start--;//4 3 2 1 0
     }
     int nrproduct = 1;
     start = nr;
     while(start>=end)//2>=1t 1>=1t 0>=1f
     {
       nrproduct = nrproduct*start;//1*2=2 2*1=2
       start--;//1 0
     }
    System.out.println(n+"p"+r+" is " + (nproduct/nrproduct) );
  }
}
   