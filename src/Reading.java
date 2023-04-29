import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("Digit your favorite movie");
        String movie = reading.nextLine();
        System.out.println("What was the release year? ");
        int releaseYear = reading.nextInt();
        System.out.println("Rate the movie ");
        double movieRating = reading.nextDouble();

        System.out.println(movie);
        System.out.println(releaseYear);
        System.out.println(movieRating);
    }
}