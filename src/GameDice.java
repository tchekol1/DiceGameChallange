import java.util.Random;
import java.util.Scanner;

public class GameDice {
   /*
   Create the Scanner object
   Create a Random number object using the new key word
   while(play equals yes)
   call the nextInt Random number method and gives 1 and 6 as starting number and bound
    roll1=1+nextInt(6)
    roll2 1+nextInt(6)
    if(roll1 and roll2 ==1)
    add 25 to the score
    else if(either of the two rolls is 1)
    nothing added to your score

    ask the user if he/she want to continue
    if(score >=100)
    break/stop the game and tell the user the score is above 100
    else
    continue the game
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String play="yes";
        Random random= new Random();
        int number,number2;
        int score=0;
        System.out.println("Welcome! Let's Play Roll Dice!");
        while(play.equals("Yes")||play.equals("yes")){
    number=1+random.nextInt(6);
    number2=1+random.nextInt(6);
    if(number2==1 &&number>1||number2>1 &&number==1){

    }
    else if(number==1&&number2==1){
        score+=25;
    }
    else
        score+=number+number2;
    System.out.println("Your rolls "+ number+" & "+number2);
    System.out.println("Score: "+ score);
    System.out.println("Roll again ?");
    play=scanner.nextLine();
    if(score>=100){
        break;
    }

}
if(score >100){
    System.out.println("You have scored over 100");
}
else
    System.out.println();
    System.out.println("Thank you for playing!");

    }
}
