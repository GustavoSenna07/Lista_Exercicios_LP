import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double l1, l2, l3;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite qualquer numero: ");

        l1 = in.nextDouble();
        l2 = in.nextDouble();
        l3 = in.nextDouble();

        if(l1 == l2 && l1 == l3) {
            System.out.println("O triangulo é Equilatero");
        }
        else if(l1 == l2 || l2 == l3) {
            System.out.println("O triangulo é Isosceles");
        }
        else {
            System.out.println("O triangulo é Escaleno");
        }
    }
}