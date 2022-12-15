package Questions.Mario4;
/* Now, Mario wants to count from 1 to 26 AGAIN but this time
notice how the format of this code it different than the
previous code you have seen. A while loop is used to acheive the same outcome
that a for loop can acheive. In some senarios it is better to use one over the other.
As a general guideline, a for loop is better for a set number of iterations, while a 
while loop is better for iterating continously until a condition is changed. 
Modify the code so that mario counts from 1-26.
*/
public class Main {
    public static void main(String[] args)
  {
    int i = 1;
    while (i < 25)
    {
      System.out.println(i);
      i += 1;
    }
  }  
}
/*If you are struggling, click run to see what is printed 
out and then modify the code to the desired outcome. */