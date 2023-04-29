import java.util.Scanner;

public class AnotherLoop {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        double averageGrade = 0;
        double grade = 0;
        int gradeTotal = 0;

        while (grade != -1) {
            System.out.println("Rate the movie or -1 for finish ");
            grade = reading.nextDouble();

            if(grade != -1) {
                averageGrade += grade;
                gradeTotal++;
            }
        }

        System.out.println("The movie rating is " + averageGrade /gradeTotal);

    }
}
