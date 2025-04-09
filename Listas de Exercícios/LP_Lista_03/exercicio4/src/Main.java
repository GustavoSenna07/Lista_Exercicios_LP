import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double score1, score2, mean, recovery;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite aqui o Valor das Notas: ");
        score1 = in.nextDouble();
        score2 = in.nextDouble();

        mean = (score1 + score2)/2;
        System.out.println("Media = " + mean);

        if(mean >= 5) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Informe a nota da Recuperação");
            recovery = in.nextDouble();

            mean = (mean + recovery)/2;

            if(mean >= 5)
                System.out.println("Aprovado");
            else
                System.out.println("Repovado");
        }
    }
}