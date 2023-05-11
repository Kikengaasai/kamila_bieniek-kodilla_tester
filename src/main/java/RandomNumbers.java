import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        Random liczba = new Random();


        int sum = 0;
        int min = 30;
        int max = 0;
        while (sum < 5000) {

            int losowanie = liczba.nextInt(31);
            sum = sum + losowanie;

            if (losowanie < min) {
                min = losowanie;
            }
            if (losowanie > max) {
                max = losowanie;
            }

        }
        System.out.println(min);
        System.out.println(max);
    }


}