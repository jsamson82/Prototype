package Questions.Mario8;
/*Mario finally arrives at work at Mario Brothers Plumbing in Brooklyn, 
Since mario is 5’1 he is able to get into the pipes to clean them. 
The pipe looks different today though, he decides to enter the pipe 
and comes out into the unfamiliar world of Mushroom Kingdom. He notices 
that everything seems different in this world and wants to explore!
He can either go left, up, or right. Modify the code so that it does not 
continuously loop through the while loop.
 */
public class Main {
    public static void main(String[] args){
        boolean marioIsAlive = true;
        int randomNum = 0;
    while(marioIsAlive = true){
        randomNum =(int)(Math.random()*3+1);
            if(randomNum ==1){
        marioIsAlive =true;
        System.out.println("Mario walked left and is safe!");
        
            }
            else if(randomNum ==2){
        System.out.println("Mario jumped and is safe!");
        marioIsAlive = true;
        
            }
            else if(randomNum ==3){
        marioIsAlive = false;
        System.out.println("Mario walked right, fell into fire and died");
            }
       }
       System.out.println("The action has been completed");

    }
}
/* If you are struggling consider using the break command. 
Additionally, it may be helpful to look over the boolean 
expression inside of the while loop. */