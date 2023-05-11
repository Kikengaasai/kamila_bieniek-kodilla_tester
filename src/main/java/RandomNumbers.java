import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        Random liczba = new Random();
        int losowanie = liczba.nextInt(31);

        int sum = 0;
        for (int i = 0; i < 1000; i++) {

            sum = sum + losowanie;

            if (sum >5000){
                System.out.println("przekracza 5000");


            }
        }


    }}