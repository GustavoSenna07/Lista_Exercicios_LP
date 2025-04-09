import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double b, c, x1, x2;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor da Primeira Raiz (X1): ");
        x1 = in.nextDouble();

        System.out.println("Digite o valor da Segunda Raiz (X2): ");
        x2 = in.nextDouble();

        b = -x1 - x2;
        c = -x1 * -x2;

        System.out.println("x^2 + " + b + "x +" + c + " = 0");
    }
}