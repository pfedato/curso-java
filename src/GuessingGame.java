import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        int correctNumber = new Random().nextInt(100);
        System.out.println(correctNumber);
        int attemptNumber;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your attempt:");
            attemptNumber = reading.nextInt();

            if (attemptNumber == correctNumber){
                System.out.println("Correct!");
                break;

            } else if (i < 4){
                System.out.println("Try again.");
            } else {
                System.out.println("Number of attempts has been exhausted!");
            }
        }
    }
}
