public class DebugExample {
    public static void main(String[] args) {
        int firstNumber = 22;
        int secondNumber = 10;

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        if (firstNumber > secondNumber) {
            subtractAndDisplay(firstNumber, secondNumber);
        } else {
            sumAndDisplay(firstNumber, secondNumber);
        }
    }

    private static void sumAndDisplay(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;

        System.out.println(result);
    }

    private static void subtractAndDisplay(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;

        System.out.println(result);
    }
}