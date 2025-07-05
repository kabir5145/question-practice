import java.util.Random;
import java.util.Scanner;

public class game_java {
    public static void main(String[] args) {
                  //0 for rock
                  //1 for scissor
                  //2 for paper
        Scanner s =new Scanner(System.in);
        System.out.println("the game is of rock ,paper and scissor ");
        System.out.println("put 0 for rock;put 1 for scissor and 2 for paper");
        int userInput = s.nextInt();

        Random num = new Random();
        int computerInput = num.nextInt(3);
        if(computerInput ==userInput){
            System.out.println("oops!");
            System.out.println("There is a draw");
        }
        else if(userInput ==0 && computerInput==1||userInput==1 && computerInput==2||userInput==2&&computerInput==0){
            System.out.println("Congrats!");
            System.out.println("You win the game ");
        }
        else {
            System.out.println("You loss the game ");
            System.out.println("well try ");
        }
        System.out.println("computer choice was :"+computerInput);

    }
}
