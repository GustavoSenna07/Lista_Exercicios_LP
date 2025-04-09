import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;

        Scanner in = new Scanner(System.in);

        System.out.println("--------------------" +
                "\n MENU" +
                "\n Escolha uma das opções Abaixo" +
                "\n 1. Segunda-Feira" +
                "\n 2. Terça-Feira" +
                "\n 3. Quarta-Feira" +
                "\n 4. Quinta-Feira" +
                "\n 5. Sexta-Feira" +
                "\n 6. Sabado" +
                "\n 7. Domingo" +
                "\n --------------------");
        System.out.println("Escolha uma opção: " +
                "\n --------------------");
        option = in.nextInt();

        switch(option) {
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Valor invalido");
                break;
        }
    }
}