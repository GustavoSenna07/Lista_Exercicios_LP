import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double score1, score2, mean;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a Primeira nota: ");
        score1 = in.nextDouble();

        System.out.println("Digite a Segunda nota");
        score2 = in.nextDouble();

        mean = (score1 + score2) / 2;
        System.out.println("Media= " + mean);
    }
}