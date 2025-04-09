import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double score1, score2, mean;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite aqui o Valor das Notas: ");
        score1 = in.nextDouble();
        score2 = in.nextDouble();

        mean = (score1 + score2)/2;
        System.out.println("Media = " + mean);

        System.out.println(mean >= 5?"Aprovado":"Reprovado");

        /*
        if(mean >= 6)
            System.out.println("Sua Média foi: " + mean + ", Você foi Aprovado");
        else
            System.out.println("Sua Média foi: " + mean + ", Você foi Reprovado");

         */
    }
}