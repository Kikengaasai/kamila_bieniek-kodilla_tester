import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SwitchExerciseUserDialog {


    public static String getLetter() {
        Scanner scanner = new Scanner(System.in);
        String letter = "";
        while (true) {
            System.out.println("Enter first letter of color:(B - Black, R - Red, W - White, G - Green, Y - Yellow)");
            letter = scanner.nextLine().trim().toUpperCase();
            if (letter.length() != 1) {
                System.out.println("Write one letter. No zero, no more than one, just one.");
            }else if (!checkLetter(letter)){
                System.out.println("Wrong letter");
            }
            else {
                return letter;
            }

        }


    }

    public static boolean checkLetter(String letter){
        List<String> allowedLetters= Arrays.asList("B","R","W","G","Y");
        return allowedLetters.contains(letter);

    }
}








