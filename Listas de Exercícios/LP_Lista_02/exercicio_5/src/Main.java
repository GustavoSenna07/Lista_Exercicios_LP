import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km_h, m_s;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a Velocidade em km/h: ");
        km_h = in.nextDouble();

        m_s = km_h/3.6;
        System.out.println(km_h + "km/h = " + m_s + "m/s");
    }
}