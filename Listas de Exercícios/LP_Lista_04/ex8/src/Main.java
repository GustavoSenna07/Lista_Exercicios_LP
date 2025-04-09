import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, check = 0;
        boolean isPrimo = false;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite qualquer Numero inteiro: ");
        number = in.nextInt();

        for(int i = 1; i <= number; i++) {
            if(number % i == 1) {
                check += 1;
            }
        }

        if (check == 1) {
            isPrimo = true;
        }

        else {
            isPrimo = false;
        }

        if(number <= 1) {
            System.out.println("O numero " + number + " não é um Numero Primo");
        }
        else {
            if (isPrimo == false) {
                System.out.println("O numero " + number + " é um Numero Primo");
            }
            else {
                System.out.println("O numero " + number + " não é um Numero Primo");
            }
        }
    }
}