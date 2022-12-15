package Questions.Mario7;
/*Look at this code and predict what will happen if the code is run. Now run the code and observe the output.
 Since the while loop is true and there is nothing in the code that will change the condition, the code will 
 continuously run forever. This is a common problem with a while loop that all coders need to be cautious of 
 when they are creating code so that their code runs propery and does not eat up storage.
 There is nothing else to do in this code.
 */
public class Main {
    
        public static void main(String[] args)
        {
          int i = -5;
          while (i < 0)
          {
            System.out.println(i);
            i -= 1;
          }
          System.out.println("Output finished.");
        }
        

}
