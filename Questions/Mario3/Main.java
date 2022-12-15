package Questions.Mario3;
/*Mario likes to eat at least 4 bananas each day.
Modify the code so that mario consumes exactly 4 bananas today.
Notice how the the variable in the loop can have any declared name and
how the less than sign was used rather that the less than or equal too sign.
Also notice how "if else" statements can be contained inside of the loop. */
public class Main {
    public static void main(String[] args){
        for(int bananas = 0; bananas<0;bananas++){
            if(bananas == 1){
                System.out.println("Mario has consumed " +bananas+ " banana");
            }
            else{
                System.out.println("Mario has consumed " +bananas+ " bananas");
            }
        }

    }
}
