import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int enesimo, nextNumber, tempNumber = 1, currentNumber = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o enésimo termo: ");
        enesimo = in.nextInt();

        for (int i = 1; i <= enesimo; i++) {
            nextNumber = currentNumber + tempNumber;
            currentNumber = tempNumber;
            tempNumber = nextNumber;
            System.out.println(currentNumber);
        }
    }
}