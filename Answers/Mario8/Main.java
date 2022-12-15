package Answers.Mario8;

public class Main {
    public static void main(String[] args){
        boolean marioIsAlive = true;
        int randomNum = 0;
    while(marioIsAlive == true){
        randomNum =(int)(Math.random()*3+1);
            if(randomNum ==1){
        marioIsAlive =true;
        System.out.println("Mario walked left and is safe!");
        break;
            }
            else if(randomNum ==2){
        System.out.println("Mario jumped and is safe!");
        marioIsAlive = true;
        break;
            }
            else if(randomNum ==3){
        marioIsAlive = false;
        System.out.println("Mario walked right, fell into fire and died");
            }
       }
       System.out.println("The action has been completed");

    }
}
 
