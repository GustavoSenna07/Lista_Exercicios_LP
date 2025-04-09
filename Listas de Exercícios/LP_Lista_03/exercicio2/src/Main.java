import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite dois Numeros inteiros separados por espaço: ");
        n1 = in.nextInt();
        n2 = in.nextInt();

        if(n1 > n2)
            System.out.println(n1 + " Maior que " + n2);
        else if (n1 == n2)
            System.out.println(n1 + " Igual a " + n2);
        else
            System.out.println(n1 + " Menor que " + n2);
    }
}