import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2;

        Scanner in = new Scanner(System.in);
        System.out.print("Digite dois numeros inteiros em order crescente: ");
        n1 = in.nextInt();
        n2 = in.nextInt();

        System.out.println("Os numeros entre " + n1 + " e " + n2 + " são: ");
        while(n1 < n2-1) {
            n1++;
            System.out.println(n1);
        }
    }
}