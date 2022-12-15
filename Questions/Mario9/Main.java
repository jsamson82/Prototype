package Questions.Mario9;
/*Look at the code below and predict what will happen.
 *Notice how a while loop is contained inside of a for loop
 *This is an example of a nested loop
 *nested loops are loops that contain multiple loops inside of eachother
 *The advantage of nested loops is that for each single iteration of the outside loop,
 * the full inside loop will run through
 * There is nothing that needs to be changed on this activity
 */
public class Main {
    public static void main(String[] args)
  {
    int numberOfRows = 7;
    int value = 1;
  
    for (int row = 1; row <= numberOfRows; row++)
    {
      while (value <= row)
      {
        System.out.print(value + " ");
        value += 1;
      }
      System.out.println();
      value = 1;
    }
  }
}
/*credit for the code above is given to PLTW computer science avtivity 2.4.4.
 *The code is used as a example of a nested loop and has not been modified.
 */