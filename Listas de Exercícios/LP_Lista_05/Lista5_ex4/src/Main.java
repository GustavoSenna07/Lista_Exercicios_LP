import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numbers = new int[10];

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite un numero: ");
            numbers[i] = in.nextInt();
        }

        for (int list:numbers) {
            System.out.print(list);
        }
    }
}