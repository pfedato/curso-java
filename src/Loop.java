import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        double averageGrade = 0;
        double grade = 0;


        for (int i = 0; i < 3; i++) {
            System.out.println("Rate the movie ");
            grade = reading.nextDouble();
            averageGrade += grade;
        }

        System.out.println("The movie rating is " + averageGrade /3);

    }
}
