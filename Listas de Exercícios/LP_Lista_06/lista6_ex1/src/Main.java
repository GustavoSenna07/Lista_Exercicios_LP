import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite um numero inteiro positivo Maior que 0: ");
        soma();
    }

    public static void soma() {
        int n, resultado = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        if(n > 0) {
            for (int i = 0; i <= n; i++) {
                resultado += i;
            }

            System.out.println("A soma dos numeros de 1 até " + n + " é de = " + resultado);
        }

        else {
            System.out.println("Numero incompativel");
            soma();
        }
    }
}