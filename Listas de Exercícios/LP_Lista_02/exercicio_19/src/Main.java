import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite os Valores de a, b e de c separados por espaço: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        delta = Math.pow(b, 2) -4*a*c;
        x1 = (-b+Math.sqrt(delta))/(2*a);
        x2 = (-b-Math.sqrt(delta))/(2*a);

        System.out.println("O Valor de X1 é: " + x1 + ", e o Valor de X2 é de: " + x2);
    }
}