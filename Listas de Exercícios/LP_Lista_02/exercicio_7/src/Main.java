import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double milimetros, polegadas;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o Tamanho em Milimetros: ");
        milimetros = in.nextDouble();

        polegadas = milimetros/25.4;
        System.out.println("O Valor em Polegadas é de: " + polegadas);
    }
}