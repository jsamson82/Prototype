package Answers.Mario5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Pick up hammer (p to pickup): ");
    String input = sc.nextLine();
    
    while (!input.equals("p"))
    {
      System.out.println("Pick up hammer (p to pickup): ");
      input = sc.nextLine();
    }
    
    System.out.println("Mario has picked up his hammer!");
  }
}
