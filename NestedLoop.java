import java.util.Scanner; 
class NestedLoop
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      int secret_number = 4;
      int guess;
      do{
          System.out.println("Guess the number between 1 and 5");
           guess = s.nextInt();
          if(guess!=secret_number)
                System.out.println("Wrong guess. Try again!");
                
        }while(guess!=secret_number);

         System.out.println("Congratulations! You guessed the correct number.");
    }
}
  