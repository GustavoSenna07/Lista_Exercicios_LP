import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite um numero inteiro: ");
        factorial();
    }

    public static void factorial() {
        double n, result = 1;
        Scanner in = new Scanner(System.in);

        n = in.nextDouble();

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        System.out.println("O valor do Fatorial de !" + n + " é = " + result);
    }
}