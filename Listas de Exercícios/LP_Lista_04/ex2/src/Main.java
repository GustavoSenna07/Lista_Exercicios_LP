import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,n3,n4,n5,bigger, smaller, number;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite 5 numeros ");

        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();
        n4 = in.nextInt();
        n5 = in.nextInt();

        bigger = n1;
        smaller = n1;

        for(int i = 2; i <= 5; i++) {
            if(i == 2){
                number = n2;
            }
            else if (i == 3) {
                number = n3;
            }
            else if (i == 4) {
                number = n4;
            }
            else {
                number = n5;
            }

            if (number >= bigger) {
                bigger = number;
            }

            if (number <= smaller) {
                smaller = number;
            }
        }

        System.out.println("O maior numero Digitado é: " + bigger);
        System.out.println("O menor numero Digitado é: " + smaller);
    }
}