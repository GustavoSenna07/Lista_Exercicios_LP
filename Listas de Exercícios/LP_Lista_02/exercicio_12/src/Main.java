import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, score;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira Nota: ");
        n1 = in.nextDouble();

        System.out.println("Digite a Segunda Nota: ");
        n2 = in.nextDouble();

        score = (n1 + n2*2)/3;
        System.out.println("Sua nota média é: " + score);
    }
}