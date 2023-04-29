import java.util.Objects;

public class Conditional {
    public static void main(String[] args) {
        int yearLaunch = 1986;
        boolean includedInThePlan = true;
        double movieRating = 8.1;
        String planType = "normal";

        if (yearLaunch >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (includedInThePlan == true || planType.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
