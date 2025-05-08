import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        versão Gustavo

        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int userNumber, check = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        userNumber = in.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if(userNumber == numbers[i]) {
                check++;
            }
        }

        if(check == 1) {
            System.out.println("O numero " + userNumber + " esta na lista");
        }
        else {
            System.out.println("O numero " + userNumber + " não esta na lista");
        }
        */

        int [] vetor = {2, 4, 6, 3, 9, 0, 23, 87};
        int n;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        n = in.nextInt();

        for (int i = 0; i < vetor.length ; i++) {
            if(vetor[i]==n) {
                System.out.println(n + " Encontrado na posição " + i);
                return;
            }
        }

        System.out.println("Valor não encontrado");
    }
}