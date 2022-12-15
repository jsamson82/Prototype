package Answers.Mario10;

public class Main {
    public static void main(String[] args) {

        int weeks = 4;
        int days = 7;
        int i = 1;
    
        // outer loop
        while (i <= weeks) {
          System.out.println("Week: " + i+"__");
    
          // inner loop
          for (int j = 1; j <= days; j++) {
            System.out.println("  Days: " + j+"__");
          }
          i++;
        }
      }
}
/*Credit for the idea of using weeks and days to show nested loops is given to programiz.com.
*/
