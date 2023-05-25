public class SwitchExerciseColours {

    public static String colours() {
        String userSelected = SwitchExerciseUserDialog.getLetter();

        switch (userSelected) {

            case "B":
                return "Black";
            case "R":
                return "Red";

            case "W":
                return "White";

            case "G":
                return "Green";

            case "Y":
                return "Yellow";

            default:
                return "Wrong letter. Try again.";

        }

    }
}