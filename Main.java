import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        String[] word = { "C", "O", "M","P", "U", "T", "E", "R" };
        String[] guessWord = { "_" ,"_" ,"_" ,"_" ,"_" ,"_" ,"_" ,"_" ,};
        System.out.println("Guess the word below:");
        System.out.println(Arrays.toString(guessWord));
        int index = 0;
        boolean looped = false;
        boolean right = false;
        while(true){
            if (looped){
                if (right){
                    System.out.println("Your answer was right, good job!\n Now try to find out the other letters.");
                    System.out.println(Arrays.toString(guessWord));
                }
                if (!right){
                    System.out.println("Your answer was wrong, it's fine.\n Now try again.");
                    System.out.println(Arrays.toString(guessWord));
                }
            }
            System.out.print("Input a letter that you think is in this word: " );
            looped = true;
            right = false;
            String input = scan.nextLine();

            for (String y : word) {
                for (int i=0;i<=7;i++) {
                    if (word[i].equals(input)) {
                        index = i;
                    }
                }
                if (input.equals(y)) {
                    right = true;
                    guessWord[index] = word[index];
                    break;
                }
            }
            if(Arrays.equals(guessWord,word)){
                System.out.println("Great job! You guessed the word!");
                System.out.println("The answer was " + Arrays.toString(word));
                break;
            }
        }
        }
    }