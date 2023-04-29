public class Main {
    public static void main(String[] args) {
        System.out.println("This is Screen Match!");
        System.out.println("Movie: Top Gun Maverick");

        int yearLaunch = 2022;
        System.out.println("Year launch: " + yearLaunch);
        boolean includedInThePlan = true;
        double movieRating = 8.1;
        // média das 3 notas
        double average = (9.8 + 6.3 + 8.0) /3;
        System.out.println(average);
        String synopsis;
        synopsis = """
                Movie Top Gun
                Adventure movie with 80's years star.
                Very Good!
                Year launch
                """ + yearLaunch;
        System.out.println(synopsis);

        int rating = (int) (average /2);
        System.out.println(rating);
    }
}