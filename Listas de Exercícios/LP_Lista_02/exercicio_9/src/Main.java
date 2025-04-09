import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km, milha;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a Distancia em km: ");
        km = in.nextDouble();

        milha = km/1.6;
        System.out.println("A Distancia em milha é de: " + milha);
    }
}