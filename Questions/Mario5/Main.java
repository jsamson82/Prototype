package Questions.Mario5;
import java.util.Scanner;
/* Mario is ready to go to work now but needs his hammer. He needs YOUR help to get the hammer. 
create a while loop so that the program will continue to ask the user to pick up the hammer
until the user types the input "p".*/
public class Main {
    public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Pick up hammer (p to pickup): ");
    String input = sc.nextLine();
    
    //Create a while loop here
    {
      System.out.println("Pick up hammer (p to pickup): ");
      input = sc.nextLine();
    }
    
    System.out.println("Mario has picked up his hammer!");
  }
}
/* If you are struggling think about how the code should continuously
ask the user for the expected input until that input is typed in. */