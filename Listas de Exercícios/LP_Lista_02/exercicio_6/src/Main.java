import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km_h, m_s;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a Velocidade em m/s: ");
        m_s = in.nextDouble();

        km_h = m_s*3.6;
        System.out.println(m_s + "m/s = " + km_h + "km/h = ");
    }
}