import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double c, f;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a Temperatura em °C: ");
        c =in.nextDouble();

        f = c * 180/100+32;
        System.out.println(c + "°C = " + f + "°F");
    }
}