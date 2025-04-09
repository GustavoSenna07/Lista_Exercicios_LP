import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n,sqrt;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite aqui um Numero real: ");
        n = in.nextDouble();

        if(n >= 0) {
            sqrt = Math.sqrt(n);
            System.out.println("A Raiz Quadrada de N é " + n);
        }
        else {
            System.out.println("Não existe Raiz Quadrada de Numeros negativos");
        }

    }
}